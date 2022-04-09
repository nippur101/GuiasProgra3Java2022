package com.company;
// El video store de Roberto, ofrece la posibilidad de
//alquilar los títulos físicamente, esto significa que hay un límite fijo de copias de cada título.

//Roberto además nos cuenta como es el proceso de alquiler de un título de su colección, el
//cliente se acerca, solicita una película, Roberto corrobora que exista en su colección si
//existe, se asegura que tenga una copia disponible. Por último le pide los datos a su cliente,
//si ya existe, procede a generar una boleta de préstamo definiendo la fecha de retiro y la
//fecha de devolución. Caso contrario, primero carga los datos del nuevo cliente y continúa
//con la reserva. Una vez que el tiempo de préstamo finaliza y el cliente se acerca a devolver
//el título, Roberto, anota la devolución y guarda el título para tenerlo listo para el próximo
//alquiler.
//Roberto nos cuenta que le gustaría contar con ciertas funcionalidades que le harían el
//trabajo del dia a dia más fácil, tomamos nota de las mismas:
//● Quiere una forma de poder consultar los alquileres vigentes.
//● Quiere una forma de poder consultar las devoluciones que deberían hacerse en el
//dia de la fecha.
//● Quiere poder consultar los últimos 10 alquileres de cada cliente.
//● Quiere una forma de consultar los títulos que fueron más alquilados.
//● También quiere poder buscar títulos por género y ordenarlos según popularidad.
//● Quiere poder ver información detallada de un determinado título.

