package com.company;

import java.util.Scanner;

public class IngresoDeDatos {

    public static void main(String[] args) {

        System.out.println("Ingrese un número");
        Scanner ingreso1 = new Scanner(System.in);
        int num = ingreso1.nextInt();
        System.out.println("El número ingresado es:" + num);


        System.out.println("Ingrese un nombre");
        Scanner ingreso2 = new Scanner(System.in);
        String nombre = ingreso2.nextLine();
        System.out.println("El nombre ingresado es:" + nombre);

        Persona p1 = new Persona();
        p1.setNombre(nombre);
    }
}
