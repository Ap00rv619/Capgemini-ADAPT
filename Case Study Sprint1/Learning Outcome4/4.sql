alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select * from (select u.first_name , count(br.rental_id) as total
 from book_rental br join user_details u
 on br.user_id = u.user_id
 group by u.first_name
 order by total desc)
 where rownum <=3;
 
