-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name) VALUES ('Hampton', 'Avenue');
INSERT INTO actor (first_name, last_name) VALUES ('Lisa','Byway');
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
INSERT INTO film (title, description, release_year, length, language_id)
VALUES ('Euclidean PI','The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece',2008,198,1);
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor (actor_id,film_id) 
VALUES(201,1001); 
INSERT INTO film_actor (actor_id,film_id) 
VALUES(202,1001); 
SELECT * FROM actor where first_name='Hampton' AND last_name='Avenue';
-- 4. Add Mathmagical to the category table.
INSERT INTO category (name)
VALUES ('Mathmagical');
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

INSERT INTO film_category (category_id,film_id)
VALUES (17,1001);
UPDATE film_category 
SET category_id=17, film_id=996
WHERE film_id=996;
UPDATE film_category 
SET category_id=17, film_id=714
WHERE film_id=714;
UPDATE film_category 
SET category_id=17, film_id=494
WHERE film_id=494;
UPDATE film_category 
SET category_id=17, film_id=274
WHERE film_id=274;

DELETE FROM film_category WHERE category_id=17 AND film_id=996; --should have used tansaction
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
BEGIN TRANSACTION;
UPDATE film
SET rating='G'
WHERE title IN(
SELECT title
FROM film f 
JOIN film_category fc ON fc.film_id=f.film_id
JOIN category c ON c.category_id=fc.category_id
WHERE c.name='Mathmagical');
commit;
ROLLBACK;
-- 7. Add a copy of "Euclidean PI" to all the stores.
BEGIN TRANSACTION;
INSERT INTO inventory (film_id,store_id)
VALUES (1001,1);
INSERT INTO inventory (film_id,store_id)
VALUES (1001,2);
COMMIT;
-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
DELETE FROM film WHERE film_id=1001;--multiple foreign key violations

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
DELETE FROM category WHERE category_id=17;--violates foreign key constraint
-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
DELETE FROM film_category WHERE category_id=17;--film_category is where the keys resided
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
DELETE FROM category WHERE category_id=17;--it worked because foreign key issue was resolved
DELETE FROM film WHERE film_id=1001;--foreign key constraints on film_actor table
-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.
DELETE FROM film_actor WHERE film_id=1001;
DELETE FROM inventory WHERE film_id=1001; --had to delete from inventory as well as film_actor to clear up foreign key constraints
DELETE FROM film WHERE film_id=1001;