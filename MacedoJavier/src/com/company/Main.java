package com.company;

import com.company.Ejercicio1.Empleado;
import com.company.Ejercicio1.Persona;
import com.company.Ejercicio1.Usuario;
import com.company.Ejercicio2.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    //DNI:25.562.962, apellido:Macedo Nombres:Joaquin Javier  comision:4.

    public static void main(String[] args) {
	    Ejercicio1();
        Ejercicio2();
    }
    public static void Ejercicio1(){
        Empleado empleado1=new Empleado("Juan Perez","18-12-1987");
        Empleado empleado2=new Empleado("Lucas Suarez","25-03-1977");
        Empleado empleado3=new Empleado("Juliana Lopez","05-05-1999");
        Usuario usuario1=new Usuario("Matias Enrique","12-09-2001","matias@mail.com");
        Usuario usuario2=new Usuario("Norberto Maidana","19-04-2000","norbertos@mail.com");
        Usuario usuario3=new Usuario("Geremisas Monke","04-07-1996","geremias@mail.com");
        List<Persona> personas=new ArrayList<>();
        personas.add(empleado1);
        personas.add(empleado2);
        personas.add(empleado3);
        personas.add(usuario1);
        personas.add(usuario2);
        personas.add(usuario3);

        for (Persona person:personas){
            if(person instanceof Usuario){
                System.out.println("Usuario:");

            }else {
                System.out.println("Empleado:");
            }
            System.out.println(person);


        }
    }
    public static void Ejercicio2(){
        //2B====================
        Cliente cliente1=new Cliente("Lionel","Messi");
        Cliente cliente2=new Cliente("Enzo","Fernandez");
        Provedores provedor1=new Provedores("Nadia","Todoroff");
        Provedores provedor2=new Provedores("estefania","Magnin");
        //=================================
        VideoJuego juego1=new VideoJuego("WoW",2500.0, Categoria.aventura);
        VideoJuego juego2=new VideoJuego("Anno1800",1500.0, Categoria.aventura);
        VideoJuego juego3=new VideoJuego("CounterS",1200.0, Categoria.accion);
        VideoJuego juego4=new VideoJuego("FIFA",2400.0, Categoria.deporte);
        List<PersonasLocal> personasLocal=new ArrayList<>();
        personasLocal.add(cliente1);
        personasLocal.add(cliente2);
        personasLocal.add(provedor1);
        personasLocal.add(provedor2);
        List<VideoJuego> juegos=new ArrayList<>();
        juegos.add(juego1);
        juegos.add(juego2);
        juegos.add(juego3);
        juegos.add(juego4);

        TiendaVideoJuegos tienda=new TiendaVideoJuegos(personasLocal,juegos);
        tienda.comprarJuego(juego1,cliente1);
        tienda.comprarJuego(juego2,cliente1);
        tienda.comprarJuego(juego3,cliente2);
        tienda.comprarJuego(juego2,cliente2);
        tienda.comprarJuego(juego4,cliente1);
        tienda.comprarJuego(juego2,cliente2);
        tienda.comprarJuego(juego1,cliente1);
        tienda.comprarJuego(juego1,cliente1);
        //2C================================
        System.out.println(tienda.getClientes());
        System.out.println(tienda.getProvedores());
       // =======================================
        //2E
        System.out.println(cliente1.getId());
        System.out.println(tienda.clientePorId(cliente1.getId()));
        //2F

        for(VideoJuego games:tienda.getVideoJuegos()){
            System.out.println(games);

        }


    }

}
