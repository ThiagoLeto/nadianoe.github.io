
- Se requiere crear un sistema para una librería. Para ello, se deberá:

- Crear una interfaz llamada Libro con la declaración
de los siguientes métodos:

``` java
	public float calcularPrecioFinal();
```
----
- Crear una clase abstracta llamada "LibroDeLiteratura" que implemente
la interface "Libro" y tenga los siguientes atributos: 
	- nombre, autor, código, costo, descripción
----
- Crear la clase abstracta "LibroElectronico" como subclase de 
la clase abstracta "LibroDeLiteratura" y agregarle el atributo:
	- tipoDeArchivo 
- y la variable estática DESCUENTO que representa el valor de descuento sobre el precio final. 
----
- Para calcular el precio final de los libros electrónicos:

    - si el tipo de archivo es "pdf", 
        ```
        precio final = costo + $500 + X 
        ```	
    - si el tipo de archivo es "txt", 
        ```
        precio final = costo + $300 + X 
        ```	
    - donde:
    ```
        "X" es negativo, valor correspondiente al DESCUENTO. 
    ```
----
----
- Crear la clase abstracta "LibroDePapel" como subclase de 
la clase abstracta "LibroDeLiteratura" y agregarle el atributo:
	- peso
- y la variable estática RECARGO_POR_ENVIO que representa el porcentaje correspondiente al valor de incremento al precio final por enviar el producto a domicilio. 
----
- La clase abstracta "LibroElectronico", deberá ser superclase de
las clases:
	- LaMetamorfosis
	- Firelight
----
- La clase abstracta "LibroDePapel", deberá ser superclase de
las clases:
	- HarryPotterUno
	- ElHobbit
----
- Para calcular el precio final de los libros de papel:

    - si el libro pesa más de 400 gr, 
        ```
        precio final = costo + $700 + X 
        ```	
    - si el libro pesa menos o igual a 400gr, 
        ```
        precio final = costo + $400 + X 
        ```	
    - donde:
    ```
        "X" es positivo, valor correspondiente al RECARGO_POR_ENVÍO.
    ```
----
- Crear la clase SistemaLibrería que:
	- tenga los atributos 
		- nombre
		- un ArrayList que almacene las ventas de libros realizadas
        (es decir, por ejemplo, si se vendieron 5 libros iguales, en la lista
        aparecerá 5 veces) 

	- comentario: no agregar más atributos a esta clase
	- implemente la siguiente interfaz:

```java

	public interface SistemaDeVentas {
		public float ingresosTotales();
	}

```
----
- Por otro lado, la clase SistemaLibreria también deberá tener los
siguientes métodos:

```java
	public HashSet<String> nombresDeLibrosVendidos(){
		/** que retorna un set con los nombres de los 
		     libros que fueron vendidos
		**/ 
	}
```

```java
	public HashMap<Integer,Float> librosConCantidadDeVentas(){
		/**  
		Que retorna un map cuyas claves deberán ser los códigos de los libros
		y sus correspondientes valores deberán ser la cantidad de veces que
        fué vendido 
		**/
	}
```

----
- Responder:
    - ¿Qué es una Exception?¿Para qué sirven los bloques try/catch?
    - ¿Qué es serializar y deserializar?
