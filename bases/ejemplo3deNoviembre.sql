-- SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

create database administracion;
use administracion;
create table notas (AlumnoID int, notas_de_matemática int, notas_de_literatura int);
create table alumnos (AlumnoID int primary key auto_increment,nombre varchar(50),edad int);

insert into alumnos (nombre,edad) values
 ("Fabio",12),("Fabio",12),("Gloria",11),
 ("Florinda",12),("Homero",11),("Kika",13);

insert into notas (AlumnoID,notas_de_matemática,notas_de_literatura) 
values (1,10,10),(1,10,10),(3,7,6),(2,6,6),(2,6,6),
       (2,6,6),(4,9,8),(4,9,8),(6,5,9);
       
select * from notas;
select * from alumnos;

select * from alumnos group by edad;
select edad from alumnos group by edad;
select nombre,edad from alumnos group by nombre,edad;
select edad, count(edad) as cantidad from alumnos group by edad;	
select * from alumnos where nombre like "F%" group by edad having edad >= 12;

select AlumnoID,sum(notas_de_matemática) 
from notas group by AlumnoID;

select AlumnoID,sum(notas_de_matemática),count(notas_de_matemática) 
from notas group by AlumnoID;

select AlumnoID,sum(notas_de_matemática)/count(notas_de_matemática) 
as promedio from notas group by AlumnoID having promedio >= 7 order by AlumnoID desc;

-- select notas.AlumnoID,alumnos.nombre,(nota1 + nota2)/2 from notas,alumnos;
-- select AlumnoID,sum(nota1 + nota2) from notas;
