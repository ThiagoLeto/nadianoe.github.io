package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EjemploGUI4 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar barraDeMenu = new JMenuBar();
        ventana.setJMenuBar(barraDeMenu);

        JMenu opcionesParaArchivos = new JMenu("Archivo");
        barraDeMenu.add(opcionesParaArchivos);

        JMenuItem archivoNuevo = new JMenuItem("Nuevo");
        opcionesParaArchivos.add(archivoNuevo);

        JMenuItem abrirArchivo = new JMenuItem("Abrir");
        opcionesParaArchivos.add(abrirArchivo);

        JMenuItem salir = new JMenuItem("Salir");
        opcionesParaArchivos.add(salir);

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setVisible(false);
                ventana.dispose();
            }
        });

        ventana.setVisible(true);
    }
}
