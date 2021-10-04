package com.company;

public class EdadInvalidaException extends RuntimeException {

    @Override
    public String getMessage() {
        String mensaje = "las edades sólo pueden ser mayores o iguales a cero \n" +
                         "Vuelva a ingresar sus datos.";
        return mensaje;
    }
}
