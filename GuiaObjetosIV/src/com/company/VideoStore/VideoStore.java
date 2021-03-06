package com.company.VideoStore;

import java.time.LocalDate;
import java.util.*;

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

            if(a.getFechaDevolucion().equals( LocalDate.now()) ){
                System.out.println(a);
            }
        }
    }
    //Quiere poder consultar los últimos 10 alquileres de cada cliente.

    public void peliculaCliente(Cliente cliente){
        List<Pelicula> peliCliente=new ArrayList<>();
        for(Alquiler a:this.alquileres){
            if(a.getCliente().equals(cliente)) {
                peliCliente.add(a.getPelicula());
            }
        }
        Collections.reverse(peliCliente); // INVERTIR ARRAYLIST

        int cont=0;
        for(Pelicula film:peliCliente){
            System.out.println(peliCliente.get(cont).getTitulo());
            cont++;
            if(cont==10){
                break;
            }
        }




    }
    //Quiere una forma de consultar los títulos que fueron más alquilados.
    public List<Pelicula> masAlquilados(){ // List<Pelicula> cambiado para mostrar generico de objetos

        List<Pelicula> peliPopulares=new ArrayList<>();
        peliPopulares=this.peliculas;
        Collections.sort(peliPopulares);
        int cont=0;
        for(Pelicula film:peliPopulares){
            System.out.println(film.getTitulo()+" - Nro Veces Alquilada: "+film.getNroVecesAlquilada());
            cont++;
            if(cont==10){
                break;
            }
        }
        return peliPopulares;// cambiado para el uso de mostrar generico
    }
    public void peliculasPorGenero(String genero){
        List<Pelicula> ordenGeneropelis=new ArrayList<>();

        for (Pelicula films:peliculas){
            if(films.getGenero().equals(genero)){
                ordenGeneropelis.add(films);   //SEPARA POR GENERO
            }
        }
        Collections.sort(ordenGeneropelis);     //ORDENA LAS MAS POPULARES
        for (Pelicula filmsGen:ordenGeneropelis){
            System.out.println(filmsGen.getTitulo()+" - Nro Veces Alquilada: "+filmsGen.getNroVecesAlquilada()); //MUESTRA LAS MAS POPULARES
        }

    }

    public Pelicula buscarPelicula(String nombrePelicula){
        Pelicula peliculaBuscada=new Pelicula();
        for (Pelicula films:peliculas){
            if(films.getTitulo().equals(nombrePelicula)){
                 peliculaBuscada=films;
                 return films;
            }
        }
        return peliculaBuscada;
    }
    public void mostrarDatosPelicula(Pelicula pelicula){
        Scanner pauser = new Scanner (System.in);
        int ban=1;
        while (ban!=0) {
            System.out.println("\nQue datos de la pelicula desea ver:");
            System.out.println("1-fecha de Lanzamiento\n2-Genero\n3-Clasificacion\n4-Duracion\n5-Pais de origen\n6-Descripcion\n7-Nro de copias\n0-PARA SALIR");
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese un Numero \n");
            int a = entrada.nextInt();
            switch (a) {
                case 0:
                    ban=0;
                    break;
                case 1:
                    System.out.println(pelicula.getFechaLanzamiento());
                    break;
                case 2:
                    System.out.println(pelicula.getGenero());
                    break;
                case 3:
                    System.out.println(pelicula.getClasificacion());
                    break;
                case 4:
                    System.out.println(pelicula.getDuracionMin()+" Minutos");
                    break;
                case 5:
                    System.out.println(pelicula.getPais());
                    break;
                case 6:
                    System.out.println(pelicula.getDescripcion());
                    break;
                case 7:
                    System.out.println("Numero de copias: "+pelicula.getNroCopiasDisponibles());
                    break;
                default:
                    System.out.println("La opcion no es valida");
            }
            pauser.nextLine();
        }

    }
    public void verInfoPelicula(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el Nombre de la pelicula a buscar \n");
        String nombrePeli=entrada.nextLine();

        if(null==buscarPelicula(nombrePeli).getTitulo()){
            System.out.println("LA PELICULA NO FUE ENCONTRADA");
        }else{
            mostrarDatosPelicula(buscarPelicula(nombrePeli));
        }

    }

    public Cliente buscarCliente(String client){
        for(Cliente cliente:clientes){
            if(cliente.getNombre().equals(client)){
                return cliente;
            }
        }
        return null;
    }


    public void alquilerPelicula(){
        Scanner entrada= new Scanner(System.in);
        String nombrePeli="";
        Pelicula peliEleg;
        System.out.println("Ingrese el Nombre de la pelicula a buscar \n");
        nombrePeli=entrada.nextLine();
        peliEleg= buscarPelicula(nombrePeli);
        if(peliEleg ==null){
            System.out.println("La Pelicula no fue encontrada");
        }
        if(peliEleg!=null && peliEleg.getNroCopiasDisponibles()!=0){


        if(peliEleg!=(null)) {
            System.out.println("Ingrese el Nombre del Cliente \n");
            String clientName = entrada.nextLine();
            Cliente clientEle = buscarCliente(clientName);


            if (clientEle == null) {
                System.out.println("CLIENTE NO ENCONTRADO");
            } else {
                if (peliEleg!=(null) && peliEleg.getNroCopiasDisponibles()>0) {
                    Alquiler a = new Alquiler(clientEle, peliEleg);
                    alquileres.add(a);
                    System.out.println("La Pelicula: " + a.getPelicula().getTitulo() + " la retira " + a.getCliente().getNombre() + "\nHoy: " + a.getFechaRetiro() + " Con devolucion el dia: " + a.getFechaDevolucion());
                    System.out.println("RETIRO REALIZADO CON EXITO");
                }else{
                    System.out.println("Todas las copias fueron alquiladas");
                }

            }
        }
        }else{
            System.out.println("La pelicula se encuentra en catalogo pero NO hay copias disponibles");
        }

    }
    public void devolverPelicula(Cliente client,Pelicula film){
        for(Alquiler alquiler:alquileres){
            if(client.equals(alquiler.getCliente()) && film.equals(alquiler.getPelicula()) && alquiler.isEstadoAalquiler()){
                alquiler.setEstadoAalquiler(false);
                film.setNroCopiasDisponibles(film.getNroCopiasDisponibles()+1);
            }
        }
    }

}
