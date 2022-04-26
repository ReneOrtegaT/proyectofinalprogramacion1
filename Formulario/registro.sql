create database Registro;

use Registro;

drop table registro;

create table registro(
id int auto_increment,
Usuario varchar(50),
nombre varchar(50),
apellido varchar(50),
telefono varchar(50),
correo varchar(50),
pasword varchar(50),
primary key(id)
);

