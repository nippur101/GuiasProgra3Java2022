package com.company.Spotify;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ListaPremium implements IReproduccion{
    private String nombre;
    private List<Cancion> listaPremium= new LinkedList<>();

    public ListaPremium() {
    }

    public ListaPremium(String nombre, List<Cancion> listaPremium) {
        this.nombre = nombre;
        this.listaPremium = listaPremium;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cancion> getListaPremium() {
        return listaPremium;
    }

    public void setListaPremium(List<Cancion> listaPremium) {
        this.listaPremium = listaPremium;
    }

    @Override
    public void reproduccion() {

        Scanner teclado = new Scanner(System.in);

        this.verMiLista();
        int nroCancion=0;
        verMiLista();
        do{


            System.out.println("Elige cancion a Reproducir:");
            nroCancion = Integer.parseInt(teclado.next());
            if(nroCancion<0 && nroCancion>listaPremium.size()){
                System.out.println("Ingrese un numero valido");
            }

        }while (nroCancion<0 && nroCancion>listaPremium.size());


        System.out.println(listaPremium.get(nroCancion));
        teclado.nextLine();
    }

    @Override
    public void añadirCancion(Cancion song) {
        listaPremium.add(song);
    }

    @Override
    public void eliminarCancion(Cancion song) {
        int cont=0;
        for(Cancion canciones:listaPremium){

            if(song.equals(canciones)){
                listaPremium.remove(cont);
                break;
            }
            cont++;
        }

    }

    @Override
    public void verMiLista() {

        int cont=0;
        System.out.println("-------------------------");
        for(Cancion canciones:listaPremium){

            System.out.println(cont+"-"+canciones.getNombreCancion()+" ("+canciones.getArtistas().get(0).getNombre()+" )");
            cont++;
        }
        System.out.println("-------------------------\n");


    }
    public Cancion seleccionarCancionBorrar(){
        Scanner teclado = new Scanner(System.in);
        int nroCancion=0;
        verMiLista();
         do{


            System.out.println("Elija numero de cancion a borrar");
            nroCancion = Integer.parseInt(teclado.next());
            if(nroCancion<0 && nroCancion>listaPremium.size()){
                System.out.println("Ingrese un numero valido");
            }

        }while (nroCancion<0 && nroCancion>listaPremium.size());
        return listaPremium.get(nroCancion);
    }
}
