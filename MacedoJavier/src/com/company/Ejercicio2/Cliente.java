package com.company.Ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente extends PersonasLocal{
    private String id;
    private LocalDate fechaRegistro;
    private List<VideoJuego> juegosComprados=new ArrayList<>();

    public Cliente() {
        this.id= java.util.UUID.randomUUID().toString().toUpperCase().substring(0,6);;
        this.fechaRegistro=LocalDate.now();
    }

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
        this.id= java.util.UUID.randomUUID().toString().toUpperCase().substring(0,6);;
        this.fechaRegistro=LocalDate.now();
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public String getId() {
        return id;
    }

    public List<VideoJuego> getJuegosComprados() {
        return juegosComprados;
    }

    //2D=================================================
    public void agrearJuegoComprado(VideoJuego juego){
        this.juegosComprados.add(juego);
    }
    //====================================================


    @Override
    public String toString() {
        return "Cliente{" +super.toString()+
                "id=" + id +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
