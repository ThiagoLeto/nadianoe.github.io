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
