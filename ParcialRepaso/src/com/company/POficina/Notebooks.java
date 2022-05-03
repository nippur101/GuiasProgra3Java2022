package com.company.POficina;

public class Notebooks extends ProductosInformaticos{
    private int gbRam;

    public Notebooks() {
    }

    public Notebooks(int nroStock, String nombre, Double precio, String nombreFabricante, int gbRam) {
        super(nroStock, nombre, precio, nombreFabricante);
        this.gbRam = gbRam;
    }

    public int getGbRam() {
        return gbRam;
    }

    public void setGbRam(int gbRam) {
        this.gbRam = gbRam;
    }

    @Override
    public String toString() {
        return "Notebooks{" +super.toString()+
                "gbRam=" + gbRam +
                '}';
    }
}
