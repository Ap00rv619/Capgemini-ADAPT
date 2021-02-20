alter session set current_schema=bank;
SET heading OFF;
SELECT DESIGNATION,COUNT(BANK_EMP_ID) AS EMP_COUNT
FROM BANK_EMPLOYEE
WHERE DESIGNATION NOT LIKE '%ATT%'
GROUP BY DESIGNATION
ORDER BY COUNT(BANK_EMP_ID), DESIGNATION;
