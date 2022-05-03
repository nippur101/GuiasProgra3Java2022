package com.company.POficina;

public abstract class Muebles extends ProductosOficina{
    public Muebles() {
    }

    public Muebles(int nroStock, String nombre, Double precio) {
        super(nroStock, nombre, precio);
    }

}
