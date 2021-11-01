package com.example.demo;

import com.mongodb.MongoClient;
import com.mongodb.client.*;
import org.bson.Document;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
class AccesoMongoDB {

    private MongoDatabase baseDeDatos;
    private MongoCollection coleccion;
    private String host;
    private int puerto;

    public AccesoMongoDB() {
        this.host = "localhost";
        this.puerto = 27017;
        this.conectarABaseDeDatos("personas");
        this.conectarAColeccion("alumnos");
    }

    public MongoDatabase getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(MongoDatabase baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public MongoCollection getColeccion() {
        return coleccion;
    }

    public void setColeccion(MongoCollection coleccion) {
        this.coleccion = coleccion;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public void conectarABaseDeDatos(String nombreBaseDeDatos){
        MongoClient mongo = new MongoClient( host,puerto );
        this.baseDeDatos = mongo.getDatabase(nombreBaseDeDatos);
    }

    public void conectarAColeccion(String nombreDeColeccion){
        if (existeLaColeccion(nombreDeColeccion)){
            this.coleccion = baseDeDatos.getCollection(nombreDeColeccion);
        } else {
            baseDeDatos.createCollection(nombreDeColeccion);
            this.coleccion = baseDeDatos.getCollection(nombreDeColeccion);
        }
    }

    public boolean existeLaColeccion(String nombreDeColeccion){

        MongoIterable<String> nombresDeColecciones = baseDeDatos.listCollectionNames();
        boolean existe = false;

        for (String nombre : nombresDeColecciones) {
            if (nombre.equals(nombreDeColeccion)){
                existe = true;
            }
        }
        return existe;
    }

    public void insertarAlumno(Alumno alumno){
        Document nuevoDocumento = new Document();
        nuevoDocumento.append("nombre",alumno.getNombre());
        nuevoDocumento.append("edad",alumno.getEdad());
        coleccion.insertOne(nuevoDocumento);
    }

    public void insertarAlumnos(List<Alumno> alumnos){

        List<Document> documentosAIntertar = new ArrayList<>();

        for (Alumno alumno : alumnos) {

            Document nuevoDocumento = new Document();
            nuevoDocumento.append("nombre",alumno.getNombre());
            nuevoDocumento.append("edad",alumno.getEdad());
            documentosAIntertar.add(nuevoDocumento);

        }

        coleccion.insertMany(documentosAIntertar);
    }

    public Alumno obtenerAlumnoCon(HashMap<String,Object> filtros) {
        /*
        db.alumnos.find( { nombre : "Gloria" } ).pretty();
        db.alumnos.find( { nombre : { $eq : "Nadia" } } );
        db.alumnos.find( { $and : [ { nombre : "Pedro" },{ edad : 38 } ] });
        */
        Alumno alumno = new Alumno();
        /** aquí se deben tomar los valores del map para armar el json **/
        //String json = "{ nombre : { $eq : \"Nadia\" } }";
        String json = "{ $and : [ { nombre : \"Pedro\" } , { edad : 38 } ] }";
        Document filtro = Document.parse(json);
        FindIterable resultado = coleccion.find(filtro);
        MongoCursor iterador = resultado.iterator();

        while (iterador.hasNext()){
            Document documento = (Document) iterador.next();
            String nombre = documento.getString("nombre");
            int edad = documento.getInteger("edad");
            alumno = new Alumno(nombre,edad);
            System.out.println(nombre + " - " + edad);
        }

        return alumno;
    }

    public void actualizarDatosDeAlumno(/** parámetros? **/){
        /** db.alumnos.update(
         * { edad: { $eq: 23 } },
         * { $set: { edad :  24 } },
         * ); **/
        String jsonRequerimientos = "{ edad: { $eq: 25 } }";
        Document req = Document.parse(jsonRequerimientos);
        String json = "{ $set: { edad :  23 } }";
        Document valores = Document.parse(json);
        coleccion.updateOne(req,valores);
    }

    public void actualizarDatosDeVariosAlumnos(/** parámetros? **/){
        /** db.alumnos.update(
         * { edad: { $eq: 23 } },
         * { $set: { edad :  24 } },
         * { multi: true }   ); **/
        String json = "{ edad: { $eq : 23 } }";
        Document filtro = Document.parse(json);
        json = "{ $set: { edad :  25 } }";
        Document nuevosValores= Document.parse(json);
        coleccion.updateMany(filtro,nuevosValores);
    }

    public void eliminarAlumno(int id){
        /**  db.alumnos.remove( { nombre: { $eq: "Nadia" } } ); **/
        String json = "{ nombre: { $eq: \"Nadia\" } }";
        Document filtro = Document.parse(json);
        coleccion.deleteOne(filtro);
    }

    public void eliminarVariosAlumnos(/** parámetros? **/){
        String json = "{ edad : { $eq: 25 } }";
        Document filtro = Document.parse(json);
        coleccion.deleteOne(filtro);
    }


    /**
     * documentación de clase Document
     * http://mongodb.github.io/mongo-java-driver/3.6/javadoc/org/bson/Document.html
     */

}
