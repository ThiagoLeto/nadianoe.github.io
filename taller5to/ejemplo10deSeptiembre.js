
let edades = new Map();

edades = new Map([ ['Carolina', 65],['Carlos', 66] ] );

edades.set('Herminia', 60);

let unaEdad = edades.get('Carolina');

let existe = edades.has('Carlos');

let size = edades.size;

edades.delete("Herminia");

edades.clear();

for (let clave of edades.keys()) {
    console.log("clave: " + clave);
    console.log("valor: " +  edades.get(clave));
}

for (let valor of edades.values()) {
    console.log(valor);
}


let persona = { nombre : "Graciela", apellido: "Kikes", edad: 56}

let objetoComoString = JSON.stringify(persona);

let objetoJson = JSON.parse(objetoComoString);

let programadora = { nombre : "Graciela",
                     apellido: "Kikes",
                     edad: 56,
                     lenguajesDeProgramacion: ["c++","java","kotlin"],
                     viveEnBuenosAires: true,
                    };

let nombre = programadora.nombre;
let edad = programadora.edad;
let lenguajes = programadora.lenguajesDeProgramacion;

for (let lenguaje of lenguajes ){
    console.log(lenguaje);
}

// map ---> json
let json = Object.fromEntries(edades);

// lista de elementos
let listaConParesClaveValor = Object.entries(json);

// json ---> map
let nuevoMapDeEdades = new Map(listaConParesClaveValor);
