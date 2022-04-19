package com.company.Spotify;

public class Album {
    private String titulo;
    private int anio;
    private Artista artista;

    public Album() {
    }

    public Album(String titulo, int anio, Artista artista) {
        this.titulo = titulo;
        this.anio = anio;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", artista=" + artista.toString() +
                '}';
    }
}
