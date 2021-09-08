
### Prueba

Comentario: en todo el desarrollo del exámen, se deberá aplicar el concepto de 
"alta cohesión" y el concepto de "bajo acoplamiento".

Sea la clase Persona:

```java
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String nombre, String apellido, int edad) {
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}

```
1. Crear un constuctor por defecto para la clase Persona.
2. Terminar de implementar el constructor que tiene tres parámetros.
3. Redefinir el método "toString" para que los valores de los atributos 
   de la clase Persona se presenten de la siguiente manera:
```
 Nombre: Anacleta
 Apellido: Neptuno
 Edad: 56
```
4. Crear el método estático llamado "imprimir" que muestre por consola
   los atributos y sus respectivos valores.
   
5. Programar una parte de un sistema para una empresa que vende canciones de cantantes musicales. 

La parte del sistema a implementar brindará las siguientes opciones:

- a. Mostrar cantantes con el precio que tienen sus canciones
- b. Mostrar los nombres artísticos de los cantantes con más de 3 álbumes
- c. Mostrar datos y discografía de todos los cantantes.

Cada artista musical tendrá un nombre artístico y una serie de álbumes realizados.
Además, cada álbum tendrá una serie de canciones.

- Para representar al cantante, reutilizar la clase Persona.

Precios de canciones: 

La empresa tendrá un precio mínimo para todas las canciones que ofrece: $500.
- Crear una variable estática que represente el precio mínimo.

Todas las canciones de un cantante tendrán el mismo precio y su correspondiente
valor se calculará de la siguiente forma: precio mínimo + cantidad de álbumes del cantante.

Para el ítem "c", se deberá redefinir el método "imprimir"  de la clase Persona,
los datos deberán ser mostrados según el siguiente formato:
  
```
Nombre: Anacleta
Apellido: Neptuno
Edad: 56
Nombre artístico: anna

- Álbum "ejemplo1"
  canción 1
  canción 2
  canción 3
 
- Álbum "ejemplo2"
  canción 1
  canción 2
  canción 3
      
```

