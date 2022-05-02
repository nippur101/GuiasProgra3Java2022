package com.company.Health;


import java.util.HashMap;
import java.util.Scanner;

public class Health {
    public static void Health() {
        HashMap<Long, Persona> personas = new HashMap<Long, Persona>();
        String nombre="";
        long dni;
        int edad=0;
        char sexo='H';
        double peso=0.0;//kg
/*
        Scanner entrada = new Scanner (System.in);
        System.out.println("Inrese DNI:");
        dni=entrada.nextLong();
        entrada.nextLine();
        System.out.println("Inrese Nombre:");
        nombre=entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingrese la edad:");
        edad=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el sexo");
        sexo=entrada.next().charAt(0);
        entrada.nextLine();
        System.out.println("Ingrese el peso");
        peso=entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese la altura");
        double altura = entrada.nextDouble();
        entrada.nextLine();


        Persona person=new Persona(dni,nombre,edad,sexo,peso,altura);

 */
        Persona persona2=new Persona(164543,"Lucas",18,'m',75,1.7);
        Persona persona3=new Persona(151464516,"Matias",28,'m',95,1.7);
        Persona persona4=new Persona(213124,"Hernan",38,'m',60,1.9);
        agregarPersona(persona2.hashCode(),persona2,personas);
        agregarPersona(persona3.hashCode(),persona3,personas);
        agregarPersona(persona4.hashCode(),persona4,personas);
       // agregarPersona(dni,person,personas);

        int imc=persona2.calcularIMC();
        System.out.println(persona2.getNombre()+" ");
        resultadoIMC(imc);

        imc=persona3.calcularIMC();
        System.out.println(persona3.getNombre()+" ");
        resultadoIMC(imc);
        System.out.println(persona4.getNombre()+" ");
        imc=persona4.calcularIMC();
        resultadoIMC(imc);

        mostrarPersonas(personas);


    }
    public static void agregarPersona(long dni,Persona persona,HashMap<Long,Persona> personas){
        if(personas.containsKey(dni)){
            System.out.println("La persona esta Ingresada");
        }else{
            personas.put(dni,persona);
        }
    }
    public static void mostrarPersonas(HashMap<Long,Persona> personas){
        personas.forEach((k,v)->{
            System.out.println("Key: "+k);
            System.out.println("Valor: "+v);
        });
    }
    public static void resultadoIMC(int imc){
        if(imc<0){
            System.out.println("PESO IDEAL");

        } else if (imc==0) {
            System.out.println("PESO POR DEBAJO DEL IDEAL");

        }else {
            System.out.println("TIENE SOBREPESO");
        }
    }

}