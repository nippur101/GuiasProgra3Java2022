package com.company.Health;


import java.util.Scanner;

public class Health {
    public static void Health() {
        String nombre="";
        long dni;
        int edad=0;
        char sexo='H';
        double peso=0.0;//kg
        double altura=0.0;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Inrese Nombre:");
        nombre=entrada.nextLine();
        System.out.println("Ingrese la edad:");
        edad=entrada.nextInt();
        System.out.println("Ingrese el sexo");
        sexo=entrada.next().charAt(0);
        System.out.println("Ingrese el peso");
        peso=entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura=entrada.nextDouble();

    }
}