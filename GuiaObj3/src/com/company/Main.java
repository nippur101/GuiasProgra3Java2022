package com.company;

import com.company.Circulo.Cilindro;
import com.company.Circulo.Circulo;
import com.company.FigurasGeometricas.Circulo3;
import com.company.FigurasGeometricas.Cuadrado;
import com.company.FigurasGeometricas.Rectangulo;
import com.company.PersonalColegio.Estudiante;
import com.company.PersonalColegio.Persona;
import com.company.PersonalColegio.Staff;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Ejer02();
    }

    public static void Ejer01(){
        //Inicializar un Cilindro y debuguear analizando los constructores a los que va
        //llamando para inicializar la cadena de herencia. Imprimir por pantalla, el
        //radio del cilindro, la altura, el área de la base y el volumen.
        Cilindro cili1=new Cilindro(2,"verde",5);
        System.out.println(cili1);

        //● Inicializar un segundo CIlindro esta vez especificando la altura y radio.
        //Imprimir por pantalla el radio, la altura, el área de la base y el volumen.

        Cilindro cili2=new Cilindro(3.0,5);
        System.out.println(cili2);
        System.out.println("El volumen del cilindro es : "+cili2.volumenCilindro());
        //● Sobreescribir el método calcular area declarado en Círculo, para que nos
        //permita calcular el área del cilindro.
        //(2π×radius×height + 2×areaBase)

        System.out.println("El Area del cilindro es : "+cili2.area());
        //Imprimir por pantalla el área y el volumen del cilindro. Vamos a notar que el
        //cálculo del volumen difiere, esto es porque nosotros sobreescribimos el método
        //calcular area y ahora nos calcula el área de un cilindro. Modificar el método calcular
        //volumen en la clase cilindro para que llame al método de la SUPER clase que calcula
        //el área.
        //● Modificar el método toString() de la clase cilindro para que imprima por
        //pantalla lo siguiente

    }
    public static void Ejer02(){
//Inicializar 4 estudiantes diferentes.
        Estudiante estudiante1=new Estudiante(1548985,"Javier","Macedo","javier@gmail", "Acha 163",2019,5000,"Tecnicatura en Programacion");
        Estudiante estudiante2=new Estudiante(2654616,"Johanna","Lang","Joahha@gmail", "Acevedo 3170",2020,3000,"Ceramica");
        Estudiante estudiante3=new Estudiante(9050465,"Mariano","Lopez","mariano@gmail", "Juan b Justo 1652",2019,5000,"Tecnicatura en Programacion");
        Estudiante estudiante4=new Estudiante(3516554,"Fernanda","Gonzales","fer@gmail", "Av trabajadores 4123",2018,4000,"111mil");
//● Inicializar 4 miembros de staff con características diferentes.
        Staff prof1=new Staff(4888684,"Matias","Garcia","matias@gmail","bestoso 321",68000.0,"Noche");
        Staff prof2=new Staff(6514684,"Gustao","Sonvico","ghustavo@gmail","Ayolas 651",80000.0,"Noche");
        Staff prof3=new Staff(6541154,"Eduardo","monaco","eduardo@gmail","vergara 565",60000.0,"Mañana");
        Staff prof4=new Staff(5416165,"Celina","Lorenzo","celina@gmail","Edison 6543",65000.0,"Mañana");
//● Crear un array que permita almacenar juntos los tipos anteriores y
//almacenar las 8 instancias creadas anteriormente.
        ArrayList<Persona> colegio=new ArrayList<>();
        colegio.add(estudiante1);
        colegio.add(estudiante2);
        colegio.add(estudiante3);
        colegio.add(estudiante4);
        colegio.add(prof1);
        colegio.add(prof2);
        colegio.add(prof3);
        colegio.add(prof4);

//● Investigar el uso de la palabra reservada instanceof.

//● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
//la cantidad de miembros de staff.
        System.out.println("Lista de estudiantes\n=====================");
        System.out.println("Numero de estudiantes "+Estudiante.getContEstuSta());
        for(Persona p:colegio){

            if(p instanceof Estudiante){
                System.out.println(p);
            }
        }

        System.out.println("Lista de Docentes\n=========================");
        System.out.println("Numero de Docentes: "+Staff.getContStaffStat());
        for(Persona p:colegio){

            if(p instanceof Staff){
                System.out.println(p);
            }
        }

//● Recorrer el array y sumar el total de ingresos que percibe la
//institución por parte de la cuota de estudiantes.
        Double ingresos=0.0;
        for(Persona p:colegio){

            if(p instanceof Estudiante){
                ingresos+=((Estudiante) p).getCuotaMensual();
            }
        }
        System.out.println("Los ingresos por las cotas de los estudiantes son: "+ingresos);
    }
    public static void Ejer03(){
        //● Considerar si existe la posibilidad de crear un tipo abstracto que
        //defina las características en común y que permita establecer qué
        //métodos son mandatarios para las subclases.
        //● Los tipos deben contener diferentes constructores, por defecto y que
        //inicialice diferentes atributos.
        //● Crear diferentes instancias de cada tipo e imprimir sus
        //características.
        Circulo3 circ1=new Circulo3("Rojo",9.0);
        Circulo3 circ2=new Circulo3("Verde",6.0);
        Circulo3 circ3=new Circulo3("Naranja",7.0);
        System.out.println("Circulos\n\n");
        System.out.println(circ1);
        System.out.println(circ2);
        System.out.println(circ3);
        System.out.println("Area Circulo 1= "+circ1.area());
        Rectangulo rect1=new Rectangulo("Violeta",4.0,6.0);
        Rectangulo rect2=new Rectangulo("Rosa",11.0,13.0);
        System.out.println("Rectangulo\n\n");
        System.out.println(rect1);
        System.out.println(rect1.area());


        //● Nos piden agregar un nuevo tipo de forma, esta vez es un Cuadrado.
        //Analice dónde es conveniente agregarlo en el árbol de herencia.
        //Teniendo en cuenta evitar la duplicación de código innecesario.
        Cuadrado cuadrado1=new Cuadrado("Negro",9.0);
        System.out.println(cuadrado1);
    }
}
