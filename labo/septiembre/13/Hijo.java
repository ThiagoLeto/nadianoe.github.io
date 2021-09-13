package com.company;

public class Hijo extends Persona {

    private String escuela;
    private String juegoFavorito;

    public Hijo(String nombre, int edad) {
        super(nombre,edad);
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getJuegoFavorito() {
        return juegoFavorito;
    }

    public void setJuegoFavorito(String juegoFavorito) {
        this.juegoFavorito = juegoFavorito;
    }
}

