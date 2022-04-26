---
## Taller de tecnologías de soporte informático - 5to
---

<details> 
  <summary> libros </summary>

 - [el gran libro de HTML, CSS y JavaScript](https://github.com/nadianoe/nadianoe.github.io/blob/master/taller5to2022/libros2022taller5to/El-gran-libro-de-HTML5-CSS3-y-JavaScript.pdf)
 - [the-complete-reference-html-css-fifth-edition.pdf](https://github.com/nadianoe/nadianoe.github.io/blob/master/taller5to2022/libros2022taller5to/the-complete-reference-html-css-fifth-edition.pdf)
  
</details>

----

#### 26 de Abril

<details>
	<summary>  Ejercicio </summary>

 Crear una aplicación con las siguientes especificaciones:

1. El usuario deberá tener tres inputs para ingresar texto. 
   Dichos inputs deberán estar ubicados dentro de la tabla, uno en
   cada columna, deberán ser visualizados luego de hacer click sobre 
   un botón que se llame "Nuevos datos".
2. La página también deberá tener un botón que sirva para ingresar 
   los datos dentro de la tabla. El mismo deberá tener el nombre "Ingresar"
   y ser visible cuando los inputs estén a la vista.
3. Luego de cada inserción, deberán desaparecer los inputs y deberá
   visualizarse sólo el botón "Nuevos datos".
	

</details>

----

#### 19 de Abril

<details> 
  <summary> 19 de Abril </summary>

```html
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

		<title>Experimentos</title>
	</head>
	<body>

    <table id="miTabla">
      <tr>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Edad</th>
      </tr>
      <tr>
        <td>Graciela</td>
        <td>Gutierrez</td>
        <td>45</td>
      </tr>
      <tr>
        <td>Fabrizio</td>
        <td>Holmes</td>
        <td>67</td>
      </tr>
    </table>

    <table class="table">
      <tr>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Edad</th>
      </tr>
      <tr>
        <td>Graciela</td>
        <td>Gutierrez</td>
        <td>45</td>
      </tr>
      <tr>
        <td>Fabrizio</td>
        <td>Holmes</td>
        <td>67</td>
      </tr>
    </table>

    <table class="table table-dark">
    <thead>
      <tr>
        <th>número</th>
        <th>First</th>
        <th>Last</th>
        <th>User</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th>1</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
      </tr>
      <tr>
        <th>2</th>
        <td>Jacob</td>
        <td>Thornton</td>
        <td>@fall</td>
      </tr>
      <tr>
        <th>3</th>
        <td>Larry</td>
        <td>the Bird</td>
        <td>@twitter</td>
      </tr>
    </tbody>
  </table>

		
 <ol>
  <li> Batir huevos</li>
  <li> Agregar leche </li>
  <li> Agregar harina </li>
</ol>

<ul>
  <li> Matemática </li>
  <li> Lengua </li>
  <li> Física </li>
</ul> 
		
  <script>

    /* 
    let tabla = document.getElementById("miTabla");
    let fila = document.createElement("tr");
    let celda = document.createElement("td");
    
    celda.append("holaaa");
    fila.append(celda);
    tabla.append(fila);
	 

    */

  </script>

    </body>
</html>  
  
  
```
  
</details>

----


<details> 
  <summary> Contenido del 12 de Abril </summary>
 
 - Cap. 2, desde la página 24 a la página 31 del libro "El-gran-libro-de-HTML5-CSS3-y-JavaScript.pdf"
 
 </details>
 
----

<details>

  <summary> 15 de Marzo - Ejercicio  </summary>
 

- Crear un sitio web que sirva para poder exponer los trabajos realizados en las materias:
    - Laboratorio de programación Orientada a objetos
    - Taller de Tecnologías de Soporte Informático.

- Se deberá cumplir los siguientes requisitos:
  - su nombre, apellido y curso.
  - Cada trabajo realizado deberá estar asociado a la fecha en la que fué pedido y el tema.
  - Con respecto a los archivos del Laboratorio, cada archivo con extensión .java deberá
    tener asociado un botón que deberá desplegar el código correspondiente al archivo.
      - Para esto último, utilizar el [método toggle() de JQuery](https://api.jquery.com/toggle/)
   
 - Una forma alternativa de importar la librería JQuery es colocando la siguiente etiqueta dentro de
 las etiquetas "HEAD":
 
 ```html
 <head>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
 </head>
 ```
</details>
