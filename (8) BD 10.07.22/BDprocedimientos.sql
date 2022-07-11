create database procedimientos;
use procedimientos;
create table usuario
(
id_usuario int primary key auto_increment not null,
nombre varchar(25) not null,
apellido varchar (25),
fecha_reg timestamp default current_timestamp
);
desc usuario;
select * from usuario;
insert into usuario (nombre, apellido, fecha_reg) values ('Bruce','Banner', '20191014');

create procedure usp_muestra_usuario()
select * from usuario
-- Prueba:
call usp_muestra_usuario()

create procedure usp_muestra_usuario2(in nom varchar (25))
select * from usuario where nombre= nom
-- Prueba:
call usp_muestra_usuario2("Tony")

delimiter $

