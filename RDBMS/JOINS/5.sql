  
alter session set current_schema=bank;
SET heading OFF;
select b.cust_id,b.cust_fname,
case
    when rd.account_no is null then 'NA'
    else to_char(rd.account_no)
end as account_no,
case
    when rd.installment_amt is null then 'NA'
    else to_char(rd.installment_amt)
end as installment_amt
from bank_customer b left join
bank_rd_account rd
on b.cust_id = rd.rd_cust_id;
