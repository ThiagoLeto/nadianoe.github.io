package com.company;

import javax.swing.*;
import java.awt.*;

public class EjemploGUI3 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setLayout(new BorderLayout());
        ventana.setSize(500, 500);

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(3,3));
        panelSuperior.setBackground(Color.cyan);
        JButton boton1 = new JButton("1");
        boton1.setLocation(1,1);
        JButton boton2 = new JButton("2");
        boton2.setLocation(1,2);
        JButton boton3 = new JButton("3");
        //boton2.setLocation(...,...);
        JButton boton4 = new JButton("4");
        //boton2.setLocation(...,...);
        JButton boton5 = new JButton("5");
        //boton2.setLocation(...,...);
        JButton boton6 = new JButton("6");
        //boton2.setLocation(...,...);
        JButton boton7 = new JButton("7");
        //boton2.setLocation(...,...);
        JButton boton8 = new JButton("8");
        //boton2.setLocation(...,...);
        JButton boton9 = new JButton("9");
        //boton2.setLocation(...,...);

        panelSuperior.add(boton1);
        panelSuperior.add(boton2);
        panelSuperior.add(boton3);
        panelSuperior.add(boton4);
        panelSuperior.add(boton5);
        panelSuperior.add(boton6);
        panelSuperior.add(boton7);
        panelSuperior.add(boton8);
        panelSuperior.add(boton9);

        for (int i = 0; i < panelSuperior.getComponents().length; i++) {
            JButton boton = (JButton)panelSuperior.getComponent(i);
            String texto = boton.getText();
            Point punto = panelSuperior.getComponent(i).getLocation();
        }

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
