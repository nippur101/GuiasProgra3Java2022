package com.company.Spotify;

import java.util.*;

public class App {
    private List<Album> albunes;
    private List<Artista> artistas;
    private List<Cancion> canciones;
    private List<ListaBasica> listasBasicas;
    private List<ListaPremium> listasPremium;


    public App() {
    }

    public App(List<Album> albunes, List<Artista> artistas, List<Cancion> canciones, List<ListaBasica> listasBasicas, List<ListaPremium> listasPremium) {
        this.albunes = albunes;
        this.artistas = artistas;
        this.canciones = canciones;
        this.listasBasicas = listasBasicas;
        this.listasPremium = listasPremium;
    }

    public List<Album> getAlbunes() {
        return albunes;
    }

    public void setAlbunes(List<Album> albunes) {
        this.albunes = albunes;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public List<ListaBasica> getListasBasicas() {
        return listasBasicas;
    }

    public void setListasBasicas(List<ListaBasica> listasBasicas) {
        this.listasBasicas = listasBasicas;
    }

    public List<ListaPremium> getListasPremium() {
        return listasPremium;
    }

    public void setListasPremium(List<ListaPremium> listasPremium) {
        this.listasPremium = listasPremium;
    }

    public void mostrarLista(){

    }
    public void agregarCancion(Cancion cancion,List lista){

    }
    public Cancion elegirCancionLista(){
        Scanner teclado = new Scanner(System.in);
        int cont=0;
        int nroCancion=-2;
         do{
            for (Cancion song : this.canciones) {

                System.out.println(cont + "- " + song.getNombreCancion() + " ( " + song.getArtistas().get(0).getNombre() + " )");
                cont++;
            }
            System.out.println("\n=======================\nIngrese el numero de la cancion elegida:");
            nroCancion = Integer.parseInt(teclado.next());
        }while (nroCancion<0 && nroCancion>canciones.size());
        return canciones.get(nroCancion);

    }



}
