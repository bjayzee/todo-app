drop user if exists 'appuser'@'localhost';
create user 'appuser'@'localhost' identified by 'appuser123';
grant all privileges on todoappdb.* to 'appuser'@'localhost';
flush privileges;

drop database if exists todoappdb;
create database todoappdb;