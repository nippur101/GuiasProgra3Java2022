package com.company.FigurasGeometricas;

import static java.lang.Math.PI;

public class Circulo3 extends Figuras {
    private double radio;

    public Circulo3() {
    }

    public Circulo3(String color, double radio) {
        super(color);
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
       Double rad= super.valorPositivo(radio);
        this.radio = rad;
    }
    @Override
    public double area(){
        return PI*Math.pow(this.radio,2);
    }
    @Override
    public double perimetro(){
        return 2*PI*this.radio;
    }

    @Override
    public String toString() {
        return "Circulo{ " +super.toString()+
                "  radio= " + radio +
                " }";
    }
}
