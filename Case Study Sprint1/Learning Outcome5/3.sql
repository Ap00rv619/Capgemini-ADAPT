alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select title 
 from book b
 where b.book_id not in (select book_id from book_rental br
 where b.book_id = br.book_id);
