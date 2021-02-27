alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select * 
 from book
 where book_id in(select book_id
 from book_rental
 where rental_start_date = '20-Nov-2020');
