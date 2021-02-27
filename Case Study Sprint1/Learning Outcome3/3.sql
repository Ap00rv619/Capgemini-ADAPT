alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select u.first_name,book.title,b.rental_end_date
 from user_details u inner join book_rental b
 on u.user_id = b.user_id
 inner join book book
 on book.book_id = b.book_id
 where rental_end_date is not null;
