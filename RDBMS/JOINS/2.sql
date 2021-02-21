alter session set current_schema=bank;
SET heading OFF;
select s.account_no,t.trans_type,t.trans_dt,t.trans_desc,t.trans_amt
from bank_sb_account s inner join bank_transaction t
on s.account_no = t.trans_acc_no
where t.trans_amt > 1000
order by s.account_no asc,t.trans_type asc,t.trans_dt asc;
