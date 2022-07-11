create database pruebita;
use pruebita;
create table distrito
(
iddistrito varchar (3) primary key,
nomdistrito varchar (40)
);
desc distrito;

create table cliente
(
idcliente int auto_increment primary key,
nomcliente varchar(30),
direccion varchar(50),
iddistrito varchar(3)
);

alter table cliente add foreign key (iddistrito) references distrito(iddistrito);
desc cliente;

select * from Distrito;
insert into distrito (iddistrito,nomdistrito) values ('L01', 'LIMA CERCADO');
insert into distrito (iddistrito,nomdistrito) values ('L02','ANCON');
insert into distrito (iddistrito,nomdistrito) values ('L03','ATE');
insert into distrito (iddistrito,nomdistrito) values ('L04','BREÑA');
insert into distrito values ('L18','MIRAFLORES'); 
insert into distrito values ('L27', 'SAN ISIDRO');
insert into distrito values ('L32', 'SAN MIGUEL');
insert into distrito values ('L34', 'SAN JUAN DE MIRAFLORES');

update distrito set nomdistrito='BREÑA' where iddistrito='L04';
update distrito set nomdistrito='VILLA MARIA DEL TRIUNFO' where iddistrito='L34';

delete from distrito where iddistrito= 'L04';
delete from distrito where iddistrito= 'L34';

insert into cliente (nomcliente,distrito,iddistrito) values ('Ricardo Gareca', 'VINEDA', 'L18');
insert into cliente (nomcliente,direccion,iddistrito) values ('Hans Dieter Flick', 'GERMANY', 'L02');
select * from clientes;
select * from DISTRITO;


create database usuarios_login;
use usuarios_login;
create table registro
(
ID varchar (3) primary key,
USUARIO varchar (45),
NOMBRE VARCHAR (45),
APELLIDO VARCHAR (45),
EDAD VARCHAR (45)

);
desc registro;
