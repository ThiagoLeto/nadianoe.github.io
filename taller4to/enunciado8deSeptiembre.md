El día de hoy deberán crear una pequeña calculadora que realice
las siguientes operaciones: suma, resta, multiplicación y división.

La misma deberá recibir dos números y luego deberá mostrar el resultado
obtenido.

Los símbolos a utlizar son +, -, * y /, respectivamente. Se deberá
crear un botón y función por operación. 

En el caso de la suma, deberán utilizar la función parseInt() para
que el lenguaje no confunda la suma con la concatenación de strings.

Ejemplo:
```
let valorUno = document.getElementById("primerOperando").value;
let valorDos = document.getElementById("segundoOperando").value;
let resultado = parseInt(valorUno) + parseInt(valorDos);
```

Recordar que los inputs deberán tener como atributo type="number".

Realizar éste trabajo en otro documento html.
