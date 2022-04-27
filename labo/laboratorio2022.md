---
### Laboratorio de Programación Orientada a Objetos
---

#### [Libro que utilizaremos en la materia](https://github.com/nadianoe/nadianoe.github.io/blob/master/labo/Luis%20Joyanes%20Aguilar_%20Ignacio%20Zahonero%20Mart%C3%ADnez%20-%20Programaci%C3%B3n%20en%20Java%20_%20algoritmos%2C%20programaci%C3%B3n%20orientada%20a%20objetos%20e%20interfaz%20gr%C3%A1fica%20de%20usuario-McGraw-Hill%20(2011)%20(1).pdf)

----

#### 26 de Abril

<details> 
	<summary> Ejercicio  1 </summary>
	
- Con respecto al ejercicio relacionado con una librería, se necesitan agregar
funcionalidades. Ahora, no sólo administrará la cantidad de libros 
vendidos; también calculará el precio de libros comprados por cliente.

- Con respecto al precio de libros, la librería ofrece un cincuenta 
porciento de descuento al importe de cada libro que pertenece a cierto 
conjunto de editoriales.

Para ello, se debe:

- crear HashSet de editoriales con descuento en la clase Librería.

- crear un método que sirva para agregar editoriales al 
HashSet mencionado.

- Crear un hashmap para almacenar la información de cada venta realizada.
  Dicho hashmap debe asociar una instancia de la clase cliente con el importe total 
  de la compra que realizó.

- Deberá exitir una clase llamada Cliente que tendrá un id y un hashmap que
 asocia un libro y las unidades compradas del mismo.

- Las instancias de la clase Cliente deberán estar almacenadas en un hashset.

- Crear un método que imprima los libros comprados del cliente, sus respectivas
unidades y el importe total de la compra.	
</details>

<details>
	<summary> Ejercicio 2 </summary>

1) Crear una subclase de la clase persona que represente a un alumno de una escuela, debe llamarse Alumno. Los atributos que debe tener el alumno son:

- Curso, que debe ser de tipo String.
- Notas, que debe ser de tipo HashMap que asocia un String y un ArrayList de floats representando el nombre de la materia y las notas que tiene el alumno en la misma, respectivamente.
La declaración del atributo será la siguiente:
```java
  private HashMap<String,ArrayList<Float>> notasPorMateria;
```
2) Se deben crear los métodos:

- Agregar Nota
- Menor Nota
- Mayor Nota
- Promedio Notas

- Agregar Materia

Comentarios: 
- En el/los constructor/es de la clase Alumno sólo se deberán inicializar el HashMap
y el curso.
- El método agregarMateria se deberá declarar de la siguiente forma:
```java
  public void agregarMateria(String nombreDeMateria){
  
  }
```
 Y en la implementación, se deberá crear un ArrayList, inicializarlo y luego
 agregarlo al HashMap como valor acompañado de su correspondiente clave.

</details>

<details> 
	<summary> Ejemplo visto </summary>
	
```java
	
package com.company;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {
        
        // < (x,y) >
        // < (1,4), (3,4), (6,4) >
        // < (a,3), (f,7), (l,2) >
        // ala : cada uno de los órganos o apéndices pares que utilizan algunos animales para volar.
        // barra : pieza de metal u otra materia, de forma generalmente prismática o cilíndrica y mucho más larga que gruesa

        HashMap<String,String> diccionario = new HashMap<>();

        diccionario.put("ala","Cada uno de los órganos o apéndices pares que utilizan algunos animales para volar.");
        diccionario.put("barra","Pieza de metal u otra materia, de forma generalmente prismática o cilíndrica y mucho más larga que gruesa");

        for ( String key : diccionario.keySet() ){
            String valor = diccionario.get(key);
            System.out.println(valor);
        }

        HashMap<String,Integer> palabraConNumero = new HashMap<>();
        palabraConNumero.put("uno",1);
        palabraConNumero.put("dos",2);
        palabraConNumero.put("tres",3);
        palabraConNumero.put("cuatro",4);

        palabraConNumero.values();

        palabraConNumero.containsValue(3);

        palabraConNumero.containsKey("tres");

        palabraConNumero.remove("tres");

        palabraConNumero.clear();

        palabraConNumero.isEmpty();

        palabraConNumero.size();

        HashMap<String,Float> preciosDeProductos = new HashMap<>();
        preciosDeProductos.put("fideos",56.45f);
        preciosDeProductos.put("puré de tomates",30.55f);
        preciosDeProductos.put("yogur",30.55f);
        
        for ( String nombreClave : preciosDeProductos.keySet() ){
            Float valor = preciosDeProductos.get(nombreClave);
            System.out.println(valor);
        }

        System.out.println(preciosDeProductos);
        //{puré de tomates=30.55, yogur=30.55, fideos=56.45}

        /*
        Documentación oficial:
        https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
        */
    }
}
	
```
	
