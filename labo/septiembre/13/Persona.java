package com.company;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "Laura";
        this.apellido = "Ramirez";
        this.edad = 32;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.apellido = "Ramirez";
        this.edad = 32;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esMayorDeEdad(){
        boolean esMayor = edad >= 18;
        return esMayor;
    }

}
