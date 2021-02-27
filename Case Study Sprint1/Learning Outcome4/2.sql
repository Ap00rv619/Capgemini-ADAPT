alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select*
 from (select b.title 
 from book b , book_rental br
 where br.book_id = b.book_id
 order by(rental_end_date - rental_start_date) asc)
 where rownum = 1;
