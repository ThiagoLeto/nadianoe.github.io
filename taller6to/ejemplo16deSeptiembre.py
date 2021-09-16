import requests
from bs4 import BeautifulSoup

if __name__ == '__main__':

    pagina = requests.get("https://exactas.uba.ar/calendario-academico/")
    print("codigo: ",pagina.status_code)
    print("contenido: ",pagina.content)

    objeto_sopa = BeautifulSoup(pagina.content, 'html.parser')
    print(objeto_sopa.prettify())
    print(objeto_sopa.children)
    listaDeObjetos = list(objeto_sopa.children)
    for elem in listaDeObjetos:
        print("tipo: ", type(elem), "\n")
        print(elem, "\n")

    e1 = objeto_sopa.find_all('div', class_='entry-content')
    e2 = objeto_sopa.find_all(class_="outer-text")
    e3 = objeto_sopa.find_all(id="first")
    print(e1)
    print(e1[0].prettify())

    f1 = objeto_sopa.select("div p")
    print(f1)
    f2 = objeto_sopa.select("p.valor-de-clase")
    f3 = objeto_sopa.select("p#valor-de-id")

    g = f1[0]
    print(g)
    print("texto del párrafo: ",g.get_text())

    h = objeto_sopa.find(id="primary")
    print(h)
    tag = h.get_text()
    i = str(tag).split("\n")
    print(i)

    tag = objeto_sopa.find(class_="entry-header clearfix")
    tag = tag.get_text()
    j = str(tag).split("\n")
    print(j)

    tag = objeto_sopa.find("p")
    tag = tag.get_text()
    k = str(tag).split("\n")
    print(k)

    objeto_sopa.find_all('p')
    objeto_sopa.find_all('p')[0].get_text()
    objeto_sopa.find('p')
    objeto_sopa.find_all(class_="outer-text")
    objeto_sopa.find_all('p', class_='outer-text')
    objeto_sopa.find_all(id="first")

    # documentación
    # https://www.crummy.com/software/BeautifulSoup/bs4/doc/
    # https://www.crummy.com/software/BeautifulSoup/bs4/doc/#kinds-of-objects
