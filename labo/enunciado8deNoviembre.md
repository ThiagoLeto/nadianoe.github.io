Realizar un sistema que controle el consumo de bebidas.

Cada consumidor debe tener un nombre, apellido y DNI.

Las bebidas tienen un nombre y un coeficiente de positividad y uno de negatividad. 

Existen 3 clases de bebidas:

- Bebidas neutras: en estas bebidas los coeficientes se establecen manualmente.
- Bebidas azucaradas: en estas bebidas se establece un atributo llamado “cantidad de azúcar”, el coeficiente de positividad es siempre 1 y el de negatividad se calcula multiplicando la cantidad de azúcar por 10.
- Bebidas alcohólicas: en estas bebidas se establece un atributo llamado “cantidad de alcohol”, el coeficiente de positividad es siempre cero y el de negatividad se calcula multiplicando la cantidad de alcohol por 20. 

Cada persona debe tener un registro de las bebidas que consumió, indicando:
Bebida
Cantidad


Se debe poder calcular un coeficiente de hidratación resultante de cada persona. 
El mismo se calcula multiplicando la cantidad de bebidas de un determinado tipo
por la resta de coef. de positividad menos el coef. de negatividad.

Por ejemplo:

- Agua, con coef. de negatividad igual a 0 y coef. de positividad igual a 20
- Coca, con una cantidad de azúcar igual a 5

Si Juan tomó 3 aguas y 2 cocas:

- Coeficiente resultante para 3 aguas = 3 x (20 - 0) = 60
- Coeficiente resultante para 2 cocas = 2 x [1 - (5 x 10)] = -98
- Coeficiente resultante total = 60 + (-98) = -38

La clase SistemaDeControl deberá implementar la siguiente interfaz:
``` java

public interface Sistema {

  public Persona personaConMejorCoeficienteDeHidratacion();
  public Persona personaConPeorCoeficienteDeHidratacion();
  public HashSet<String> nombresDeBebidasConsumidas();
  public String nombreDeBebidaMasConsumida();
  
}

```
