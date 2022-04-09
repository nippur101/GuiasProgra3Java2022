package com.company.FigurasGeometricas;

public class Rectangulo extends Figuras{
    private double altura;
    private double largo;

    public Rectangulo() {
    }

    public Rectangulo(String color, double altura, double largo) {
        super(color);
        this.setAltura(altura);
        this.setLargo(largo);
    }

    public Rectangulo(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        Double alt=super.valorPositivo(altura);
        this.altura = alt;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        Double lar=super.valorPositivo(largo);
        this.largo = lar;
    }
    @Override
    public double area(){
        return this.altura*this.largo;
    }
    @Override
    public double perimetro(){
        return 2*this.largo+2*this.altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{ " +super.toString()+
                ", altura=" + altura +
                ", largo=" + largo +
                '}';
    }
}
