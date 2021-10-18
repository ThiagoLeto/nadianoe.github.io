### Ejemplo 

- Método con un valor variable dentro de la url

``` java

	@RequestMapping(value = "/alumnos/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> obtenerInformacionDeAlumno(@PathVariable int id){

        HashMap<String, Object> infoDeRespuesta = new HashMap<>();

        /** 
        	se conecta con la base de datos, se obtiene la información
            del alumno correpondiente al id recibido y lo coloca dentro
            de un map para luego enviarlo como respuesta
        **/

        return new ResponseEntity<>(infoDeRespuesta,HttpStatus.OK);
        
    }

```
- Método con un valor variable dentro de la url más un objeto json

``` java

	@RequestMapping(value = "/alumnos/{id}", method = RequestMethod.UPDATE)
    public ResponseEntity<Object> realizarCambio(@PathVariable int id,@RequestBody HashMap info) {
        /** se actualiza la información correspondiente  **/
        return new ResponseEntity<>(HttpStatus.OK);
    }
```
