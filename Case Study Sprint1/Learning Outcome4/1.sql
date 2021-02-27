alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select * 
 from (select to_char(rental_start_date,'Month'),count (book_id) as total_books
 from book_rental
 group by to_char(rental_start_date,'Month')
 order by count(book_id) desc)
 where rownum = 1;
