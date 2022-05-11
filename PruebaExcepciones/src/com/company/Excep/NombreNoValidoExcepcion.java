package com.company.Excep;
public class NombreNoValidoExcepcion extends Exception {
    public NombreNoValidoExcepcion() {
        super();
    }

    public NombreNoValidoExcepcion(String mensaje) {
        super(mensaje);
    }
}