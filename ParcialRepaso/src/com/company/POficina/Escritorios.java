package com.company.POficina;

public class Escritorios extends Muebles {
    private double ancho;
    private double alto;

    public Escritorios() {
    }

    public Escritorios(int nroStock, String nombre, Double precio, double ancho, double alto) {
        super(nroStock, nombre, precio);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return super.toString()+
                " ancho=" + ancho +
                ", alto=" + alto ;
    }
    public double actualizarPrecios(){
        double precioEscritorio=this.getPrecio()*1.1;
        this.setPrecio(precioEscritorio);
        return precioEscritorio;
    }
}
