package com.company.POficina;

public abstract class ProductosOficina {
    private int nroStock;
    private String nombre;
    private Double precio;

    public ProductosOficina() {
    }

    public ProductosOficina(int nroStock, String nombre, Double precio) {
        this.nroStock = nroStock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getNroStock() {
        return nroStock;
    }

    public void setNroStock(int nroStock) {
        this.nroStock = nroStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductosOficina{" +
                "nroStock=" + nroStock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
