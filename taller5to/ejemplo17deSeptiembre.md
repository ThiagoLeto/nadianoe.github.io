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



