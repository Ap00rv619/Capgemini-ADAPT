alter session set current_schema=bank;
SET heading OFF;
select *
from bank_employee
where upper(designation) not like '%ATTENDER%' and
bank_emp_id not in (
    select bank_emp_id
    from bank_transaction
);