</details>
	
	
----
	
#### 20 de Abril

<details> 
	<summary> Ejercicio </summary>
	
1. Crear un programa que le pida al usuario una cantidad
de números. La cantidad de números ingresados la determinará el usuario. Los números ingresados deberán ser guardados en un ArrayList.

- Luego, quitar los elementos repetidos del ArrayList utilizando
un HashSet; mostrar en pantalla los elementos que el ArrayList
contiene luego de haber quitado los repetidos.

2. Crear otro programa que le pida al usuario una cantidad
de números. La cantidad ingresada la determinará el usuario.
Los números ingresados deberán ser guardados en un ArrayList.

- Pedir que el usuario realice lo mismo otra vez, crear otro
ArrayList con los números ingresados en esta segunda vez.

- El programa deberá verificar si las dos secuencias tienen los 
mismos elementos, sin importar el orden o la cantidad de apariciones.
Utilizar la comparación de HashSets para realizar la verificación.

</details>

<details> 
	<summary> Ejemplo - HashSets </summary>
	
```java
import java.util.ArrayList;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {
	  
	    ArrayList<Integer> lista = new ArrayList<>();
	    lista.add(3);
	    lista.add(7);
	    
	    HashSet<Integer> conjunto = new HashSet<>();
	    conjunto.add(3);
	    conjunto.add(3);
	    conjunto.add(3);
	    conjunto.add(7);
	    // <7,3>
	    
	    for ( Integer numero : conjunto ){
	        System.out.println(numero);
	    }
	    
	  
	    HashSet<Persona> personas = new HashSet<>();
	    
	    Persona p1 = new Persona();
	    Persona p2 = new Persona();
	    
	    personas.add(p1);
	    personas.add(p1);
	    personas.add(p2);
	    // <p2,p1>
	}
}
	
```
	
</details>

----

#### 13 de Abril

<details> 
	<summary> Exámen </summary>
	
1. Tomar la clase Persona creada en clases anteriores y agregarle 
	el método "esUnAdultoJoven" retorne true si la edad de la persona
	es mayor o igual a 18 y menor o igual a 35.

2. Crear la clase Canción que tenga como atributos: "nombre" (una variable de tipo String) y "duraciónEnSegundos" (una variable de tipo int)
   - Agregar un constructor por defecto y un constructor que reciba
   un nombre y una duración expresada en segundos.
   - Agregar un método que se llame "esUnaCancionLarga" que retorne
   true si la canción tiene una duración mayor o igual a 240 segundos.

3. Crear la clase Cantante como subclase de la clase Persona.
	- Agregarle el atributo "nombreArtístico" como variable de
	tipo String y el atributo "canciones" como variable
	de tipo ArrayList que sirva para almacenar objetos de la 
	clase Canción.
	- Agregar un método que se llame "obtenerCancionesMasLargas" 
	que retorne una lista con los nombres de las canciones más largas.
	- Agregar un método que se llame "agregarCanción" que reciba un nombre
	de canción y una duración en segundos.

