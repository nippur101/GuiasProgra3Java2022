package com.company.Spotify;

import java.util.List;
import java.util.Stack;

//Reproducir: Debe mostrar la canción en reproducción, junto con el nombre del
//álbum, género y nombre del artista junto con el artista invitado si es que hay.
//- AñadirCancion: recibe una canción por parámetro y la guarda en la lista en
//reproducción.
//- EliminarCancion: mostrará las canciones de la lista en reproducción y
//permitirá elegir una para eliminar.
//- VerMiLista: Nos permite ver nuestra lista de reproducción.
//3)
public interface IReproduccion {
    void reproduccion(List<Cancion> songs);
    void añadirCancion(Cancion song);
    void eliminarCancion(Cancion song);
    void verMiLista();


}
