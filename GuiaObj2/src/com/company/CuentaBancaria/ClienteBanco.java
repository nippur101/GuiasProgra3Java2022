package com.company.CuentaBancaria;
//Para esto identificamos los atributos id, nombre y género (M o F) para el Cliente.
public class ClienteBanco {
    private String id;
    private String nombre;
    private char genero;

    public ClienteBanco() {
    }

    public ClienteBanco( String nombre, char genero) {
        this.id = java.util.UUID.randomUUID().toString().toUpperCase().substring(0,6);
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }
}
