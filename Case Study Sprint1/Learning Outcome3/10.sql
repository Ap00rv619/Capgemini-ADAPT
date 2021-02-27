alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select * 
 from (select u.first_name , u.city , sum(br.total_amount) as total_rent_amount
 from user_details u, book_rental br
 where u.user_id = br.user_id and to_char(rental_start_date,'Mon-YYYY') = 'Dec-2020'
 group by u.first_name , u.city
 order by sum(br.total_amount) desc)
 where rownum <= 1 ;
