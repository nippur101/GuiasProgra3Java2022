package com.company;
//1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
//1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
//debe contar con un método para calcular el área y perímetro del mismo. Ejecute las

public class Rectangulo {
    private double alto=1.0;
    private double ancho=1.0;

    public Rectangulo() {
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double perimetro(){
        return 2*this.ancho+2*this.alto;
    }
    public double area(){
        return this.ancho*this.alto;
    }
    public String imprimirAreaYPerimetro(){
        return "Perimetro: "+this.perimetro()+
        "\nArea: "+this.area();
    }

    @Override
    public String toString() {
        return "Rectangulo:\n" +
                "alto=" + this.alto +
                "\nancho=" + this.ancho;
    }
}
