alter session set current_schema=bank;
SET heading OFF;
select b.cust_id, b.cust_fname
from bank_customer b
where b.cust_id not in (
    select c.cust_id 
    from bank_cust_contact c
    where b.cust_id = c.cust_id and contact_type = 'OFFICE'
) and b.cust_type = 'IND';
