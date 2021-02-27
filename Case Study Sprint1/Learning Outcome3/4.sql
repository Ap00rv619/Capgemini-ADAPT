alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select first_name 
 from user_details
 where user_id in (select * from(select user_id
 from book_rental
 group by user_id order by count(*) desc)
 where rownum=1);
