---

### Laboratorio de Algoritmos y Estructuras de Datos

----

#### [libro de consulta y ejercicios](https://github.com/nadianoe/nadianoe.github.io/blob/master/laboratorio4to/Nell%20Dale_%20Chip%20Weems%20-%20Programaci%C3%B3n%20y%20resoluci%C3%B3n%20de%20problemas%20con%20C++-McGraw%20Hill%20(2007).pdf)


----
#### 5 de Abril

<details>
	<summary> Ejercicio integrador </summary>
Crear un programa que reciba un número y luego indique si el número ingresado pertenece
al conjunto A, al conjunto B, al conjunto C o a todos los conjuntos.
	
```
 A = (1, 10) U (130, 1000] 
 B = [-1, 3)  U (500, 800)
 C = (0, 5000) U [5001, +infinito)
```
	
Tener en cuenta que:
	
```
A ∩ B ∩ C = (1,3] U (500, 800)
```
	
</details>


<details>
	<summary> Exámen </summary>
	
1. Calcular y comentar los valores de verdad de las variable a, b y f en aquellas líneas donde aparecen.
Copiar todo el código en un archivo llamado ejercicio1_29deMarzo.cpp y colocar las respuestas como comentarios de  c++.

```c++
int main(){
	
	bool a = true;
	bool b = false;
	int c = 0;
	int d = 123;
	int e = 100;
	bool f = c == 0;
	f = c > 12;
	f = d > 89;
	f = e >= 100;
	f = e > 100;
	f = (f && e == 5) || c == 0;
	f = !a || d == 0;
	f = d == 0;
	f = d != 0;
	f = !b && e != 0;
	c++;
	f = c == 90;
	c++;
	d--;
	f = c > 90 && d < 0;
	f = !b || !f;
	a = !f && d > 0;
	e++;
	b = e == 12 || e == 13;
	a = (false && !false) || (!true || false)
	a = (d > 0 && d <= 100) || (c != 9)
	f = !(true || false) || (a == false)

}
```

2. Crear un algoritmo mediante diagramas de flujo que sirva para indicar si un número ingresado por el usuario es par o impar.
3. Sea 
```		      
 A = [-3,4] U (12,900) y B = (550,4000)  U (5000,+inf)
```
Crear un algoritmo mediante diagramas de flujo que reciba un número y luego indique si el mismo pertenece
a A, B o a ambos conjuntos.
4. Crear un algoritmo mediante diagramas de flujo que reciba un nombre, un apellido y una edad y luego imprima un saludo que cumpla con el siguiente formato: 
```
Los datos ingresados son los siguientes:
- Nombre: Gloria
- Apellido: Flora
- Edad: 88
```
En el ejemplo, los valores ingresados fueron: Gloria, Flora y 88

5. Implementar los algoritmos creados en los puntos 2, 3 y 4 utilizando el lenguaje de programación c++.
Cada ejercicio deberá estar en un mismo archivo. 
- Se deberá proveer un menú de opciones: 
	- opción 1, utilizar aplicacion de ejercicio 2
	- opción 2, utilizar aplicación de ejercicio 3
	- opción 3, utilizar aplicación de ejercicio 4
- Cuando el usuario elija e ingrese una opción, se deberá poder utilizar la aplicación elegida y luego deberá finalizar el programa.
			      
</details>
	
----
#### 31 de Marzo

<details>
<summary> Ejercicios  </summary>  
- Página 202, ejercicio 3 y ejercicio 6
</details>

----

#### 29 de Marzo

<details>
<summary> Exámen  </summary>  


1. Calcular y comentar los valores de verdad de las variable a, b y f en aquellas líneas donde aparecen.
Copiar todo el código en un archivo llamado ejercicio1_29deMarzo.cpp y colocar las respuestas como comentarios de  c++.

```c++
int main(){
	
	bool a = true;
	bool b = false;
	int c = 89;
	int d = 0;
	int e = 12;
	bool f = c == 0;
	f = c > 12;
	f = c > 89;
	f = c >= 89;
	f = f && e == 5;
	f = !a || d != 0;
	f = d == 0;
	f = d != 0;
	f = !b && e > 0;
	c++;
	f = c == 90;
	c++;
	d--;
	f = c > 90 && d < 0;
	f = b && !f;
	a = !f && d > 0;
	e++;
	b = e == 12 || e == 13;
	a = (true && !false) || (false || false)
	a = (d > 0 && d < 100) || (c == 89)
	f = !(true || false)

}
```

2. Crear un algoritmo mediante diagramas de flujo que sirva para indicar si un número ingresado por el usuario es impar y menor a 100, en caso de que el número ingresado no cumpla con los requisitos, deberá imprimir "No es impar y menor a 100".
3. Crear un algoritmo mediante diagramas de flujo que reciba un número y luego indique si el mismo es positivo, negativo o igual a cero.
4. Crear un algoritmo mediante diagramas de flujo que reciba dos nombres y luego imprima un saludo que cumpla con el siguiente formato: "¡Hola, Gloria y Walter!" (en este caso, los nombres ingresados fueron Gloria y Walter).
5. Implementar los algoritmos creados en los puntos 2, 3 y 4 utilizando el lenguaje de programación c++.
Cada ejercicio deberá estar en un mismo archivo. 
- Se deberá proveer un menú de opciones: 
	- opción 1, utilizar aplicacion de ejercicio 2
	- opción 2, utilizar aplicación de ejercicio 3
	- opción 3, utilizar aplicación de ejercicio 4
