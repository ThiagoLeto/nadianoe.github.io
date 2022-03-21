---

### Laboratorio de Algoritmos y Estructuras de Datos

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

