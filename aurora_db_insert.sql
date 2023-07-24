create database picture;
use picture;
create table pictures (id int auto_increment primary key, name varchar(100) not null, image varchar(100) not null, description varchar(255));
insert into pictures (name, image, description) values ('Picture_1', 'picture_1.jpg', 'This is the first cat picture');
insert into pictures (name, image, description) values ('Picture_2', 'picture_2.jpg', 'This is the second cat picture');
insert into pictures (name, image, description) values ('Picture_3', 'picture_3.jpg', 'This is the first dog picture');
insert into pictures (name, image, description) values ('Picture_4', 'picture_4.jpg', 'This is the second dog picture');