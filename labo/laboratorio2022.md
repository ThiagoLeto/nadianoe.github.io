---
### Laboratorio de Programación Orientada a Objetos
---

#### [Libro que utilizaremos en la materia](https://github.com/nadianoe/nadianoe.github.io/blob/master/labo/Luis%20Joyanes%20Aguilar_%20Ignacio%20Zahonero%20Mart%C3%ADnez%20-%20Programaci%C3%B3n%20en%20Java%20_%20algoritmos%2C%20programaci%C3%B3n%20orientada%20a%20objetos%20e%20interfaz%20gr%C3%A1fica%20de%20usuario-McGraw-Hill%20(2011)%20(1).pdf)

----
#### 29 de Marzo
<details>
  <summary> Ejercicios </summary>
- Realizar los siguientes ejercicios del libro
	- página 220, ejercicio 8.1
	- página 266, ejercicio 10.7, 10.8
	
</details>


----
#### 22 de Marzo
<details>
  <summary> Enunciado </summary>
  
- Sea una librería, se necesita un sistema para administrar la información que 
se recolecta cada día.

- Actualmente, la librería vende libros de las siguientes editoriales:
	- Kapelusz, Sudamericana, Atlántida, ElAteneo, Interzona, Sur y Alianza.

- Editoriales con 50% de descuento:
	- ElAteneo, Interzona, Sur y Alianza.

Para ello, se deberá:

1. Crear la clase Libro, en la misma deben existir los atributos:
	- id
        - nombre
	- precio
	- editorial

2. Crear la clase Cliente, en la misma deben existir los atributos:
	- id
	- nombre
	- edad
	- libros comprados (ArrayList de libros)

