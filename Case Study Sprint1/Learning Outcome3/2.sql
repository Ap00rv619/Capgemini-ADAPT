alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select*
 from user_details
 where user_id in(select user_id
 from book_rental
 where to_char(rental_start_date,'Mon-YYYY') ='Dec-2020');
