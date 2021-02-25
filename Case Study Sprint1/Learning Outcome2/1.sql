alter session set current_schema = bookrental;
SET heading OFF
/*
 * Enter your query below.
 * Please append a semicolon ";" at the end of the query
 */
 select *
 from book
 where (rent_per_day * 31) < 500 or (rent_per_day * 30) < 500;
