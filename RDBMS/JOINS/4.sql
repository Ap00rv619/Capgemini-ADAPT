alter session set current_schema=bank;
SET heading OFF;
select e.bank_emp_id,e.emp_name,e.designation,t.trans_desc
from bank_employee e left join bank_transaction t
on e.bank_emp_id = t.bank_emp_id 
where e.designation like '%MANAGER%' or e.designation like '%ASST.%MGR.%';