4. Crear la clase SistemaDeCantantes que tenga como atributo una lista
   de objetos de la clase Cantante llamada "cantantes". 
   - Agregar un constructor por defecto.
   - Agregar un método llamado "obtenerCantantesJovenes" que retorne un
   ```ArrayList<Cantante>``` que contenga a los cantantes que tienen una edad entre 18 y 35. 
   - Agregar un método llamado "agregarCancion" que reciba tres parámetros: el nombre artístico del cantante, nombre de la canción y
   la duración de la canción en segundos. Este método deberá agregar una
   nueva canción a la lista de canciones del artista indicado.

5. Crear 1 objeto de la clase Cantante utilizando el constructor por 
   defecto y luego cambiarle el nombre artístico utilizando un "setter".
   Comprobar que el cambio se realizó correctamente utilizando un "getter".

	
	</details>
	
----
	
#### 6 de Abril

<details>
	<summary> Ejercicio </summary>
	
- Realizar un sistema para administrar pedidos de almuerzos realizados por alumnos.
- Para los alumnos además de los atributos de la clase Persona que ya tienen creada, se deberán incluir:
	- Curso
	- nro. de legajo
	- orientación
	
- Existen diferentes platos que se pueden solicitar, para ellos los datos a incluir son: Nombre y Precio.
	- Para esto, deberán crear la clase Plato y tener como atributos un nombre y un precio.
- Al cargarse un pedido se incluye la fecha de creación, el objeto Plato correspondiente, la persona que lo pidió, hora de entrega y si ya se entregó o no.
	- Para esto deberán crear la clase Pedido 
- Debe existir un menú (interfaz de usuario) donde se puedan agregar, modificar y eliminar pedidos. 
	- Estas funcionalidades deberán ser proporcionadas por una clase llamada "SistemaAlmuerzos".
- Se debe poder imprimir un listado de los platos a cocinar en el día con su precio considerando el descuento aplicado.
	- El método que realice ésto, deberá llamarse "imprimirInforme".
	
</details>

<details>
	<summary> Clases para fechas </summary>
	
```java
package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EjemploTiempo {

    public static void main(String[] args) {

        /** https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html **/
        LocalDate hoy = LocalDate.now(); //2021-10-13
        LocalDate ayer = hoy.minusDays(1);
        LocalDate mañana = ayer.plusDays(2);
        hoy.plusDays(3);
        hoy.plusMonths(4);
        hoy.plusWeeks(5);
        hoy.plusYears(6);
        hoy.minusMonths(3);
        hoy.minusWeeks(5);
        hoy.minusYears(3);
        mañana.isAfter(hoy);
        hoy.isBefore(mañana);
        hoy.isEqual(hoy);

        /** https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html**/

        LocalTime ahora = LocalTime.now(); //00:08:16.922686252
        LocalTime tiempo1 = LocalTime.of(10, 43, 12);
        LocalTime tiempo2 = tiempo1.minusHours(2);
        LocalTime tiempo3 = tiempo2.minusMinutes(34);
        LocalTime tiempo4 = tiempo1.plusHours(4);
        LocalTime tiempo5 = tiempo2.plusMinutes(18);
        tiempo1.isAfter(ahora);
        ahora.isBefore(tiempo1);
        tiempo1.equals(tiempo1);

        /** https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html**/
        LocalDateTime fechaYHora = LocalDateTime.now();
    }
}
	
```
	
</details>

<details> 
	<summary> Comentarios sobre ejercicio del 5 de Abril </summary>
	
```java
	
public class Madre extends Persona {
	
	private String nombreDeEmpresa;
	private ArrayList<Hijo> hijos;

	/** más código **/

	public ArrayList<Hijo> hijosMenoresDeEdad(){
	    ArrayList<Hijo> hijosMenores = new ArrayList<>();
	    for (Hijo hijo : this.hijos){
		if (!hijo.esMayorDeEdad()){
		    hijosMenores.add(hijo);
		}
	    }
	    return hijosMenores;
	}
}
```
	
