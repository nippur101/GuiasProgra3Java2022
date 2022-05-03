package com.company.POficina;

public class Silla extends Muebles {
    private boolean contieneruedas;
    public Silla() {

    }

    public Silla(boolean contieneruedas) {
        this.contieneruedas = contieneruedas;
    }

    public Silla(int nroStock, String nombre, Double precio, boolean contieneruedas) {
        super(nroStock, nombre, precio);
        this.contieneruedas = contieneruedas;
    }

    public boolean isContieneruedas() {
        return contieneruedas;
    }

    public void setContieneruedas(boolean contieneruedas) {
        this.contieneruedas = contieneruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +super.toString()+
                "contieneruedas=" + contieneruedas +
                '}';
    }
}
