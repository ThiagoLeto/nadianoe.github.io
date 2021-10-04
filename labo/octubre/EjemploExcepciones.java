package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

class Ejemplo1 {

    public static void main(String[] args) {

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);

        try {

            b.get(9);

            for (Integer numero : b) {
                b.remove(numero);
            }

        } catch (IndexOutOfBoundsException exception1) {
            exception1.printStackTrace();
        } catch (ConcurrentModificationException exception2){
            exception2.printStackTrace();
        }
    }
}

class Ejemplo2 {

    public static void main(String[] args) {

        try {

            String s = null;
            s.length();

        } catch (NullPointerException exception2){
            String m = exception2.getMessage();
            System.out.println(m);
        }
    }
}

class Ejemplo3 {

    public static void main(String[] args) {

        try {

            int res = 1 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}

public class  EjemploExcepciones {

    public static void main(String[] args) {

        ArrayList<Persona> personasRegistradas = new ArrayList<>();
        
        boolean registroRealizado = false;

        while (!registroRealizado) {

            try {

                System.out.println("Ingrese su nombre: ");
                String nombre = Consola.obtenerString();

                System.out.println("Ingrese su edad: ");
                int edad = Consola.obtenerNumeroEntero();

                Persona persona = new Persona(nombre,edad);
                personasRegistradas.add(persona);
                
                registroRealizado = true;
                System.out.println("¡Registro realizado!");

            } catch (EdadInvalidaException excepcion) {
                excepcion.printStackTrace();
                System.out.println(excepcion.getMessage());

            } catch (InputMismatchException excepcion) {
                excepcion.printStackTrace();
                System.out.println("Tipos de datos incorrectos, ingrese de nuevo.");
            }
        }
    }
}

class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre) throws EdadInvalidaException {
        this.nombre = nombre;
        validarEdad(edad);
        this.edad = 0;
    }

    public Persona(String nombre, int edad) throws EdadInvalidaException {
        this.nombre = nombre;
        validarEdad(edad);
        this.edad = edad;
    }

    public void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad >= 102){
            throw new EdadInvalidaException();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadInvalidaException {
        validarEdad(edad);
        this.edad = edad;
    }
}

class EdadInvalidaException extends Exception {

    @Override
    public String getMessage() {
        String mensaje = "las edades sólo pueden ser mayores o iguales a cero \n" +
                "Vuelva a ingresar sus datos.";
        return mensaje;
    }
}

class Consola {

    public static String obtenerString(){
        Scanner ingreso = new Scanner(System.in);
        String valorIngresado = ingreso.nextLine();
        return valorIngresado;
    }

    public static int obtenerNumeroEntero(){
        Scanner ingreso = new Scanner(System.in);
        int valorIngresado = ingreso.nextInt();
        return valorIngresado;
    }
}
