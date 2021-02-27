alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select b.title
 from book b
 where b.book_id = (select br.book_id from book_rental br
 group by br.book_id
 having count(br.book_id) = (select max(count(br.book_id))
 from book_rental br
 group by br.book_id));
