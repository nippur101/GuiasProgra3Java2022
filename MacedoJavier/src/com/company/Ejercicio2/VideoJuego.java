package com.company.Ejercicio2;

import java.util.Objects;

public class VideoJuego implements Comparable<VideoJuego>{
    private String nombre;
    private double precio;
    private String categoria;
    private int nroVecesComprado;
    private static int nroVeces=0;

    public VideoJuego() {

    }

    public VideoJuego(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNroVecesComprado() {
        return nroVecesComprado;
    }

    public void setNroVecesComprado(int nroVecesComprado) {
        this.nroVecesComprado = nroVecesComprado;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                ", nroVecesComprado=" + nroVecesComprado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoJuego that = (VideoJuego) o;
        return Double.compare(that.precio, precio) == 0 && Objects.equals(nombre, that.nombre) && Objects.equals(categoria, that.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, categoria);
    }

    @Override
    public int compareTo(VideoJuego o) {
        if(o.getNroVecesComprado()>this.getNroVecesComprado()){
            return 1;
        }else if (o.getNroVecesComprado()==this.nroVecesComprado){
            return 0;
        }else {
            return -1;
        }
    }
}
