package com.company.VideoStore;

import java.time.LocalDate;

public class Alquiler {
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
