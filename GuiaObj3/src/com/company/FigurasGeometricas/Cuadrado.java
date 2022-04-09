package com.company.FigurasGeometricas;

public class Cuadrado extends Rectangulo{
    public Cuadrado(String color, double largo) {
        super(color, largo);
    }
    @Override
    public double area(){
        return Math.pow(this.getLargo(),2);
    }
    @Override
    public double perimetro(){
        return 4*getLargo();
    }

    @Override
    public String toString() {
        return "Cuadrado{ " +"Color: "+getColor()+
                ", largo= " + getLargo() +
                '}';
    }
}
