package com.company;
import com.company.Health.Password;
import com.company.Health.Persona;


public class Main {

    public static void main(String[] args) {
        Persona p=new Persona();
       // System.out.println(p.getDni());

        Password pa=new Password(30);
        System.out.println(pa.getContrasenia());

        //Health.Health();
        System.out.println(pa.esFuerte());


    }
}
