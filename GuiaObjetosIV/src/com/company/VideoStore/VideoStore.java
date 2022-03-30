package com.company.VideoStore;

import java.time.LocalDate;
import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Alquiler> alquileres=new ArrayList<>();
    private ArrayList<Cliente> clientes=new ArrayList<>();
    private ArrayList<Pelicula> peliculas=new ArrayList<>();

    public VideoStore() {
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    //Quiere una forma de poder consultar los alquileres vigentes.
    public void alquieleresVigentes(){
        for(Alquiler a:alquileres){
            if(a.isEstadoAalquiler()==true) {
                System.out.println(a);
            }
        }
    }
    //Quiere una forma de poder consultar las devoluciones que deberían hacerse en el dia de la fecha.

    public void devolucionesDelDia(){
        for(Alquiler a:alquileres){
            if(a.getFechaDevolucion()== LocalDate.now()) {
                System.out.println(a);
            }
        }
    }
    //Quiere poder consultar los últimos 10 alquileres de cada cliente.

    public void peliculaCliente(Cliente cliente){
        ArrayList<Pelicula> peliCliente=new ArrayList<>();
        for(Alquiler a:alquileres){
            if(a.getCliente().equals(cliente)) {
                peliCliente.add(a.getPelicula());
            }
        }
        int inicio=peliCliente.size();
        int fin;
        if(inicio>=10){
            fin=inicio-10;
        }else{
            fin=0;
        }
        for(int i=inicio;fin>i;i--){
            System.out.println(peliCliente.get(i));
        }
    }
    //Quiere una forma de consultar los títulos que fueron más alquilados.
    public void masAlquilados(){
        Pelicula peliAux=alquileres.get(0).getPelicula();
        ArrayList<Pelicula> peliPopulares=new ArrayList<>();



    }


}