- Cuando el usuario elija e ingrese una opción, se deberá poder utilizar la aplicación elegida y luego deberá finalizar el programa.

			      
</details>

----
#### 22 de Marzo

<details>
<summary> Ejercicios </summary>  

1. Capítulo 5
- Ejercicios de preparación para exámen
	- Página 198, ejercicios 5 y 10
	- Página 199, ejercicios 14 y 15

- Ejercicios de calentamiento para programación
	- Página 199, ejercicio 1
	- Página 200, ejercicio 10	
2. Crear una aplicación que sirva para calcular el área de un triángulo siendo la base y la altura ingresadas por el usuario (recordatorio: area = (base * altura) / 2 para cualquier tipo de triángulo).
3. Crear una aplicación que sirva para realizar las cuatro operaciones básicas (suma, resta, división y multiplicación) con dos números ingresados por el usuario. El usuario deberá elegir qué operación realizar.
4. Modificar el programa del ejercicio anterior para que se muestre un mensaje de error si se intenta dividir por cero (recordatorio: 0/k = 0, k/0 = indefinido para cualquier k).
5. Realizar una aplicación que calcule el monto total a pagar por cada cliente de una librería. El sistema deberá recibir la cantidad de libros que comprará el cliente y luego imprimir el monto total a abonar. 
Con respecto a los precios de los libros, todos los libros cuestan $300 pero llevando más de 5 libros cuestan $250 c/u.
6. Realizar un programa donde el usuario ingrese un número y que muestre por pantalla si el mismo es par o impar

</details>

---

#### 17 de Marzo
<details>
<summary> Ejemplo de exámen </summary>  

1. Calcular y comentar el valor de verdad de las siguientes expresiones.

```c++
int main(){
	
	int a = 5;
	int b = 6;
	bool c = true;
	bool d = a <= 5;
	d = a >= 100;
	d = a == 6;
	d = !(a == 6);
	d = a == b;
	b--; 
	d = a == b;
	a++;
	d = b == a;
	b = 2;
	a = 1;
	d = a > -10 && a < 10;
	d = b <= 2 || b >= 200;
	d = b == 1 || b == 22;
	d = a < 5 && b > 0;
	d = a >= 70 && true;
	d = false || b <= 10;
	d = a == 1 || a == -1;
	d = a > 1 || a < -1;
	d = (true && false) || (true && true);
	d = (false || true) || (true && false);
	d = !d;
	d = d && d;
	d = d || d;
	d = (!d) || d;

}
```

2. Crear un algoritmo mediante diagramas de flujo que sirva para recibir un número y
luego indicar si el mismo es mayor o igual a 19. En caso de que no lo sea, deberá imprimir
"intente nuevamente".
3. Crear un algoritmo mediante diagramas de flujo que sirva para recibir un nombre y 
luego imprimir una triplicación del mismo.
Es decir, por ejemplo, si el ususario ingresa "Gloria", el algoritmo deberá imprimir
"GloriaGloriaGloria".
4. Crear un algoritmo mediante diagramas de flujo que reciba dos números e indique si uno de ellos es la triplicación del 
otro. Es decir, por ejemplo, si el ususario ingresa el 3 y el 9, el algoritmo deberá imprimir
"El segundo número es la triplicación del primero"´; en caso contrario, deberá imprimir "El primer número
es triplicación del segundo" o "intente nuevamente". (Incluir la utilización de un "else if").
5. Implementar los algoritmos creados en los puntos 2, 3 y 4 utilizando el lenguaje de programación c++.
Cada ejercicio deberá estar en un mismo archivo. 
- Se deberá proveer un menú de opciones: 
	- opción 1, utilizar aplicacion de ejercicio 2
	- opción 2, utilizar aplicación de ejercicio 3
	- opción 3, utilizar aplicación de ejercicio 4
- Cuando el usuario elija e ingrese una opción, se deberá poder utilizar la aplicación elegida y luego
  deberá finalizar el programa.


</details>

---

#### 15 de Marzo

<details>

<summary> Ejemplo  </summary>  

```c++
#include <iostream>

using namespace std;

int main(){
    
    /* Sea A un conjunto tal que 
       
       A = (-∞,2) U [4,10]
      
    */
    
    int a = 5;
    
    
    if(a < 2){
        cout << "Es menor a 2. Pertenece a A."  << endl;
    } else if (a >= 4 && a <= 10){
        cout << "Está entre 4 y 10. Pertenece a A" << endl;
    } else {
        cout << "No pertenece a A."<< endl;
    }
    
    a = a + 1;
    a = a - 1;
    a = 2 * a;
    a = a + 2;
    a = a + 1;
    a++;
    a = a - 1;
    a--;
    
    int b,c,d;
    
    b = 1;
    b++;
    c = b;
    
    cout << c << endl;
    
    /** negación **/
    
    bool f = true;
    f = !f; // false
    f = b > 90;
    f = !(b > 2);
    
    /** trabajo con strings **/
    
    string d = "hola";
    d = d + d; // "holahola"
    string e = "chau";
    e = e + d; // "holaholachau"

    return 0;
}
```
</details>

