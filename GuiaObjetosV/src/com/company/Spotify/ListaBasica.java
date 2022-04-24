package com.company.Spotify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ListaBasica implements IReproduccion{
    private String nombre;
    private Stack<Cancion> miLista=new Stack<>();

    public ListaBasica() {
    }

    public ListaBasica(String nombre, Stack<Cancion> miLista) {
        this.nombre = nombre;
        this.miLista = miLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Stack<Cancion> getMiLista() {
        return miLista;
    }

    public void setMiLista(Stack<Cancion> miLista) {
        this.miLista = miLista;
    }
    private void moverTopeAlFinal(){
        Cancion tope=miLista.pop();
        Stack<Cancion> aux=new Stack<>();

        while(!miLista.empty()){
            aux.push(miLista.pop());
        }

        miLista.push(tope);
        while (!aux.empty()){
            miLista.push(aux.pop());
        }

    }

    @Override
    public void reproduccion() {

        System.out.println(miLista.peek().toString());
        this.moverTopeAlFinal();


    }

    @Override
    public void añadirCancion(Cancion song) {
        miLista.push(song);
    }

    @Override
    public void eliminarCancion(Cancion song) {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void verMiLista() {

        int cont=0;
        System.out.println("-------------------------");
        for(Cancion canciones:miLista){
            System.out.println(cont+"-"+canciones.getNombreCancion()+" ("+canciones.getArtistas().get(0).getNombre()+" )");
            cont++;
        }
        System.out.println("-------------------------\n");




    }
}
