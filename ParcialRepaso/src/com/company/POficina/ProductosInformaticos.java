package com.company.POficina;

public abstract class ProductosInformaticos extends ProductosOficina{
    private String nombreFabricante;

    public ProductosInformaticos() {
    }

    public ProductosInformaticos(int nroStock, String nombre, Double precio, String nombreFabricante) {
        super(nroStock, nombre, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }


}
