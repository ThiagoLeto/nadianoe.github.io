

####  31 de Marzo

<details> 
	<summary> Enunciado </summary>
	
- Elegir una API y realizar las peticiones necesarias para crear un set de datos
- Utilizar el separador ","
- El set de datos obtenido deberá tener
  - extensión .csv
  - al menos 30 lineas 
  - al menos 3 columnas.


</details>

<details> 
	<summary> Ejemplo </summary>

```python
import requests


if __name__ == '__main__':

    archivo = open("hola.csv", "w")
    nombres_columnas = "mensaje , status \n"
    archivo.write(nombres_columnas)
    archivo.close()
    
    for i in range(10):
        respuesta = requests.get('https://dog.ceo/api/breeds/image/random')
        respuesta.status_code
        informacion = respuesta.json()
        mensaje = informacion["message"]
        estado = informacion["status"]

        linea = mensaje + "," + estado + "\n"

        archivo = open("hola.csv", "a")
        archivo.write(linea)
        archivo.close()
```
</details>

-----

<details>
<summary> 10 de Marzo | ejemplo  </summary>

```python
print("hola")
print("Hola", "Holaaaa")
cadenas = "Holaaa" + "Hola" + 'Holaaaaaaa'
print(cadenas)

num1 = 34
num2 = 2
suma = num1 + num2
print(suma)

num1 = 23.0
num2 = 0.5
print(num1 + num2)

lista = [1, 2, 3, 5, 6, 4, 4, 4, 4]
lista.sort()

lista = ["afdf", 22, "hola", 2, 6.78]
print(lista)

if (len(lista) == 2):
	print("tiene dos elementos")
else:
	print("tiene más de dos elementos")

a = 1
b = 3
if b > a:
	print("b es mayor")
elif a == b:
	print("a y b son iguales")

for i in range(5):
	print(i)

for elemento in lista:
	print(elemento)

while b > a:
	print("abcd")
	a = a + 1

diccionario1 = {"Ana": 12, "Fabio": 3}
diccionario1["Lolo"] = 33
diccionario1['Lola'] = 90
valores = diccionario1.values()
valores = list(valores)

for clave in diccionario1.keys():
	valor = diccionario1[clave]
	print(clave,valor)


print(diccionario1)
print(valores[0])

set = {"Jazmín", "Karina"}
set.add("Paola")

print(set)

for elemento in set:
	print(elemento)


numero_ingresado = input()
numero = int(numero_ingresado)

nombre_ingresado = input("Ingrese un nombre")
print(nombre_ingresado)



'''
documentación sobre listas:
https://python-reference.readthedocs.io/en/latest/docs/list/
documentación sobre conjuntos:
https://python-reference.readthedocs.io/en/latest/docs/sets/
documentación sobre diccionarios:
https://python-reference.readthedocs.io/en/latest/docs/dict/
'''
```

</details>

<details>
<summary> 10 de Marzo | ejercicio </summary>

1. Crear una lista que contenga 1000 números enteros. Los mismo deberán ser agregados
mediante un ciclo for y utilizando la función range.
2. Tomar la lista creada en el punto anterior y eliminar los elementos con índices pares.
3. Crear un set que contenga 3 nombres ingresados por consola.
4. Tomar el set creado y eliminar los nombres que comiencen con la letra a.
5. Crear un diccionario que contenga 2 o más nombres de sus compañeros con sus respectivas
edades.
6. Tomar el diccionario creado y multiplicar las edades por 2, mediante un ciclo for.
7. Crear el famoso juego de la vivorita utilizando las estructuras de datos vistas.
El mismo deberá utilizarse y visualizarse por consola.
</details>
