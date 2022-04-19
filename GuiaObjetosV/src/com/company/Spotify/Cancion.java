package com.company.Spotify;

import java.util.List;

//Canción la cual posee un nombre, la duración de la canción, genero (el cual solo podrá ser ROCK, TRAP, JAZZ,
//HIP HOP, POP, METAL y CLASICA)
public class Cancion {
    private String nombreCancion;
    private int duracion;
    private String genero;
    private Album album;
    private List<Artista> artistas;

    public Cancion() {
    }

    public Cancion(String nombreCancion, int duracion, String genero, Album album, List<Artista> artistas) {
        this.nombreCancion = nombreCancion;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
        this.artistas = artistas;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", album='" + album + '\'' +
                ", artistas=" + artistas +
                '}';
    }
}
