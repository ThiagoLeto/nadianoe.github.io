package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Iteradores {

    public static void main(String[] args) {

        ArrayList<String> personas = new ArrayList<>();
        personas.add("Juan");
        personas.add("María");
        personas.add("Rosa");

        Iterator iterador = personas.iterator();

        while(iterador.hasNext()){
            String nombre = (String) iterador.next();
            System.out.println(nombre);
        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(22);
        nums.add(34);

        iterador = nums.iterator();

        while(iterador.hasNext()){
            int num = (int) iterador.next();
            System.out.println(num);
        }

        

        HashSet<Float> otrosNumeros = new HashSet<>();
        otrosNumeros.add(0.34f);
        otrosNumeros.add(0.123f);
        otrosNumeros.add(2.34f);

        iterador = otrosNumeros.iterator();

        while(iterador.hasNext()){
            float num = (float) iterador.next();
            System.out.println(num);
        }

    }
}
