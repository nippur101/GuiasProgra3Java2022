package com.company;

import com.company.Spotify.Album;
import com.company.Spotify.Artista;
import com.company.Spotify.Cancion;
import com.company.Spotify.Genero;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Artista artista1=new Artista("Ciro y los persas",50,"Argentino");
        List<Artista> artistas1=new ArrayList<>();
        artistas1.add(artista1);
        Album album1=new Album("Espejos",2009,artista1);
        Cancion cancion11=new Cancion("Antes y despues",302, Genero.rock,album1,artistas1);
        Cancion cancion12=new Cancion("Insisto",270, Genero.rock,album1,artistas1);
        Cancion cancion13=new Cancion("Espejo",269, Genero.rock,album1,artistas1);
        Cancion cancion14=new Cancion("Vas a bailar",300, Genero.rock,album1,artistas1);
        Cancion cancion15=new Cancion("Blues de la ventana",280, Genero.rock,album1,artistas1);
        Cancion cancion16=new Cancion("Paso a paso",314, Genero.rock,album1,artistas1);
        Cancion cancion17=new Cancion("Malambo para Luca",245, Genero.rock,album1,artistas1);

        Artista artista2=new Artista("Las Pelotas",45,"Argentino");
        List<Artista> artistas2=new ArrayList<>();
        artistas2.add(artista2);
        Album album2=new Album("Despierta",2010,artista2);
        Cancion cancion21=new Cancion("Saben",185, Genero.rock,album2,artistas2);
        Cancion cancion22=new Cancion("¿Que podes dar?",181, Genero.rock,album2,artistas2);
        Cancion cancion23=new Cancion("Pasajeros",258, Genero.rock,album2,artistas2);
        Cancion cancion24=new Cancion("nunca te jugaste",173, Genero.rock,album2,artistas2);
        Cancion cancion25=new Cancion("personalmente",250, Genero.rock,album2,artistas2);
        Cancion cancion26=new Cancion("Destellos",204, Genero.rock,album2,artistas2);
        Cancion cancion27=new Cancion("Qu estes sonriendo",236, Genero.rock,album2,artistas2);

        Artista artista3=new Artista("LP",40,"Estados Unidos");
        List<Artista> artistas3=new ArrayList<>();
        artistas3.add(artista3);
        Album album3=new Album("Lost on you",2017,artista3);
        Cancion cancion31=new Cancion("Muddy Waters",228, Genero.pop,album3,artistas3);
        Cancion cancion32=new Cancion("lost on you",268, Genero.pop,album3,artistas3);
        Cancion cancion33=new Cancion("When we are high",237, Genero.pop,album3,artistas3);
        Cancion cancion34=new Cancion("Switchblade",264, Genero.pop,album3,artistas3);
        Cancion cancion35=new Cancion("Up against me",182, Genero.pop,album3,artistas3);
        Cancion cancion36=new Cancion("Other people",244, Genero.pop,album3,artistas3);


    }
}
