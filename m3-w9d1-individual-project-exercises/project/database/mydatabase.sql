DROP TABLE products;
DROP TABLE categories;

CREATE TABLE categories
(
	id		serial,
	name	varchar(100)	not null,
	image   varchar(255)	not null,
	constraint pk_categories primary key (id)
);

CREATE TABLE products
(
	id			serial,
	product		varchar(255)	not null,
	price		decimal(10,2)		not null,
	description	text		not null,
	category_id	int,
	image		varchar(255)	not null,
	rating      int	not null,
	last_month	int	not null,

	constraint pk_products primary key (id),
	constraint fk_products_categories foreign key (category_id) references categories(id)
);

insert into categories (name, image) VALUES ('Dairy','http://media.gettyimages.com/photos/assortment-of-most-common-dairy-products-on-white-backdrop-picture-id155373465?s=612x612');
insert into categories (name, image) VALUES ('Fruit','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3Iucaa9s09KwP6oZcacngkb4YTgocQwUO4prue5vzUCYhLT2S4g');
insert into categories (name, image) VALUES ('Vegetables','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqacWjFN4CyW1QYI4HCzQwCBKvJre0WPXuFbFRrO9X22XN8Av0FA');
insert into categories (name, image) VALUES ('Picnic Supplies','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRT_esW7fiWuyvY-efCmwvj5OolhaB7sW9rmF9M8lrFf05xKFUMaQ');
insert into categories (name, image) VALUES ('Breads','http://images3.wikia.nocookie.net/__cb20120128045061/thehungergames/images/6/67/Bread.jpg');


insert into products (product, price, rating, last_month, description, category_id, image) values ('Radish', '1.42','3','101', 'A really tasty Radish - Pickled perfect for a picnic.', 3, 'https://thumb7.shutterstock.com/display_pic_with_logo/86740/86740,1317366165,1/stock-photo-daikon-radishes-isolated-on-white-background-85661542.jpg');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Broccoli', '0.26','3','51', 'A really tasty Broccoli -  perfect for a picnic.', 3, 'https://thumb1.shutterstock.com/display_pic_with_logo/721492/572617423/stock-photo-broccoli-isolated-on-white-background-572617423.jpg');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Lettuce', '3.40','3','81', 'A really tasty Head of Lettuce - perfect for a picnic.', 3, 'https://thumb1.shutterstock.com/display_pic_with_logo/324901/124415023/stock-photo-green-iceberg-lettuce-on-white-background-124415023.jpg');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Green Beans', '3.68','3','101', 'Some really tasty Green Beans - perfect for a picnic.', 3, 'http://media.gettyimages.com/photos/fresh-beans-picture-id182035936?s=612x612');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Bread', '0.12', '5','111','A really tasty Bread - Gold Formel perfect for a picnic.', 5, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXLB54ag8wXSnPphW97COhlDj2dMW5XTr9YVsDItfNemQoJ2yOCg');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Green Onion', '5.81','3','41', 'Some really tasty Green Onions - perfect for a picnic.', 3, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT38Knf_pOtQZmkr02uun8qyWKOVsmIqEreaut0FrLuqHxoQ_z7');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Dish Towel', '4.10','2','21', 'A really handy Dish Towel -  perfect for a picnic.', 4, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRCkdj6blSHQRZssGCdW636pbDApvvua8idqC0w7x99hC9Wk0jC');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Table Cloth', '0.30','5','141', 'A really handy Table Cloth -  perfect for a picnic.', 4, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD76n6TBHYYfVHcOmfyrNFoHc0bU01azBySwanLGVwDH0LVVB4');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Apple', '0.51', '4','101','A really tasty Apple - perfect for a picnic.', 2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQvqH1aYdncoxPWHtKwsHkmnTKs1wK_0VrwiCV8JdwME8nFNX1Kvg');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Banana', '1.52','3','14', 'A really tasty Banana - perfect for a picnic.', 2, 'https://media.istockphoto.com/photos/banana-bunch-picture-id173242750?k=6&m=173242750&s=612x612&w=0&h=QJB3WhqIWcF1umqELWFUVu32OJWCuePabFClaMfRWbo=');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Orange', '0.07','4','55', 'A really tasty Orange - perfect for a picnic.', 2, 'https://media.istockphoto.com/photos/orange-picture-id185284489?k=6&m=185284489&s=612x612&w=0&h=x_w4oMnanMTQ5KtSNjSNDdiVaSrlxM4om-3PQTIzFaY=');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Whole Wheat Bread', '3.29', '4','81','Some really tasty Wheat Bread -  perfect for a picnic.', 5, 'http://cdn2.veganbaking.net/2011/content/vegan-nine-grain-whole-wheat-bread.jpg');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Rye Bread', '5.41','3','101', 'Some really tasty Rye Bread -  perfect for a picnic.', 5, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYerqe8Ft6-8-wq7AQZX7L7H6owwNqWL8XKnjwyO_q5KdfRCci');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Milk - Skim', '1.28', '1','1','Some really aweful Skim Milk - no one should ever buy this.', 1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJh1_uLldAyQLiCdQwe1RopaA3UWd8Wsl2HYlCc9Mxp-qhFGKG');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Milk - 2%', '0.96', '5','201','Some really tasty Milk - perfect for a picnic.', 1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRUnD4eKmEji3XEgk_A5ocvLBpqXdGNX8RLckSQg3SvhkbWYok7Pg');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Milk - Whole', '4.01','4','101', 'Some really tasty Whole Milk -  perfect for a picnic.', 1, 'http://canigivemybaby.com/wp-content/uploads/2011/11/can-i-give-my-baby-whole-milk.jpg');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Creamer, Coffee', '2.77','2','61', 'Some Coffee Creamer - perfect for a cup of coffee.', 1, 'https://www.wikihow.com/images/thumb/7/74/Freeze-Liquid-Coffee-Creamer-Step-2.jpg/aid1861727-v4-728px-Freeze-Liquid-Coffee-Creamer-Step-2.jpg');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Eggs - 1 dozen', '5.19', '5','151','A dozen Eggs - who wants breakfast?', 1, 'http://images.wisegeek.com/carton-of-a-dozen-eggs.jpg');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Eggs - half dozen', '3.29', '4','101','A half dozen Eggs - who wants breakfast?', 1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSG6SlFCdKHicpZTCUIxSF7kUHIo8d-BYQci9M-xbBSk89KaRVs');
insert into products (product, price, rating, last_month,description, category_id, image) values ('Milk - Chocolate', '1.85', '5','131','Some really tasty Milk - perfect for a picnic.', 1, 'https://vignette4.wikia.nocookie.net/uncyclopedia/images/e/ec/Chocmilk-1-.jpg/revision/latest?cb=20100721212934');