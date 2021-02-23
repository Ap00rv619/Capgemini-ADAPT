alter session set current_schema=bank;
SET heading OFF;
select account_no
from bank_sb_account
where not exists(select trans_no from bank_transaction where account_no = trans_acc_no);
