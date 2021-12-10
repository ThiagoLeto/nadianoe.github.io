/** Ejemplos de peticiones realizadas con llamadas AJAX **/

/** forma alternativa de importar la librería JQuery:

 <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
 
 **/

/** POST **/  

let objetoConInformacion = { nombre : "Nadia" , edad : 78 };

$.ajax({
        url: "http://localhost:8080/alumnos",
        type: 'POST',
        contentType: "application/json",
        data: JSON.stringify(objetoConInformacion)
})
.done(function (data) {

  /* hace algo con el objeto "data" recibido, si es que recibe algo */

})
.fail(function (jqXHR, textStatus, errorThrown) {
    console.log("error, no se pudo ingresar los nuevos datos");
    console.log(jqXHR);
    console.log(textStatus);
    console.log(errorThrown);
});

/** GET **/

$.ajax({
        url: "http://localhost:8080/alumnos",
        type: 'GET'
})
.done(function (data) {

 /* hace algo con el objeto "data" recibido, si es que recibe algo */

})
.fail(function (jqXHR, textStatus, errorThrown) {
    console.log("error, no se pudo obtener datos");
    console.log(jqXHR);
    console.log(textStatus);
    console.log(errorThrown);
});


/** GET **/

$.ajax({
        url: "http://localhost:8080/alumnos/1",
        type: 'GET'
})
.done(function (data) {

 /* hace algo con el objeto "data" recibido, si es que recibe algo */

})
.fail(function (jqXHR, textStatus, errorThrown) {
    console.log("error, no se pudo obtener datos");
    console.log(jqXHR);
    console.log(textStatus);
    console.log(errorThrown);
});

/** PUT **/
// En este ejemplo el elemento al que se le realizará la actualización será identificado con un id

let objetoConInformacionAActualizar = { edad : 79 };

$.ajax({
        url: "http://localhost:8080/alumnos/1",
        type: 'PATCH',
        contentType: "application/json",
        data: JSON.stringify(objetoConInformacion)
})
.done(function (data) {

  /* hace algo con el objeto "data" recibido, si es que recibe algo*/

})
.fail(function (jqXHR, textStatus, errorThrown) {
    console.log("error, no se pudo ingresar los nuevos datos");
    console.log(jqXHR);
    console.log(textStatus);
    console.log(errorThrown);
});


/** DELETE **/
// En este ejemplo, la eliminación se realizará a travez de un id colocado en la url

$.ajax({
        url: "http://localhost:8080/alumnos/1",
        type: 'DELETE'
})
.done(function (data) {

 /* hace algo con el objeto "data" recibido, si es que recibe algo */

})
.fail(function (jqXHR, textStatus, errorThrown) {
    console.log("error, no se pudo obtener datos");
    console.log(jqXHR);
    console.log(textStatus);
    console.log(errorThrown);
});
