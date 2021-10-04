package com.company;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLecturaYEscrituraDeArchivos {

    public static void main(String[] args) {

        /* escribir archivos */

        File archivo = new File("ejemplo.txt");

        FileWriter archivoAEscribir = null;

        try {

            archivoAEscribir = new FileWriter(archivo);
            BufferedWriter escribir = new BufferedWriter(archivoAEscribir);


            for (int i = 0; i < 10; i++) {
                escribir.write("Holaaa! \n");
            }

            escribir.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        /* leer archivos */

        File archivo = new File("ejemplo.txt");

        FileReader archivoAleer = null;

        try {
            archivoAleer = new FileReader(archivo);
            BufferedReader leer = new BufferedReader(archivoAleer);
            String linea = leer.readLine();

            while(linea != null) {
                System.out.println(linea);
                linea = leer.readLine();
            }

            leer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
