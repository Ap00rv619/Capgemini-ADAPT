alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select *
 from book_rental 
 where user_id in(select user_id 
 from user_details
 where first_name like '%Chandrav%');
