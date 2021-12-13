- Para este TP se deberá utilizar la API implementada en la materia
  Laboratorio de Programación Orientada a Objetos.

- Crear una aplicación web que muestre 5 opciones a elegir por el usuario:
	- 1. Obtener datos de todos los alumnos registrados
		- De ser elegida esta opción, se deberá realizar una petición de tipo GET
		  para obtener los datos pedidos a través de la API y luego mostrárselos 
		  al usuario. 	

		- URL: http://localhost:8080/api/alumnos/
	- Comentario: los datos de alumnos registrados seràn: nombre, apellido y edad.
	- ejemplo de respuesta recibida:
	```
	{
	    "alumnos": [
		{ id : 1, nombre : "Florencia", apellido : "Corosawe", edad : 78 },
		{ id : 2, nombre : "Felipe", apellido : "Gerripe", edad : 45 },
		{ id : 3, nombre : "Pepa", apellido : "Holotti", edad : 56 }
	    ]
	}
	```
	
	- 2. Obtener datos de un alumno 
		- De ser elegida esta opción, se deberá pedir al usuario el número de id 
		  correspondiente al alumno del que se solicitan los datos. Realizar una petición 
		  de tipo GET para obtener los datos del alumno a través de la API y luego mostrárselos 
		  al usuario. 

		- URL: http://localhost:8080/api/alumnos/{id}
		- {id} debe ser reemplazado por el id ingresado por el usuario
		
	- ejemplo de respuesta recibida si id es igual a 2:
	```
	{ id : 2, nombre : "Felipe", apellido : "Gerripe", edad : 45 }
	```
	
	- 3. Realizar nuevo registro de alumno
		- De ser elegida esta opción, se deberá mostrar un formulario
		  que permita el ingreso de los siguientes datos:
			- id
			- nombre
			- edad
		Y luego realizar una petición de tipo POST para ingresar la información
		en una base de datos a través de la API.

		- URL: http://localhost:8080/api/alumnos/
	- ejemplo de respuesta recibida:
	```
	{ notificacion : "registro realizado" }
	```
	
	- 4. Realizar modificación de datos
		- De ser elegida esta opción, se deberá preguntar al usuario cuál es el dato
		  a modificar (nombre o edad) y el id correspondiente al alumno cuyos datos serán
		  modificados. Luego, realizar una petición de tipo PATCH para realizar la 
		  modificación correspondiente a través de la API.

		- URL: http://localhost:8080/api/alumnos/{id}
		- {id} debe ser reemplazado por el id ingresado por el usuario
	- ejemplo de respuesta recibida:
	```
	{ notificacion : "modificación realizada" }
	```
	
	- 5. Eliminar datos de alumno
		- De ser elegida esta opción, se deberá preguntar al usuario cuál es el
		  id correspondiente del alumno cuyos datos serán eliminados.
		  Luego, realizar una petición de tipo DELETE para realizar la 
		  eliminación correspondiente a través de la API.

		- URL: http://localhost:8080/api/alumnos/{id}
		- {id} debe ser reemplazado por el id ingresado por el usuario
	- ejemplo de respuesta recibida:
	```
	{ notificacion : "eliminación realizada" }
	```


- Realizar las peticiones con llamadas AJAX 
- Para el estilo de la aplicación deberán utilizar el framework Bootstrap y, además, incluir:
	- tipo de fuente provista por GoogleFonts
	- Botones
	- Imágen como fondo de pantalla 
	- párrafos que describan el propósito de las peticiones
	- espacio donde se deberá visualizar el contenido recibido por la API
	- Una tabla donde estén colocados los datos recibidos de la petición número 1
	
