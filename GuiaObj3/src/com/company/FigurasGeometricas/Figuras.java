package com.company.FigurasGeometricas;

public abstract class Figuras {
    private String color;

    public Figuras() {
    }

    public Figuras(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double area();
    public abstract double perimetro();
    public double valorPositivo(double valor){
        if(valor<0){
            System.out.println("================================");
            System.out.println("El valor ingresado debe positivo");
            System.out.println("================================");
        }
        return Math.abs(valor);
    }
    @Override
    public String toString() {
        return "color= " + color ;
    }
}
