package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsPersona {

    @Test
    public void casoConPersonaMayor(){

        Persona p = new Persona("Laura",65);

        boolean valorObtenido = p.esMayorDeEdad();
        boolean valorEsperado = true;

        assertTrue(valorObtenido);
        assertEquals(valorObtenido,valorEsperado);

    }

    @Test
    public void casoConPersonaMenor(){

        Persona p = new Persona("Gloria",5);
        boolean valorObtenido = p.esMayorDeEdad();
        boolean valorEsperado = false;

        assertFalse(valorObtenido);
        assertEquals(valorObtenido,valorEsperado);
    }

    @Test
    public void casoConPersonaDe18anios(){

        Persona p = new Persona("Esteban",18);
        boolean valorObtenido = p.esMayorDeEdad();
        boolean valorEsperado = true;

        assertTrue(valorObtenido);
        assertEquals(valorObtenido,valorEsperado);
    }

}