3. Crear la clase SistemaLibreria, en la misma deben existir los atributos:
	- clientes (ArrayLis de clientes)
	- libros en venta (ArrayList de libros)
	- libros en oferta (ArrayList de id's)
	- libros vendidos (ArrayList de libros)
	- nombre

4. El sistema deberá tener métodos que permitan :
- obtener una lista de los clientes más frecuentes (se considera cliente frecuente al que
ha comprado más de 10 libros)
- obtener una lista con los libros más vendidos, es decir, aquellos libros
que han tenido más de 100 ventas
- obtener una lista con las edades de los clientes más frecuentes
- obtener una lista con los libros más caros, es decir, aquellos que salen más de $5500,50
- realizar una venta, es decir, crear una nueva instancia de la clase libro y agregarla
a la lista de libros vendidos
- obtener lista de los libros cuyos nombres comienzan con determinada letra 
- Calcular el precio final abonar por el cliente (tener en cuenta que los libros cuya editorial 
pertenece a las editoriales en oferta, tienen un 50% de escuento)
- cambiar el precio de un libro según el id. El porcentaje de descuento debrá ser
 pasado como parámetro.
- cambiar los precios por navidad:
	- si los id de los libros son pares, sus precios deberán disminuir un 25%
  - si sus id's son impares, sus precios deberán disminuir un 35%

#### Comentarios:
- No imprimir ni recibir datos por consola durante la clases pedidas. Piense y utilice los
parámetros que considere convenientes para sus métodos.
- Si desea probar sus funciones imprimiendo los resultados, deberá hacerlo dentro de una función "main".
Este método deberá estar dentro de la clase SistemaLibreria.
- Cada método deberá realizar una sola tarea
- Las clases deben comenzar con letra mayúscula
- los métodos ý variables deben comenzar con letra minúscula
- Utilizar el estilo de escritura camel case
- Utilizar nombres de métodos y variables declarativos
  
</details>

----

#### 16 de Marzo

<details>
  
<summary> Ejercicio - for each </summary>
  
- Crear una clase similar a la clase llamada "SistemaDeRegistro" realizada. Esta nueva clase sólo deberá utilizar 
  estructuras repetitivas de tipo "foreach". La nueva clase deberá llamarse "Sistema".

</details>

<details>
  
<summary> Ejemplo - for each </summary>
  
```java
  
  import java.util.ArrayList;

      public class Main {

        public static void main(String[] args) {

          ArrayList<Integer> nums = new ArrayList<>();
          nums.add(1);
          nums.add(5);
  
          for (Integer elemento : nums){
            System.out.println(elemento);
          }
  
          ArrayList<Persona> personasRegistradas = new ArrayList<>();
          Persona p1 = new Persona("Jaime",45);
          Persona p2 = new Persona("Gloria",45);
          personasRegistradas.add(p1);
          personasRegistradas.add(p2);
  
          for (Persona persona : personasRegistradas){
            String nombre = persona.getNombre();
            System.out.println(nombre);
  
          }
        }
      }
  
```
 
</details>

----

#### 15 de Marzo
	
<details>
	
<summary> Comentarios </summary>
  
```java

  import java.util.ArrayList;

      public class Main {

        public static void main(String[] args) {

          /** comparación entre variables primitivas **/
          int a = 1;		
          float c = 1.54f;

          /** comparación entre clases: método "equals" **/
          String a = "hola";
          String b = "chau";
          boolean sonIguales = a.equals(b);
  
        }
      }
```  
</details>

----
	
#### 9 de Marzo
	
<details>

<summary> ArrayList - ejemplo </summary>

```java

  import java.util.ArrayList;

      public class Main {

        public static void main(String[] args) {

          /** variables primitivas **/
          int a = 1;		
          float c = 1.54f;

          /** Clases envolventes **/
          Integer b = 1;
          Float d = 1.54f;


          /** ArrayList **/

          ArrayList<Integer> nums = new ArrayList<>();
          nums.add(1);
          nums.add(5);

          int a = nums.get(0);
          nums.remove(0);

          ArrayList<Persona> personas = new ArrayList<>();

          Persona p1 = new Persona();

          ArrayList<ArrayList<Integer>> matriz = new ArrayLis<>();

            /**
            documentación:
            https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
            **/

        }
      }
```
</details>

<details>

<summary> Ejercicio 1 </summary>
  
- Crear una clase llamada Producto. La misma deberá tener como atributos:
    - nombre
    - precio

  El atributo nombre deberá ser de tipo String y el atributo precio
  deberá ser de tipo float.

  El programa deberá proveerle al usuario las siguientes tareas:

* Registro de producto.
  Aquí se deberá pedir el nombre del producto y su precio.

* Importe parcial a pagar.
  - Aquí se deberá imprimir el importe a pagar por 
  los productos registrados hasta el momento.
  - Cuando se termine de mostrar el importe mencionado, 
  el programa deberá dar la opción de realizar
  un nuevo registro.

* Finalizar registro. 
  Aquí se deberá imprimir el importe total a pagar.
  - Cuando se termine de mostrar el importe mencionado, 
  el programa no deberá dar la opción de realizar 
  un nuevo registro.
  
</details>

<details>

  <summary> Ejercicio 2 - ArrayList </summary>
  
  - Crear un sistema ABM. Un sistema ABM es un sistema que permite ralizar 3 acciones principales:
     - A -> alta -> ingreso de datos 
     - B -> baja -> eliminaciòn de datos
     - M -> modificaciòn -> modificación de datos

  - El ABM que realicen será un sistema que administre datos de personas.

  - Comentario: deberán utilizar la clase Persona que se pidió realizar la clase pasada.

  - Para ello, deberán:

1. Crear una clase que se llame "SistemaDeRegistroDePersonas". La misma deberá tener como
atriburo un arraylist que contenga objetos de la clase Personas. debe llamarse "personas".

2. El sistema deberá proveer 6 opciones que el usuario deberá elegir:

- Realizar el alta de una persona, es decir, registrar una persona. Crear un método que resuelva esta tarea.

- Realizar la baja de una persona, es decir, eliminar del registro a determinada persona. Crear otro método que resuelva esta tarea.
La eliminaciòn deberá hacerse segùn el nùmero de DNI. Crear otro método que resuelva esta tarea.

- Realizar alguna modificaciòn de algún/os dato/os una persona, es decir,brindar la opción
de modificar alguno de los atributos que tiene la persona. Crear otro método que resuelva esta tarea.

3. Tambièn le vamos a agregar funciones extra:

- Ver nombres de personas mayores de 18 años. Crear otro método que resuelva esta tarea.

- Ver lista de todas las personas registradas. Crear otro método que resuelva esta tarea.

4. También se deberá proveer la opción de Salir del sistema. 
El sistema deberá imprimir el mensaje "bye!"

</details>

----

#### 8 de Marzo
	
<details>
    <summary> Ejemplos </summary>
    
- [Ejemplo Main.java](https://github.com/nadianoe/nadianoe.github.io/blob/master/labo/marzo2022/Main.java)

- [Ejemplo Persona.java](https://github.com/nadianoe/nadianoe.github.io/blob/master/labo/marzo2022/Persona.java)

- [Ejemplo IngresoDeDatos.java](https://github.com/nadianoe/nadianoe.github.io/blob/master/labo/marzo2022/IngresoDeDatos.java)

</details>

<details>
  <summary> Parte 1 </summary>
  
  1. Crear la clase Persona con los siguientes atributos:
  - nombre
  - edad
  - dni
  - telefono
  - dirección
    
  2. Declarar e implementar 3 tipos de constructores:
  - Uno por defecto.
  - Uno con parámetro string.
  - Otro con los 5 parámetros correspondientes a todos los atributos.
  - Declarar e implementar los getters y setters.

  3. Agregar métodos con los siguientes nombres:
  - esMayorDeEdad
  - sonLaMismaPersona
  - tienenLaMismaEdad
    
  
  - Dentro de la función main, crear 3 instancias distintasde la clase Persona. 
    A la primer instancia, cambiarle el valor de la edad por el doble de la misma.
    A la segunda instancia, cambiarle el valor del teléfono.
    Con respecto a la tercer instancia, imprimir por consola todos sus datos.
    
</details>
	
<details>
  <summary> Parte 2 </summary>
  
1. Crear una aplicación que pida al usuario ingresar los datos necesarios para crear un objeto de la clase Persona.
2. Crear la instancia de la clase Persona e imprimir cuáles fueron los datos ingresados utilizando "getters".
3. Ofrecerle al usuario la opción de cambiar uno de sus datos (el usuario deberá elegir), realizar el cambio utilizando
"setters" e imprimir nuevamente los datos del objeto creado.


</details>

  ------
  