import com.company.VideoStore.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //region CARGA CLIENTES
        Cliente cliente1=new Cliente("Juan","Perez","Acha 163");
        Cliente cliente2=new Cliente("Lionel","Messi","F Alcorta 363");
        Cliente cliente3=new Cliente("Mariano","Martinez","Acevedo 4263");
        Cliente cliente4=new Cliente("Paulo","Dybala","Edison 463");
        Cliente cliente5=new Cliente("Angel","Di Maria","MarioBravo 478");
        Cliente cliente6=new Cliente("Lautaro","Martinez","JuanB Justo 618");

        List<Cliente> clientes=new ArrayList<>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        //endregion

        // region CARGA PELICULAS
        Pelicula pelicula1=new Pelicula( "Duro de Matar",Genero.accion,"1988",139,"R","Estados Unidos","John McClane, policía de Nueva York, llega a Los Ángeles para celebrar la Navidad, pero se ve envuelto en una lucha contra un grupo de malhechores que toman de rehén a su esposa en un rascacielos, el Nakatomi Plaza.",4);
        Pelicula pelicula2=new Pelicula("Duro de Matar 2",Genero.accion ,"1990",124,"R","Estados Unidos","Un policía de Los Ángeles pelea contra una banda de terroristas que han tomado el aeropuerto de Washington D. C.",2);
        Pelicula pelicula3=new Pelicula("Titanic",Genero.drama, "1997",195,"PG-13","Estados Unidos","Una joven de la alta sociedad abandona a su arrogante pretendiente por un artista humilde en el trasatlántico que se hundió durante su viaje inaugural.",4);
        Pelicula pelicula4=new Pelicula("Guason",Genero.drama ,"2019",122,"R","Estados Unidos","Arthur Fleck adora hacer reír a la gente, pero su carrera como comediante es un fracaso. El repudio social, la marginación y una serie de trágicos acontecimientos lo conducen por el sendero de la locura y, finalmente, cae en el mundo del crimen.",4);
        Pelicula pelicula5=new Pelicula("John Wick",Genero.accion, "2014",114,"R","Estados Unidos","John Wick es una franquicia de medios de acción y suspenso neo-noir estadounidense",4);

        List<Pelicula> peliculas=new ArrayList<>();

        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        peliculas.add(pelicula4);
        peliculas.add(pelicula5);
        //endregion
        
        //region CARGA ALQUILERES
        Alquiler alquiler1=new Alquiler(cliente1,pelicula3);
        Alquiler alquiler2=new Alquiler(cliente1,pelicula3);
        Alquiler alquiler3=new Alquiler(cliente2,pelicula2);
        Alquiler alquiler4=new Alquiler(cliente2,pelicula5);
        Alquiler alquiler5=new Alquiler(cliente3,pelicula1);
        Alquiler alquiler6=new Alquiler(cliente1,pelicula2);
        Alquiler alquiler7=new Alquiler(cliente3,pelicula2);
        Alquiler alquiler8=new Alquiler(cliente6,pelicula3);
        Alquiler alquiler9=new Alquiler(cliente4,pelicula4);
        Alquiler alquiler10=new Alquiler(cliente5,pelicula3);
        Alquiler alquiler11=new Alquiler(cliente4,pelicula2);
        Alquiler alquiler12=new Alquiler(cliente5,pelicula1);
        Alquiler alquiler13=new Alquiler(cliente2,pelicula3);
        Alquiler alquiler14=new Alquiler(cliente1,pelicula5);


        Alquiler alquiler15=new Alquiler();
        Alquiler alquiler16=new Alquiler();
        Alquiler alquiler17=new Alquiler();
        Alquiler alquiler18=new Alquiler();

        Alquiler alquiler19=new Alquiler(cliente1,pelicula3);
        Alquiler alquiler20=new Alquiler(cliente1,pelicula2);
        Alquiler alquiler21=new Alquiler(cliente1,pelicula1);
        Alquiler alquiler22=new Alquiler(cliente1,pelicula5);
        Alquiler alquiler23=new Alquiler(cliente1,pelicula3);
        Alquiler alquiler24=new Alquiler(cliente1,pelicula2);
        Alquiler alquiler25=new Alquiler(cliente1,pelicula4);



        alquiler15.setCliente(cliente1);
        alquiler15.setFechaDevolucion(LocalDate.parse("2021-07-09"));
        alquiler15.setFechaRetiro(LocalDate.parse("2021-07-06"));
        alquiler15.setCliente(cliente1);
        alquiler15.setPelicula(pelicula2);
        alquiler15.setEstadoAalquiler(false);

        alquiler16.setCliente(cliente2);
        alquiler16.setFechaDevolucion(LocalDate.parse("2021-07-09"));
        alquiler16.setFechaRetiro(LocalDate.parse("2021-07-06"));
        alquiler16.setPelicula(pelicula3);
        alquiler16.setEstadoAalquiler(false);

        alquiler17.setCliente(cliente1);
        alquiler17.setFechaDevolucion(LocalDate.parse("2022-04-01"));
        alquiler17.setFechaRetiro(LocalDate.parse("2022-04-06"));
        alquiler17.setPelicula(pelicula5);
        alquiler17.setEstadoAalquiler(true);

        alquiler18.setCliente(cliente4);
        alquiler18.setFechaDevolucion(LocalDate.parse("2022-04-01"));
        alquiler18.setFechaRetiro(LocalDate.parse("2022-04-06"));
        alquiler18.setPelicula(pelicula5);
        alquiler18.setEstadoAalquiler(true);







        List<Alquiler> alquileres=new ArrayList<>();

        alquileres.add(alquiler1);
        alquileres.add(alquiler2);
        alquileres.add(alquiler3);
        alquileres.add(alquiler4);
        alquileres.add(alquiler5);
        alquileres.add(alquiler6);
        alquileres.add(alquiler7);
        alquileres.add(alquiler8);
        alquileres.add(alquiler9);
        alquileres.add(alquiler10);
        alquileres.add(alquiler11);
        alquileres.add(alquiler12);
        alquileres.add(alquiler13);
        alquileres.add(alquiler14);


        alquileres.add(alquiler15);
        alquileres.add(alquiler16);
        alquileres.add(alquiler17);
        alquileres.add(alquiler18);
        alquileres.add(alquiler19);
        alquileres.add(alquiler20);
        alquileres.add(alquiler21);
        alquileres.add(alquiler22);
        alquileres.add(alquiler23);
        alquileres.add(alquiler24);
        alquileres.add(alquiler25);

        //endregion




        VideoStore video=new VideoStore(alquileres,clientes,peliculas);

        ///ALQUILERES VIGENTES
        //video.alquieleresVigentes();
        /// 10 ULTIMAS PELICULAS ALQULIADAS POR EL CLIENTE
        //video.peliculaCliente(cliente1);
        ///10 PELICULAS MAS ALQUILADAS
        video.masAlquilados();



    }
}
