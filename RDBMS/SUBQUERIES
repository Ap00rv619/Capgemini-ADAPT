alter session set current_schema=bank;
SET heading OFF;
select f.account_no,c.cust_fname,c.cust_lname
from bank_fd_account f,bank_customer c
where c.cust_id = f.cust_id and
(f.initial_amt = (select max(initial_amt) from bank_fd_account group by c.cust_lname) or
f.initial_amt = (select min(initial_amt) from bank_fd_account group by c.cust_lname));
