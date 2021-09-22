package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {

    public static void main(String[] args) {

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

    }

}
