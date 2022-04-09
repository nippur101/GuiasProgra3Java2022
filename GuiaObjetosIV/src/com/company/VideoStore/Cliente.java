package com.company.VideoStore;
//Por otro lado, nuestro cliente nos cuenta que le interesa saber acerca de quienes alquilan
//sus películas, su nombre, teléfono y dirección.
public class Cliente {
    private String nombre;
    private String telefono;
    private String direccion;
    private int nroAlquileres=0;

    public Cliente() {
    }

    public Cliente(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nroAlquileres = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNroAlquileres() {
        return nroAlquileres;
    }

    public void setNroAlquileres(int nroAlquileres) {
        this.nroAlquileres = nroAlquileres;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nroAlquileres=" + nroAlquileres +
                '}';
    }
}
