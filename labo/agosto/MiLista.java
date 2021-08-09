package com.company;
import java.util.ArrayList;

public class MiLista<E> extends ArrayList<E>{

    public void add(E... elementos){
        for (E elemento : elementos){
            this.add(elemento);
        }
    }

    public E ultimoElemento(){
        int size = this.size();
        E elementoRequerido = this.get(size - 1);
        return elementoRequerido;
    }

    @Override
    public String toString(){
        String elementosConcatenados = "";
        for (E elemento : this ) {
            if (this.ultimoElemento() != elemento){
                elementosConcatenados += elemento + " - ";
            } else {
                elementosConcatenados += elemento;
            }
        }
        return elementosConcatenados;
    }

    public static void main(String[] args) {

        MiLista<Integer> lista = new MiLista<>();
        lista.add(2,4,5,6,7);
        System.out.println(lista.get(0));

        /* Sin redefinir el método .toString() */
        System.out.println(lista.toString()); // [2, 4, 5, 6, 7]

        /* Redefiniendo el método .toString() */
        System.out.println(lista.toString()); // 2 - 4 - 5 - 6 - 7

    }
}

