Sea un cine, que contiene salas y recibe muchos espectadores a diario, se necesita crear un sistema que 
permita obtener determinada información sobre las personas que concurrieron. 

Para ello, se deberá:

- Crear una clase llamada Cine que tenga como atributos:
	- nombre
	- dirección
	- salas

- Crear la clase Sala que: tenga como atributos:
	- un número de sala 
	- una cantidad de asientos
	- Una estructura de datos que contenga información sobre los visitantes que han ingresado a la sala al menos una vez.
	- Una estructura de datos que represente a los visitantes que se encuentran presentes en la sala.

- Las salas tienen una capacidad máxima permitida que es menor o igual a la cantidad de asientos. 
  Por el momento, la capacidad maxima es de 50 personas. Crear una variable estática pública en la clase Sala que 
  represente dicho valor. 
  
- En la clase Sala, crear los siguiente métodos:

	- "nroDeAsientosConCantidadDePreferencias", que retorna un HashMap cuyas claves representan el número de asiento, y sus 
	   valores el número de veces que fué elegido.
	- "visitantesConCantidadDeVisitas", que retorna un hashmap que tiene como
	claves los id's de los visitantes y como valores la cantidad de visitas a la sala
	que realizó hasta ahora.
	- "cantidadDeVisitantesPresentes", que retorna un número entero como representación
	de la cantidad de visitantes que están presentes en la sala.
	- "estaLlena", que retorna un valor de tipo bool indicando con true si la cantidad de
	espectadores es igual a la capacidad máxima.
	- "hayInfiltrados", que retorna un valor de tipo bool indicando con true si la cantidad
	de espectadores es mayor a la capacidad máxima permitida.
	- "asientosDisponibles", que retorna un número entero que representa la cantidad de asientos que pueden ser ocupados. 

.
- En la clase Cine, crear los siguientes métodos:
	- "visitantes", que retorna un hashset con los id's de los visitantes
	que han concurrido a cualquier sala del cine al menos una vez.
	- "cantidadTotalDeVisitantes", que retorna un número entero como representación
	de la cantidad total de visitantes que vieron al menos una pelicula.
	- "visitantesConCantidadDeVisitas", que retorna un hashmap que tiene como
	claves los id's de los visitantes y como valores la cantidad de visitas al cine
	que realizó hasta ahora.

	- "informeActual", un método estático público que imprime por consola la información actual sobre las salas de cine, 
	especificando lo siguiente:
		- número de sala
		- cantidad de asientos
		- capacidad máxima permitida
		- cantidad de visitantes presentes
		- cantidad de asientos disponibles


- Los visitantes deberán ser representados con una clase llamada "Visitante".
	- Cada visitante tiene un número que lo identifica (llamado id) y un número de asiento.
	
- Responder con palabras:
	- a. Si cada cine tuviera dos tipos de salas: salas2D y sala3D,
	¿Crearía nuevas clases?¿Reutilizaría alguna clase existente?¿Porqué?
	- b. Si se necesitara guardar información sobre la cantidad de personas mayores de edad
	y menores de edad que concurren al cine, ¿Qué modificaciones realizaría?¿Porqué?
	- c. Si se necesitara saber cuál fué el visitante que ingresó último al cine, 
	¿Qué modificaciones realizaría?¿Porqué?
  
- Comentarios:
  - Todas las clases deberán tener sus correspondientes Getters y Setters.
  