```java
public class Hijo extends Persona {
	private String nombreDeEscuela;
	private String juegoFavorito;
	
	/** código código **/
	
}
```
	
</details>

-----

#### 5 de Abril

<details>
	<summary> Ejercicio - herencia de clases </summary>
	
- Crear dos subclases de la clase Persona.

- Una de ellas debe ser la clase "Madre", que tendrá los atributos:
	- nombre de empresa en la que trabaja 
	- lista de hijos

- La otra clase a crear es "Hijo", que tendrá los atributos:
	- escuela a la que asiste
	- juego favorito

- Las subclases deben tener su respectivo constructor por defecto,
sus respectivos constructores con parámetros.

- La clase Madre debe tener un método que devuelva una colección de tipo
ArrayList con los hijos menores de edad.
	
</details>

<details>
	<summary> Ejemplos vistos </summary>
	
```java
public class Main {
	public static void main(String[] args) {
	    
	    Alumno a = new Alumno();
	    System.out.println(a.getNombre());
	}
}
```
	
```java


public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private int telefono;

    public Persona(){
        this.nombre = "Claudia";
        this.apellido = "Geretti";
        this.edad = 12;
        this.dni = 22345123;
        this.telefono = 1145678900;
    }

    public Persona(String nombre, String apellido, int edad, int dni, int telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 12;
        this.dni = 22345123;
        this.telefono = 1145678900;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

  
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean esMayorDeEdad(int edad){
        boolean esMayor= edad>=18;
        return esMayor;

    }

}
```
	
```java

public class Alumno extends Persona {
	
    private int numDeLegajo;
    private String curso;

    public Alumno() {
        super();
        this.numDeLegajo = 1234;
        this.curso = "1°A";
    }

    public Alumno(String nombre) {
        super(nombre, "De la Casa");
        this.numDeLegajo = 1234;
        this.curso = "1°A";
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido);
        this.numDeLegajo = 1234;
        this.setEdad(edad);
        this.curso = "1°A";

    }

    public Alumno(String nombre, String apellido, int edad, int dni, int telefono, int numDeLegajo, String curso) {
        super(nombre,apellido,edad,dni,telefono);
        super.setEdad(edad);
        this.numDeLegajo = numDeLegajo;
        this.curso = curso;
    }

}

```
</details>	

----

#### 30 de Marzo
<details>
	<summary> Enunciado </summary>

- Se debe implementar una parte de un sistema que sirve para registrar datos
de aquellos alumnos que salen y entran de sus aulas. Para ello, deberán:

- Crear la clase Persona, la misma debe tener como atributos: nombre y dni.
- Crear la clase Alumno, la misma debe tener como atributos: nombre, dni y nroDeLegajo.
- Crear la clase Aula, la misma deberá tener como atributos: número y una lista
  de alumnos que ingresaron a la misma durante todo un dia (si un alumno ya ingresó, salió
  y volvió a ingresar, se cuentan dos ingresos). Esta clase deberá tener sólo el constructor por defecto.
	
- En la clase Aula, crear un método que retorne un ArrayList que contenga los números de dni (sin repetidos) de los alumnos que ingresaron al aula durante el dia. El método deberá llamarse "dnisDeAlumnosIngresantes".

- Crear un método que reciba un ArrayList con la estructura del ítem anterior e imprima sus elementos.

- En la clase Aula, crear un método que reciba el dni de un alumno y
luego retorne la cantidad de ingresos que realizó. 

- En la clase Aula, crear un método que imprima por consola el dni de cada alumno y
la cantidad de ingresos que realizó. El método deberá llamarse "cantidadDeIngresosPorAlumno".
La impresión de sus elementos deberá respetar el siguiente formato:
```
  clave/dni: 121234343531 - valor/cantidad: 3
```
- Crear un método en la clase Aula que retorne el nombre del alumno que ha realizado más ingresos al aula.
	
</details>

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
  

