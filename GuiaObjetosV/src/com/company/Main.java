package com.company;

import com.company.Spotify.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //region CARGA
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

        Artista artista4=new Artista("Sytem of a down",43,"Estados Unidos");
        List<Artista> artistas4=new ArrayList<>();
        artistas4.add(artista4);
        Album album4=new Album("Toxicity",2017,artista4);
        Cancion cancion41=new Cancion("Prison Song",201, Genero.metal,album4,artistas4);
        Cancion cancion42=new Cancion("X",118, Genero.metal,album4,artistas4);
        Cancion cancion43=new Cancion("Chop Suey!",210, Genero.metal,album4,artistas4);
        Cancion cancion44=new Cancion("Toxicity",218, Genero.metal,album4,artistas4);
        Cancion cancion45=new Cancion("Aerials",235, Genero.metal,album4,artistas4);
        Cancion cancion46=new Cancion("Science",162, Genero.metal,album4,artistas4);

        List<Album> albunes=new ArrayList<>();
        albunes.add(album1);
        albunes.add(album2);
        albunes.add(album3);
        albunes.add(album4);

        List<Cancion> canciones=new ArrayList<>();
        canciones.add(cancion11);
        canciones.add(cancion12);
        canciones.add(cancion13);
        canciones.add(cancion14);
        canciones.add(cancion15);
        canciones.add(cancion16);
        canciones.add(cancion17);
        canciones.add(cancion21);
        canciones.add(cancion22);
        canciones.add(cancion23);
        canciones.add(cancion24);
        canciones.add(cancion25);
        canciones.add(cancion26);
        canciones.add(cancion27);
        canciones.add(cancion31);
        canciones.add(cancion32);
        canciones.add(cancion33);
        canciones.add(cancion34);
        canciones.add(cancion35);
        canciones.add(cancion36);
        canciones.add(cancion41);
        canciones.add(cancion42);
        canciones.add(cancion43);
        canciones.add(cancion44);
        canciones.add(cancion45);
        canciones.add(cancion46);

        List<Artista> artistas=new ArrayList<>();
        artistas.add(artista1);
        artistas.add(artista2);
        artistas.add(artista3);
        artistas.add(artista4);


        Stack<Cancion> listaBas=new Stack<>();
        listaBas.push(cancion13);
        listaBas.push(cancion21);
        listaBas.push(cancion33);
        listaBas.push(cancion41);
        listaBas.push(cancion17);
        listaBas.push(cancion26);
        ListaBasica listaBasica1=new ListaBasica("Tranki",listaBas);
        List<ListaBasica> listasbasicas=new ArrayList<>();
        listasbasicas.add(listaBasica1);

        LinkedList<Cancion> listaPre=new LinkedList<>();
        listaPre.add(cancion14);
        listaPre.add(cancion24);
        listaPre.add(cancion34);
        listaPre.add(cancion44);
        listaPre.add(cancion31);
        listaPre.add(cancion41);
        ListaPremium listaPremium1=new ListaPremium("Movidito",listaPre);
        List<ListaPremium> listaspremium=new ArrayList<>();
        listaspremium.add(listaPremium1);


        App Spoti=new App(albunes,artistas,canciones,listasbasicas,listaspremium);
//endregion


        Menu(Spoti);
    }


    public static void Menu(App app) {
        String tipo="";
        Scanner teclado = new Scanner(System.in);
        int op0=-1;
        System.out.println("Elija:\n1-Lista Basica\n2-Lista Premium");
        op0 = Integer.parseInt(teclado.next());
        switch (op0){
            case 0:
                System.out.println("Saliendo......");break;
            case 1:ListaBasica listaB=new ListaBasica();
                listaB=app.getListasBasicas().get(0);
                tipo="basica";
                break;
            case 2:ListaPremium listaP=new ListaPremium();
                listaP=app.getListasPremium().get(0);
                tipo="premium";
                break;
        }

        int op1=43;
        while (op1!=0) {
            Scanner pauser = new Scanner(System.in);
            if(op1!=43){
                pauser.nextLine();
            }

            System.out.println("\n----------------------");
            System.out.println("Menu de Opciones:");
            System.out.println("1-Mostrar canciones\n2-Agregar cancion\n3-Remover cancion\n4-Reproducir\n0-SALIR");
            System.out.println("----------------------");


            op1 = Integer.parseInt(teclado.next());


            switch (op1) {
                case 0:
                    System.out.println("Saliendo......");break;
                case 1:
                    if(tipo.equals("premium")) {
                        app.getListasPremium().get(0).verMiLista();
                    }else{
                        app.getListasBasicas().get(0).verMiLista();
                    }
                    break;
                case 2:
                    if(tipo.equals("premium")) {
                        app.getListasPremium().get(0).añadirCancion(app.elegirCancionLista());
                    } else{
                        app.getListasBasicas().get(0).añadirCancion(app.elegirCancionLista());
                    }
                    break;
                case 3:
                    if(tipo.equals("premium")) {
                    app.getListasPremium().get(0).eliminarCancion(app.getListasPremium().get(0).seleccionarCancionBorrar());
                    } else{
                        app.getListasBasicas().get(0).eliminarCancion(app.getListasBasicas().get(0).getMiLista().get(0));
                    }
                    break;
                case 4:
                    if(tipo.equals("premium")) {
                        app.getListasPremium().get(0).reproduccion();
                    }else {
                        app.getListasBasicas().get(0).reproduccion();
                    }
                    break;
                default:
                    System.out.println("Elija una opcion correcta");
            }
        }
    }
    public static void MenuBasic(App app){
        
    }


}
