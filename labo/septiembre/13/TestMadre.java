package com.company;

import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMadre {

    @Test
    public void casoAgregarHijo(){
        Madre madre = new Madre("Laura","ingeniera");
        Hijo hijo1 = new Hijo("Carlos",2);
        madre.agregarHijo(hijo1);
        assertEquals(madre.getHijos().size(),1);
        assertTrue(madre.getHijos().contains(hijo1));
    }

    @Test
    public void casoMadreConHijosMenores(){
        Madre madre = new Madre("Laura","ingeniera");
        Hijo hijo1 = new Hijo("Carlos",2);
        madre.agregarHijo(hijo1);

        Hijo hijo2 = new Hijo("Gloria",1);
        madre.agregarHijo(hijo2);

        HashSet<Hijo> hijosObtenidos = madre.hijosMenoresDeEdad();
        int cantidadDeHijosObtenidos = hijosObtenidos.size();

        assertTrue(hijosObtenidos.contains(hijo1));
        assertTrue(hijosObtenidos.contains(hijo2));
        assertEquals(cantidadDeHijosObtenidos,2);
    }

    @Test
    public void casoMadreSinHijosMenores(){

        Madre madre = new Madre("Laura","ingeniera");
        Hijo hijo1 = new Hijo("Carlos",22);
        madre.agregarHijo(hijo1);

        Hijo hijo2 = new Hijo("Gloria",19);
        madre.agregarHijo(hijo2);

        HashSet<Hijo> hijosObtenidos = madre.hijosMenoresDeEdad();
        int cantidadDeHijosObtenidos = hijosObtenidos.size();

        assertFalse(hijosObtenidos.contains(hijo1));
        assertFalse(hijosObtenidos.contains(hijo2));
        assertEquals(cantidadDeHijosObtenidos,0);
    }

    @Test
    public void casoMadreConHijosMayores(){

        Madre madre = new Madre("Laura","ingeniera");
        Hijo hijo1 = new Hijo("Carlos",23);
        madre.agregarHijo(hijo1);

        Hijo hijo2 = new Hijo("Gloria",16);
        madre.agregarHijo(hijo2);

        HashSet<Hijo> hijosObtenidos = madre.hijosMenoresDeEdad();
        int cantidadDeHijosObtenidos = hijosObtenidos.size();

        assertFalse(hijosObtenidos.contains(hijo1));
        assertTrue(hijosObtenidos.contains(hijo2));
        assertEquals(cantidadDeHijosObtenidos,1);
    }
}
