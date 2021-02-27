alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select u.first_name , b.title , br.rental_start_date , br.rental_end_date
 from book_rental br right outer join user_details u 
 on u.user_id = br.user_id
 left outer join book b
 on br.book_id = b.book_id
 order by u.first_name asc;
