- Crear una API utilizando el framework Spring Boot.

- La misma deberá tener utilizar una clase llamada Alumno que
  tendrá como atributos: id, nombre y edad.
- Todos los alumnos tendrán un número de identificación distinto, llamado "id".


- La clase Controller deberá tener:

	- 1. Un método cuya acción consistirá en proveer la información 
		 de todos los alumnos registrados en la base de datos.
		 - Deberá responder la petición de tipo GET y utilizar la URL:
		 	- http://localhost:8080/api/alumnos/

	- 2. Un método cuya acción consistirá en proveer la información 
		 de un alumno. 
		 - Deberá responder la petición de tipo GET y utilizar la URL:
		 	- http://localhost:8080/api/alumnos/{id}
		 	- {id} debe ser reemplazado por el número de id correspondiente al 
		 	alumno del cual se requiere la información.
		 
	- 3. Un método cuya acción consistirá en agregar un nuevo alumno a la 
		 base de datos.
		 - Deberá responder la petición de tipo POST y utilizar la URL:
		 	- http://localhost:8080/api/alumnos/

	- 4. Un método cuya acción consistirá en actualizar la información de
		 un alumno ya existente en la base de datos.
		 - Deberá responder la petición de tipo PATCH y utilizar la URL:
		 	- http://localhost:8080/api/alumnos/{id}
		 	- {id} debe ser reemplazado por el número de id correspondiente al 
		 	alumno cuya información será actualizada.

	- 5. Un método cuya acción consistirá en eliminar la información de
		 un alumno ya existente en la base de datos.
		- Deberá responder la petición de tipo DELETE y utilizar la URL:
		 	- http://localhost:8080/api/alumnos/{id}
		 	- {id} debe ser reemplazado por el número de id correspondiente al 
		 	alumno cuya información será eliminada.
		
