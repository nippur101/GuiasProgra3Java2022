package com.company.Circulo;

import java.security.SecureRandom;

import static java.lang.Math.PI;

//Para comenzar esta guía, vamos a empezar con un ejemplo sencillo, que nos
//permita entender el concepto de herencia, superclase y subclase. Para esto vamos a
//definir el tipo Círculo, que posee un radio cuyo valor por defecto al ser inicializado
//sin valores es 1.0. Además el tipo Círculo posee un atributo color, por defecto rojo,
//un método para calcular el área y otro para imprimir sus características. Puede
//reutilizar la clase Circulo de las guías anteriores.
public class Circulo {
    private double radio=1.0;
    private String color="Rojo";

    public Circulo() {
    }

    public Circulo(double radio, String color) {
        setRadio(radio);
        this.color = color;
    }

    public Circulo(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = Math.abs(radio);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double area(){
        return PI*Math.pow(this.radio,2);
    }

    @Override
    public String toString() {
        return " { radio= " + radio +
                ", color= '" + color + '\'' +
                '}';
    }
}
