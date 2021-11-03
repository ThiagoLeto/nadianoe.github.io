create database administracion;
use administracion;
create table notas (AlumnoID int, nota1 int, nota2 int);
create table alumnos (AlumnoID int primary key auto_increment,nombre varchar(50),edad int);

insert into alumnos (nombre,edad) values ("Fabio",12),("Gloria",11),("Florinda",12),("Homero",11),("Kika",13);
select * from alumnos;

insert into notas (AlumnoID,nota1,nota2) values (1,10,10),(3,7,6),(2,6,6),(4,9,8),(6,5,9);
select * from notas;

select nombre,notas.AlumnoID from notas inner join alumnos on notas.AlumnoID = alumnos.AlumnoID;
select notas.AlumnoID,nombre,nota1 from notas left join alumnos on notas.AlumnoID = alumnos.AlumnoID;
select alumnos.AlumnoID,nombre,nota1 from notas right join alumnos on notas.AlumnoID = alumnos.AlumnoID;
select notas.AlumnoID,nombre from notas inner join alumnos on notas.AlumnoID = alumnos.AlumnoID and nombre like "H%";

select notas.AlumnoID,nombre from notas inner join alumnos on notas.AlumnoID = alumnos.AlumnoID and nombre like "H%";
select notas.AlumnoID,nombre,edad from notas inner join alumnos on 
notas.AlumnoID = alumnos.AlumnoID where edad >= 12;
