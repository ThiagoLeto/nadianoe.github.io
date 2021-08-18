package com.company;

import javax.swing.*;
import java.awt.*;

public class EjemploGUI2 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel();

        panelSuperior.setLayout(new GridLayout(3,3));

        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        JButton boton7 = new JButton("7");
        JButton boton8 = new JButton("8");
        JButton boton9 = new JButton("9");

        panelSuperior.add(boton1);
        panelSuperior.add(boton2);
        panelSuperior.add(boton3);
        panelSuperior.add(boton4);
        panelSuperior.add(boton5);
        panelSuperior.add(boton6);
        panelSuperior.add(boton7);
        panelSuperior.add(boton8);
        panelSuperior.add(boton9);

        ventana.add(panelSuperior,BorderLayout.NORTH);
        /*
        BorderLayout.SOUTH
        BorderLayout.WEST
        BorderLayout.EAST
        BorderLayout.CENTER
         */

        ventana.setVisible(true);


    }
}
