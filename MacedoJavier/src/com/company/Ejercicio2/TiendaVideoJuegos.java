package com.company.Ejercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TiendaVideoJuegos {
    private List<PersonasLocal> personasLocal=new ArrayList<>();
    private List<VideoJuego> videoJuegos=new ArrayList<>();

    public TiendaVideoJuegos() {
    }

    public TiendaVideoJuegos(List<PersonasLocal> personasLocal, List<VideoJuego> videoJuegos) {
        this.personasLocal = personasLocal;
        this.videoJuegos = videoJuegos;
    }

    public List<PersonasLocal> getPersonasLocal() {
        return personasLocal;
    }

    public void setPersonasLocal(List<PersonasLocal> personasLocal) {
        this.personasLocal = personasLocal;
    }

    public List<VideoJuego> getVideoJuegos() {
        return videoJuegos;
    }

    public void setVideoJuegos(List<VideoJuego> videoJuegos) {
        this.videoJuegos = videoJuegos;
    }

    //2C================================
    public List<Cliente> getClientes(){
        List<Cliente> clientes=new ArrayList<>();
        for(PersonasLocal person:this.personasLocal){
            if(person instanceof Cliente){
                clientes.add((Cliente)person);
            }
        }
        return clientes;
    }
    public List<Provedores> getProvedores(){
        List<Provedores> provedores=new ArrayList<>();
        for(PersonasLocal person:this.personasLocal){
            if(person instanceof Provedores){
                provedores.add((Provedores) person);
            }
        }
        return provedores;
    }
    //================================


    //2D==================================
    public void comprarJuego(VideoJuego juego,Cliente cliente){
        cliente.agrearJuegoComprado(juego);
        juego.setNroVecesComprado(juego.getNroVecesComprado()+1);
    }

    public List<VideoJuego> ultimosDiezCliente(Cliente cliente){
        List<VideoJuego> aux=new ArrayList<>();
        int cont=0;
        for(int i=cliente.getJuegosComprados().size()-1;i>-1;i--){
            aux.add(cliente.getJuegosComprados().get(i));
            cont++;
            if(cont==10){
                break;
            }
        }
        return aux;
    }
//============================================
    public Cliente clientePorId(String id){
        for(PersonasLocal personas:this.personasLocal){
            if(personas instanceof Cliente && id.equals(((Cliente) personas).getId())){
                return (Cliente) personas;
            }
        }
        return null;
    }
//2F=========================================================
    public ArrayList<VideoJuego> juegosMasComrados(){
        List<VideoJuego> juegosMasComprados=new ArrayList<>();
        juegosMasComprados=this.videoJuegos;
        Collections.sort(juegosMasComprados);

        return (ArrayList<VideoJuego>) juegosMasComprados;
    }

}
