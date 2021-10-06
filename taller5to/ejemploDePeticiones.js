/** Ejemplos de peticiones realizadas con llamadas AJAX **/

/** PUT **/  

let objetoConInformacion = { nombre : "Nadia" , edad : 78 };

$.ajax({
        url: "https://direcciónALaQueSeLeRealizaraLaPeticion/api/personas/",
        type: 'PUT',
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
        url: "https://direcciónALaQueSeLeRealizaraLaPeticion/api/personas",
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

/** UPDATE **/
// En este ejemplo el elemento al que se le realizará la actualización será identificado con un id

let objetoConInformacionAActualizar = { edad : 79 };

$.ajax({
        url: "https://direcciónALaQueSeLeRealizaraLaPeticion/api/personas/id",
        type: 'UPDATE',
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
        url: "https://direcciónALaQueSeLeRealizaraLaPeticion/api/personas/id",
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
