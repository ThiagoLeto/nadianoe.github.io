```javascript
    $.ajax({
        url: "https://www.fruityvice.com/api/fruit/orange",
        type: 'GET'
    })
    .done(function (data) {

        console.log(data);

    })
    .fail(function (qXHR, textStatus, errorThrown) {
        console.log("error, no se pudo obtener datos");
    });
```


## Algunas apis, parte 1:

- https://www.buenosaires.gob.ar/desarrollourbano/transporte/apitransporte
- https://datosabiertos-apis.buenosaires.gob.ar/
- https://dog.ceo/dog-api/
- https://www.fruityvice.com/
