

if __name__ == '__main__':

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




