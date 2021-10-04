package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OtroEjemplo {

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
