package com.company;

import java.util.HashSet;

public class Madre extends Persona {

    private String empleo;
    private HashSet<Hijo> hijos;

    public Madre(String nombre, String empleo, HashSet<Hijo> hijos) {
        super(nombre);
        this.empleo = empleo;
        this.hijos = hijos;
    }

    public Madre(String nombre, String empleo) {
        super(nombre);
        this.empleo = empleo;
        this.hijos = new HashSet<>();
    }

    public HashSet<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(HashSet<Hijo> hijos) {
        this.hijos = hijos;
    }

    public void agregarHijo(Hijo hijo){
        this.hijos.add(hijo);
    }

    public HashSet<Hijo> hijosMenoresDeEdad() {
        HashSet<Hijo> menores=new HashSet<Hijo>();
        for ( Hijo hijo : hijos) {
            if(hijo.getEdad()<18){
                menores.add(hijo);
            }

        }
        return menores;
    }
}

