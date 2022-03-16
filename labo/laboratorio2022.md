---
### Laboratorio de Programación Orientada a Objetos
---

<details>

<summary> 15 de Marzo - comentarios </summary>
  
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


<details>

<summary> 9 de Marzo -  ArrayList - ejemplo </summary>

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

---

<details>

<summary> 9 de Marzo - ejercicio 1 </summary>
  
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

---

<details>

  <summary> 9 de Marzo - ejercicio 2 - ArrayList </summary>
  
  - Crear un sistema ABM. Un sistema ABM es un sistema que permite ralizar 3 acciones principales:
  A -> alta -> ingreso de datos 
  B -> baja -> eliminaciòn de datos
  M -> modificaciòn -> modificación de datos

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

<details>
    <summary> 8 de Marzo - ejemplos </summary>
    
- [Ejemplo Main.java](https://github.com/nadianoe/nadianoe.github.io/blob/master/labo/marzo2022/Main.java)

- [Ejemplo Persona.java](https://github.com/nadianoe/nadianoe.github.io/blob/master/labo/marzo2022/Persona.java)

- [Ejemplo IngresoDeDatos.java](https://github.com/nadianoe/nadianoe.github.io/blob/master/labo/marzo2022/IngresoDeDatos.java)

</details>

---

<details>
  <summary> 8 de Marzo - parte 1 </summary>
  
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

----

<details>
  <summary> 8 de Marzo - parte 2 </summary>
  
1. Crear una aplicación que pida al usuario ingresar los datos necesarios para crear un objeto de la clase Persona.
2. Crear la instancia de la clase Persona e imprimir cuáles fueron los datos ingresados utilizando "getters".
3. Ofrecerle al usuario la opción de cambiar uno de sus datos (el usuario deberá elegir), realizar el cambio utilizando
"setters" e imprimir nuevamente los datos del objeto creado.


</details>

  ------
  

