package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

    public static void main(String[] args) {

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