<details>

<summary> Enunciado </summary>

1. Crear una variable de tipo int que se llame "num1" y contenga al número 10
2. Crear una variable de tipo string que se llame "palabra" y contenga el dato "abcdef"
3. Crear una variable de tipo bool que se llame "esCierto" y contenga el dato false
4. Cambiar el valor de la variable "num1", la misma deberá contener el valor que contiene
pero incrementado en 1.
5. Cambiar el valor de la variable "palabra", la misma deberá contener 3 repeticiones del
valor que ya contiene.
6. Cambiar el valor de la variable "esCierto", la misma deberá contener la negación del valor 
que ya contiene.
7. Cambiar el valor de la variable "num1", la misma deberá contener el doble del valor que
ya contiene.
8. Crear una variable de tipo int que se llame "num2" y contenga el valor de la variable "num1"
incrementado en 4
9. Modificar el valor de la variable "num2", la misma deberá contener el valor que contiene pero disminuido en 2

</details>

----

#### 10 de Marzo

<details> 

<summary> Material extra visto en clase </summary>

- [diapositivas](https://github.com/nadianoe/nadianoe.github.io/blob/master/laboratorio4to/Clase%203_C++.pdf)
- [tablas de verdad](https://raw.githubusercontent.com/nadianoe/nadianoe.github.io/master/laboratorio4to/tabladeverdad.jpg)

</details>


<details> 

<summary> Ejemplo </summary>

```c++
#include<iostream>

using namespace std;

int main(){

	// este es un comentario de una línea

	/* 
	este es un 
	comentario
	de varias lineas
	*/

	/**
	enteros -> int
	cadenas "sdgdfg" "3453#$%#$&/"  -> string
	decimales -> float
	bool -> true , false
	**/


	/* imprimir por consola */
	cout << "aaaaaa" << endl;

	cout << "bbbbbb" << endl;

	cout << "cccccc" << endl;

	/** pedir un número por consola **/
	cout << "Ingrese un número" << endl;

	int numero = 234;
	numero = 23;
	numero = 45;

	string hola = "Nadia     &/$%&)()"; 
	
	int numero1;
	cin >> numero1;
	cout << "El número ingresado fue: " << numero1 << endl;

    	/** pedir un nombre por consola **/
	cout << "Ingrese un nombre" << endl;
	string nombre;
	cin >> nombre;
	cout << "El nombre ingresado fue:" << nombre << endl;


	/**
	int f = 4;
	int g = 1;
	int suma = f + g; // 5
	string h = "1";
	string i = "5";
	string c = h + i; // "15"
	**/



	/**
	    comparadores: 
		== , != , < , >, <= , >= 
   	**/

	int a = 23;
	int b = 1;

	bool condicion = a == 34;
	condicion = a != 4;
	condicion = a > 3;
	condicion = a >= 5;
	condicion = a <= 100;
	condicion = a == b;
	condicion = a < b;
	condicion = a == 23;
	condicion = false;
	condicion = true;
	condicion = false && false;
	condicion = false || true;
	condicion = !true;
	condicion = b > 0 && b < 10;


	if (condicion){
		cout << "hola"<< endl;
	} else {
		cout << "chau" << endl;
	}

	cout << "fin";

	return 0;
}
```
</details>


<details> 

<summary> Enunciado </summary>

- Programar en c++ los algorimos realizados la clase pasada.
- Cada ejercicio debe estar en un archivo separado.

</details>

----

#### 8 de Marzo 


<details>

<summary> Diapositivas </summary>

- [diapositivas, parte 1](https://github.com/nadianoe/nadianoe.github.io/blob/master/laboratorio4to/Clase%201_%20Introducción%20al%20Laboratorio.pdf)
- [diapositivas, parte 2](https://github.com/nadianoe/nadianoe.github.io/blob/master/laboratorio4to/Clase%202_%20Sentencias%20condicionales.pdf)

</details>

<details>
<summary> Ejercicios </summary>

1. Crear un algoritmo que reciba dos números y luego indique cuál es el número mayor.
2. Crear un algoritmo que reciba un número y luego indique si el nùmero recibido es igual o distinto a 800.
3. Crear un algoritmo que reciba un número e indique si el nùmero recibido es mayor a 100 o  menor a 50.
4. Crear un algoritmo que reciba un número e indique si el nùmero recibido es mayor a 18 y menor a 90.
5. Crear un algoritmo que reciba la edad del usuario y luego indique si es mayor o menor de edad.
6. Crear una aplicación que le muestre un menú al usuario. El menú deberá ofrecerle realizar 2 operaciones:
   - sumar 3 números
   - calcular el promedio de 3 números
   
La aplicación deberá retornar el resultado calculado.

</details>

----

