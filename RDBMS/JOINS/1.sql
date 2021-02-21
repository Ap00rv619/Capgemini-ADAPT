alter session set current_schema=bank;
SET heading OFF;
select cust.cust_id ,
cust.cust_fname ,
cust.cust_lname ,
cont.cust_phone ,
cont.cust_city 
from bank_customer cust inner join bank_cust_contact cont
on cust.cust_id = cont.cust_id
where cont.cust_state not like '%Karnataka%' and cont.contact_type like '%HOME%';
