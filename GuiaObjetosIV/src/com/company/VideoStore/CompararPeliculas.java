package com.company.VideoStore;

import java.util.Comparator;

public class CompararPeliculas implements Comparator<Pelicula> {
    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        if(o1.getNroVecesAlquilada()>o2.getNroVecesAlquilada()){
            return 1;
        }else if(o1.getNroVecesAlquilada()>o2.getNroVecesAlquilada()){
            return 0;
        }else{
            return-1;
        }
    }
}
