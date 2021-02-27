alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select u.first_name , b.title , br.rental_end_date
 from user_details u inner join book_rental br
 on u.user_id = br.user_id
 inner join book b
 on b.book_id=br.book_id
 where to_char(br.rental_start_date,'DD-MM-YYYY')='25-11-2020';
