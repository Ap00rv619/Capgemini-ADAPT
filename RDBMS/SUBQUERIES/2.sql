alter session set current_schema=bank;
SET heading OFF;
select *
from bank_transaction
where trans_acc_no in
    (select account_no
    from bank_rd_account 
    where  rd_cust_id in(select cust_id from bank_cust_contact
        where upper(cust_state) like '%TAMILNADU%')
    );
