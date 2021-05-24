DELETE FROM user_roles;
DELETE FROM votes;
DELETE FROM dishes;
DELETE FROM restaurants;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, password)
VALUES ('Admin', 'admin'),
       ('User', '1111'),
       ('User2', 'user');

INSERT INTO user_roles (role, user_id)
VALUES ('ADMIN', 100000),
       ('USER', 100000),
       ('USER', 100001);

INSERT INTO restaurants (name, description)
VALUES ('Grand Café', 'Cafe, Restaurant, Italian, Belarusian'),
       ('Kuhmistr', 'Restaurant, Russian'),
       ('La Scala Trattoria Ignazio', 'Restaurant, Italian'),
       ('BAR:DOT XX1', 'Hotel Restaurant, Asian, Fusion'),
       ('Pena Dney', 'Restaurant, European'),
       ('Animal Farm', 'Restaurant, European, Mediterranean'),
       ('Seafood Bar by John Dory', 'Restaurant, Seafood'),
       ('Svobody.4', 'Restaurant, Wine Bar, Italian, European'),
       ('Om Namo', 'Restaurant, Indian, Vegetarian'),
       ('Try Zhaunery', 'Bar, Pub, Beer, Pub Grub');

INSERT INTO dishes(name, price, restaurant_id)
values('Pizza', 345.34, 100003),
      ('Pasta', 145.34, 100003),
      ('Hamburger', 345.34, 100004),
      ('Soup', 345.34, 100004),
      ('Salad', 345.34, 100004),
      ('Bread', 145.34, 100004),
      ('Rice', 345.34, 100005),
      ('Eggs', 345.34, 100005),
      ('Salad', 345.34, 100006),
      ('Bread', 145.34, 100006),
      ('Rice', 345.34, 100006),
      ('Eggs', 345.34, 100007),
      ('Pizza', 345.34, 100007),
      ('Pasta', 145.34, 100007),
      ('Hamburger', 345.34, 100008),
      ('Soup', 345.34, 100008),
      ('Salad', 345.34, 100009),
      ('Bread', 145.34, 100009),
      ('Rice', 345.34, 100009),
      ('Eggs', 345.34, 100009),
      ('Pizza', 345.34, 100010),
      ('Pasta', 145.34, 100010),
      ('Hamburger', 345.34, 100010),
      ('Soup', 345.34, 100011),
      ('Salad', 345.34, 100011);

INSERT INTO votes(user_id, restaurant_id, date_vote)
values (100000, 100008,'2021-05-24 10:00:00'),
       (100000, 100005,'2021-05-23 14:00:00'),
       (100000, 100008,'2021-05-22 10:00:00'),
       (100000, 100011,'2021-05-21 10:00:00'),
       (100001, 100008,'2021-05-24 10:00:00'),
       (100001, 100005,'2021-05-23 14:00:00'),
       (100001, 100004,'2021-05-22 11:00:00'),
       (100001, 100003,'2021-05-21 12:00:00');
