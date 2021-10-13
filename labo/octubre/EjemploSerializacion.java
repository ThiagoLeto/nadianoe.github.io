package com.company;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class EjemploSerializacion {

    public static void main(String[] args) {

        Persona p1 = new Persona("Gloria",34);
        Persona p2 = new Persona("Roberto",67);
        Persona p3 = new Persona("Domingo",2);

        try {

            /** SERIALIZACIÓN: objeto Java -> objeto json **/

            ObjectMapper mapper1 = new ObjectMapper();

            HashMap<String,Object> mapASerializar = new HashMap<>();
            ArrayList<Persona> personas = new ArrayList<>();
            personas.add(p1);
            personas.add(p2);
            personas.add(p3);

            mapASerializar.put("personas",personas);

            String objetoJson1 = mapper1.writeValueAsString(mapASerializar);
            System.out.println(objetoJson1);

            File archivo = new File("src/com/company/personas.json");

            /** escribir el resultado en un archivo llamado personas.json **/
            mapper1.writeValue(archivo,mapASerializar);


            /** DESERIALIZACIÓN  objeto json -> objeto Java **/

            ObjectMapper mapper2 = new ObjectMapper();

            /** desde un json como string a un map **/
            String json1 = "{ \"nombre\":\"Nadia\"," +
                             "\"arregloDeStrings\" : [\"uno\",\"dos\"]" +
                           "}";

            HashMap map1 = mapper2.readValue(json1,HashMap.class);
            System.out.println(map1);

            String json2 = "{\"name\":\"john\",\"age\":22 }";
            HashMap map2 = mapper2.readValue(json2,HashMap.class);
            System.out.println(map2);


            /** desde un objeto json presente en un archivo a un map **/
            HashMap map3 = mapper2.readValue(archivo,HashMap.class);
            System.out.println(map3);


        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
