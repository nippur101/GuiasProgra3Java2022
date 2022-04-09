package com.company.Circulo;

import static java.lang.Math.PI;

//Por otro lado tenemos un tipo Cilindro, que extiende a la clase Circulo, por
//ende se convierte en subclase de Círculo. El Cilindro a diferencia del Círculo posee
//un atributo altura, que también se inicializa en 1.0 cuando no le pasamos un valor a
//su constructor. Y un método para calcular el volumen. Codifique ambas clases y
//realice las siguientes pruebas.
public class Cilindro extends Circulo {
        private double altura=1.0;

    public Cilindro() {
    }

    public Cilindro(double altura) {
        setAltura(altura);
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        setAltura(altura);
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }



    public void setAltura(double altura) {
        this.altura = Math.abs(altura);
    }

    public double volumenCilindro(){
        return super.area()*this.altura;
    }
    public double area(){
        return 2*PI*this.getRadio()*this.altura+2*super.area();
    }
    //Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};
    @Override
    public String toString() {
        return "Cilindro" +super.toString()+"  "+
                " altura= { " + altura+" }";
    }
}
