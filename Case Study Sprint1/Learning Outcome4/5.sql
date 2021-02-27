alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select first_name
 from user_details
 where first_name like '%Anjali%' or first_name like '%Aditi%';
