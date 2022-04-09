package com.company.VideoStore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class VideoStore  {
    private List<Alquiler> alquileres=new ArrayList<>();
    private List<Cliente> clientes=new ArrayList<>();
    private List<Pelicula> peliculas=new ArrayList<>();

    public VideoStore() {

    }

    public VideoStore(List<Alquiler> alquileres, List<Cliente> clientes, List<Pelicula> peliculas) {
        setAlquileres(alquileres);
        setClientes(clientes);
        setPeliculas(peliculas);
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
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
        for(Alquiler a:this.alquileres){
            if(a.getCliente().equals(cliente)) {
                peliCliente.add(a.getPelicula());
            }
        }
        int fin;
        int cont=peliCliente.size()-1;
        if(cont<10){
            fin=0;
        }else{
            fin=cont-10;
        }
        while(cont>=0 && cont!=fin){
            System.out.println(peliCliente.get(cont));
            cont--;
        }
    }
    //Quiere una forma de consultar los títulos que fueron más alquilados.
    public void masAlquilados(){

        List<Pelicula> peliPopulares=new ArrayList<>();
        peliPopulares=this.peliculas;
        Collections.sort(peliPopulares);
        int cont=0;
        for(Pelicula film:peliPopulares){
            System.out.println(film);
            cont++;
            if(cont==10){
                break;
            }

        }

    }

}
