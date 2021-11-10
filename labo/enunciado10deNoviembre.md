
- Se requiere crear un sistema para un supermercado. Para ello, se deberá:

- Crear una interface llamada Producto con la declaración
de los siguientes métodos:

``` java
	public float calcularPrecioFinal();
	public float calcularGananciaObtenida();
	public String tipoDeProducto();
```
----
- Crear una clase abstracta llamada "ProductoDeSuper" que implemente
la interface "Producto" y tenga los siguientes atributos: 
	- nombre, origen, código, costo
----
- Crear la clase abstracta "ProductoAlimenticio" como subclase de 
la clase abstracta "ProductoDeSuper" y agregarle el atributo:
	- cantDiasParaVencerse
- y la variable estática DESCUENTO que representa porcentaje correspondiente al valor de descuento al precio final. 
----
- Crear la clase abstracta "ProductoElectrico" como subclase de 
la clase abstracta "ProductoDeSuper" y agregarle el atributo:
	- cantDiasDeGarantia
- y la variable estática RECARGO_POR_ENVIO que representa el porcentaje correspondiente al valor de incremento al precio final por enviar el producto a domicilio. 
----
- La clase abstracta "ProductoAlimenticio" deberá ser superclase de
las clases:
	- ProductoNoPerecedero, con atributo:
		- mgDeSodio
	- ProductoPerecedero, con atributo:
		- temperaturaMinimaDeFrio
----
- La clase abstracta "ProductoElectrico" deberá ser superclase de
las clases:
	- ProductoDeCalefaccion, con atributo:
		- wattsDePotenciaMax
	- ProductoDeRefrigeracion, con atributo:
		- litrosDeCapacidad
----
- Para calcular la ganancia obtenida por producto alimenticio se deberá tener en cuenta lo siguiente:
	- si la cantidad de dias para vencerse es menor o igual a 90,
	  el porcentaje de ganancia será del 10%
	- si la cantidad de días para vencerse es mayor a 90, el porcentaje
	  de ganancia será del 25%
----
- Para calcular la ganancia obtenida por producto eléctrico se deberá tener
en cuenta lo siguiente:
	- si la cantidad de días de garantía es igual a 365, el porcentaje
	de ganancia será del 45%
	- si la cantidad de días de garantía es menor o igual a 60 días,
	el porcentaje de ganancia será del 15%
	
----
- Para calcular el precio final se necesitará realizar la siguiente cuenta:
```
precio final = costo + valor correspondiente al porcentaje de ganancia +  X

"X" podrá ser positivo o negativo según el producto del que se trate. Es decir, puede ser DESCUENTO ó RECARGO_POR_ENVÍO.
```
----
- El método "tipoDeProducto" deberá retornar un string que indique el tipo
de producto que es. 
- Por ejemplo, si se trata de la clase "ProductoElectrico",
deberá retornar "Producto eléctrico".
- Este método deberá redefinirse según la clase donde se encuentre
implementado.
----
- Crear la clase SistemaSupermercado que:
	- tenga los atributos 
		- nombre
		- una estructura de datos que almacene los productos disponibles 
		a la venta 
		- una estructura de datos que almacene los productos vendidos, ordenados según el momento de venta
	- comentario: no agregar más atributos a esta clase
	- implemente la siguiente interface:

```java
	public interface SistemaDeVentas {
		public float gananciaTotalObtenida();
		public float ingresosTotales();
		public int cantidadDeProductosVendidos();
	}
```
----
- Por otro lado, la clase SistemaSupermercado también deberá tener los
siguientes métodos:
```java
			
	public void agregarProductoVendido(){
		/** 
		Que deberá recibir, por consola, los valores correspondientes a los atributos del producto vendido para luego crear la instancia del mismo. 

		Considerar la posibilidad de que el usuario ingrese un valor de un tipo no esperado y tratar esta situación con InputMismatchException.

		En caso de que suceda, se deberán pedir todos los datos nuevamente. 
		**/

	}
			
```
----
- Un método estático que sirva para serializar un objeto de la clase supermercado. 
	- Probar el método, copiar el string resultante y pegarlo en un archivo .json. 
	- Si lo desea, puede escribir el resultado utilizando código java.
----
- Un método estático que sirva para deserializar el objeto json obtenido en el método anterior.
----
- Dado que los adultos sanos deben limitar la ingesta de sodio a 2,300 mg por día y los adultos que sufren de presión arterial alta no deberìan consumir más de    1,500 mg por día; la empresa decidió colocar etiquetas de "producto apto para hipertensos" en aquellos productos no perecederos que están a la venta. 

- Para saber los productos que llevarán esa etiqueta, se requiere crear el método
```java
	public HashSet<String> aptosParaHipertensos(){
		/** que retorna un set con los nombres de los 
		productos no perecederos cuyas cantidades de sodio son menores o iguales a 1,500 mg.
		**/ 
	}
```
----
- Se requiere saber cuáles son los productos de refrigeración más grandes que ofrece el supermercado y son de industria nacional. 
- Se considera que una heladera es grande si su capacidad es mayor o igual 300 litros.
- Para obtener esta información, se requiere crear el siguiente método:
```java
	public HashMap<Integer,Float> productosRefrigerantesConGranCapacidad(){
		/** que retorna un map cuyas claves son los códigos de los productos
		refrigerantes que tienen una capacidad mayor o igual a 300 lts y son de 
		origen argentino.
		**/
	}
```

----
- Testear el método "calcularPrecioFinal" de la clase "ProductoPerecedero".
----

- Leer el siguiente enunciado y comentar con palabras cuáles serían
las clases abstractas, interfaces, clases no abstractas, atributos y métodos
que crearía.

```
Realizar un sistema de control de mascotas para una veterinaria. 

La veterinaria tiene una lista de mascotas. Cada mascota debe tener un nombre, una fecha de nacimiento y
un dueño. Las mascotas pueden ser perros, gatos y tortugas. Para los perros y los gatos hace falta saber su raza.

Cada mascota tendrá una lista de fechas en los que fue a controlarse al veterinario.

Los perros deberán asistir al veterinario mínimo 4 veces al año.
Los gatos deberán asistir al veterinario mínimo 2 veces al año.
Las tortugas deberán asistir al veterinario mínimo 1 vez al año.

Requerimientos a cumplir por el sistema:

1) Conocer si una mascota cumple con las visitas obligatorias al veterinario del año actual.
2) Conocer si una mascota tiene asistencia perfecta al veterinario desde el momento que nació.
3) Listar las razas de perros que no hayan cumplido con la asistencia mínima del año actual.
4) Conocer qué tipo de mascota (perro, gato o tortuga) tuvo mejor asistencia en el año actual.
```
