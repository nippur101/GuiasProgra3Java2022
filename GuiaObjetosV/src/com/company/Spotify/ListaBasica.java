package com.company.Spotify;

import java.util.Stack;

public class ListaBasica implements IReproduccion{
    private String nombre;
    private Stack<Cancion> miLista;

    @Override
    public void reproduccion(Stack<Cancion> songs) {
        System.out.println(songs.toString());
    }

    @Override
    public void añadirCancion(Cancion song) {

    }

    @Override
    public void eliminarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void verMiLista() {

    }
}
