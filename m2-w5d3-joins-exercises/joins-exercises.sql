-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT *
FROM film_actor af
JOIN actor a ON af.actor_id=a.actor_id
JOIN film f ON a.actor_id=f.film_id
WHERE first_name='NICK' AND last_name = 'STALLONE';
-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT f.title
FROM film f
JOIN film_actor af ON f.film_id=af.film_id
JOIN actor a ON af.actor_id=a.actor_id
WHERE a.last_name='REYNOLDS';
-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
SELECT f.title
FROM film f
JOIN film_actor af ON f.film_id=af.film_id
JOIN actor a ON af.actor_id=a.actor_id
WHERE  a.last_name='DEAN';
-- 4. All of the the ‘Documentary’ films
-- (68 rows)
SELECT f.title
FROM film f
JOIN film_category fc ON fc.film_id=f.film_id
JOIN category c ON c.category_id=fc.category_id
WHERE c.name= 'Documentary';
-- 5. All of the ‘Comedy’ films
-- (58 rows)
SELECT f.title
FROM film f
JOIN film_category fc ON fc.film_id=f.film_id
JOIN category c ON c.category_id=fc.category_id
WHERE c.name= 'Comedy';
-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
SELECT f.title
FROM film f
JOIN film_category fc ON fc.film_id=f.film_id
JOIN category c ON c.category_id=fc.category_id
WHERE c.name= 'Children' ANd f.rating = 'G';
-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
SELECT f.title
FROM film f
JOIN film_category fc ON fc.film_id=f.film_id
JOIN category c ON c.category_id=fc.category_id
WHERE c.name= 'Family' ANd f.rating = 'G' AND f.length<120;
-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
SELECT f.title
FROM film f
JOIN film_actor af ON f.film_id=af.film_id
JOIN actor a ON af.actor_id=a.actor_id
WHERE  a.last_name='LEIGH' AND f.rating='G';
-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
SELECT f.title
FROM film f
JOIN film_category fc ON fc.film_id=f.film_id
JOIN category c ON c.category_id=fc.category_id
WHERE c.name= 'Sci-Fi' ANd f.release_year = 2006 ;
-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
SELECT f.title
FROM film f
JOIN film_category fc ON fc.film_id=f.film_id
JOIN category c ON c.category_id=fc.category_id
JOIN film_actor af ON f.film_id=af.film_id
JOIN actor a ON af.actor_id=a.actor_id
WHERE c.name= 'Action' AND first_name='NICK' AND last_name = 'STALLONE';
-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
SELECT a.address, ci.city, a.district, c.country
FROM address a
JOIN city ci ON ci.city_id=a.city_id
JOIN country c ON c.country_id=ci.country_id
JOIN store s ON s.address_id=a.address_id;
-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
SELECT s.store_id,a.address, st.first_name, st.last_name
FROM address a
JOIN store s ON s.address_id=a.address_id
JOIN staff st ON st.staff_id=s.manager_staff_id;

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)
SELECT  c.first_name, c.last_name, COUNT(r.rental_date) 
FROM customer c 
JOIN rental r ON r.customer_id=c.customer_id
JOIN inventory i ON i.inventory_id=r.inventory_id
JOIN film f ON f.film_id=i.film_id
GROUP BY c.last_name, c.first_name
ORDER BY count desc limit 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)
SELECT  c.first_name, c.last_name, sum(p.amount) 
FROM customer c 
JOIN rental r ON r.customer_id=c.customer_id
JOIN payment p ON r.rental_id=p.rental_id
GROUP BY c.last_name, c.first_name
ORDER BY sum desc limit 10;
-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
SELECT s.store_id, a.address, count(r.rental_id) as rental, sum(p.amount) as psum, avg(p.amount)
FROM store s
join address a ON a.address_id=s.address_id
join inventory i ON i.store_id=s.store_id
join rental r on r.inventory_id=i.inventory_id
join payment p ON p.rental_id=r.rental_id
group BY s.store_id, a.address;
-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)
SELECT f.title, count(r.rental_id)
FROM rental r
join inventory i ON r.inventory_id=i.inventory_id
join film f on f.film_id=i.film_id
GROUP BY  f.title
ORDER BY count desc limit 10;
-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)
SELECT c.name, count(r.rental_id)
FROM rental r
join inventory i ON r.inventory_id=i.inventory_id
join film f on f.film_id=i.film_id
join film_category fc on fc.film_id=f.film_id
join category c on c.category_id=fc.category_id
GROUP BY  c.name
ORDER BY count desc limit 5;
-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)
SELECT f.title, count(r.rental_id), c.name
FROM film f
join inventory i ON f.film_id=i.film_id
join rental r on r.inventory_id=i.inventory_id
join film_category fc on fc.film_id=f.film_id
join category c on c.category_id=fc.category_id
WHERE c.name='Action'
GROUP BY   f.title,c.name
ORDER BY count desc limit 5;




-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)
SELECT a.first_name, a.last_name, count(r.rental_id)
FROM actor a
join film_actor fa ON fa.actor_id=a.actor_id
join film f on f.film_id=fa.film_id
join inventory i ON f.film_id=i.film_id
join rental r on r.inventory_id=i.inventory_id
group by  a.actor_id
order by count desc limit 10;

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
SELECT a.first_name, a.last_name, count(r.rental_id)
FROM actor a
join film_actor fa ON fa.actor_id=a.actor_id
join film f on f.film_id=fa.film_id
join inventory i ON f.film_id=i.film_id
join rental r on r.inventory_id=i.inventory_id
join film_category fc on fc.film_id=f.film_id
join category c on c.category_id=fc.category_id
where c.name='Comedy'
group by a.first_name, a.last_name
ORDER BY count desc limit 5;