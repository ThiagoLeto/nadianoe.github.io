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

        File archivo = new File("src/com/company/ejemplo.txt");

        FileWriter archivoAEscribir = null;

        try {

            archivoAEscribir = new FileWriter(archivo);
            BufferedWriter escritura = new BufferedWriter(archivoAEscribir);


            for (int i = 0; i < 10; i++) {
                escritura.write("Holaaa! \n");
            }

            escritura.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        /* leer archivos */

        File archivo = new File("src/com/company/ejemplo.txt");

        FileReader archivoAleer = null;

        try {
            archivoAleer = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(archivoAleer);
            String linea = lectura.readLine();

            while(linea != null) {
                System.out.println(linea);
                linea = lectura.readLine();
            }

            lectura.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
