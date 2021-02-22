alter session set current_schema=bank;
SET heading OFF;
select  s.account_no,c.cust_id,c.cust_fname,c.cust_lname,ct.cust_phone
from bank_sb_account s,bank_customer c,bank_cust_contact ct
where ( c.cust_id = s.primary_cust_id or c.cust_id = s.secondary_cust_id) and
s.primary_cust_id is not null and s.secondary_cust_id is not null and c.cust_id = ct.cust_id and
ct.contact_type like '%HOME%';
