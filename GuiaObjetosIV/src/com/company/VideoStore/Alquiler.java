package com.company.VideoStore;

import java.time.LocalDate;

public class Alquiler {
    private int id;
    private static int idSt=0;
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDate fechaRetiro;
    private LocalDate fechaDevolucion;
    private boolean estadoAalquiler;//alquilado T /devuelto F

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, Pelicula pelicula) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaRetiro = LocalDate.now();
        this.fechaDevolucion=LocalDate.now().plusDays(3);
        this.estadoAalquiler = true;
        cliente.setNroAlquileres(cliente.getNroAlquileres()+1);
        pelicula.setNroVecesAlquilada(pelicula.getNroVecesAlquilada()+1);
        pelicula.setNroCopiasDisponibles(pelicula.getNroCopiasDisponibles()-1);
        this.id=++idSt;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public boolean isEstadoAalquiler() {
        return estadoAalquiler;
    }

    public void setEstadoAalquiler(boolean estadoAalquiler) {
        this.estadoAalquiler = estadoAalquiler;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDate fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "cliente=" + cliente +
                ", pelicula=" + pelicula +
                ", fechaRetiro=" + fechaRetiro +
                ", fechaDevolucion=" + fechaDevolucion +
                ", estadoAalquiler=" + estadoAalquiler +
                '}';
    }
}
