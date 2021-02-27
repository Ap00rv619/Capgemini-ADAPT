alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select *
 from user_details
 where first_name='Rakesh'or first_name='Rajan'
 order by user_id desc;
