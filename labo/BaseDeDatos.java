package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;

public class BaseDeDatos {

    private Connection conexion;
    private String nombreBaseDeDatos;
    private String nombreTabla;

    public AccesoBaseDeDatos(String nombreBaseDeDatos, String nombreTabla) {
        this.nombreBaseDeDatos = nombreBaseDeDatos;
        this.nombreTabla = nombreTabla;
    }

    public void conectar(String user, String password) {

        String url = "jdbc:mysql://localhost:3306/" + this.nombreBaseDeDatos;
        //String url = "jdbc:mysql://localhost/" + this.nombreBaseDeDatos + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


        try {

            conexion = DriverManager.getConnection(url, user, password);

            if (conexion != null) {
                System.out.println("Se ha conectado exitosamente con la base de datos");
            } else {
                System.out.println("No se ha podido conectar con la base de datos");
            }

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }

    }

    /* INSERT, UPDATE, DELETE */
    public void realizarConsulta(String consulta) {

        try {
            Statement sentencia = conexion.createStatement();
            sentencia.execute(consulta);
            sentencia.close();

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }

    public void imprimirDatos() {

        try {

            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery("SELECT * FROM " + this.nombreTabla);

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                int edad = resultado.getInt("edad");


                System.out.println(id + " " + nombre + " " + apellido + " " + edad);
            }

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }

    public ArrayList<String> obtenerNombresDeColumnas() {

        String consulta = "SHOW COLUMNS FROM " + this.nombreTabla;
        ArrayList<String> nombresDeCampos = new ArrayList<>();

        try {

            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(consulta);

            while (resultado.next()) {
                String nombreDeColumna = resultado.getString("field");
                String tipo =resultado.getString("type");
                nombresDeCampos.add(nombreDeColumna);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return nombresDeCampos;
    }
}
