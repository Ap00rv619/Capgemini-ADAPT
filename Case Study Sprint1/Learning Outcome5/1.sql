alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select * 
 from book_rental 
 where book_id = (select book_id from book where title like '%Machine%'); 
