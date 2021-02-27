alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select*
 from book where book_id =(select book_id
 from book_rental group by book_id having count(*) = (select * from (select count(*) from book_rental
 group by book_id order by count(*)desc)where rownum=1));
