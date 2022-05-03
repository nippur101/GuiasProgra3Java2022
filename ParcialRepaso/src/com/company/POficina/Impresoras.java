package com.company.POficina;

public class Impresoras extends ProductosInformaticos{
    private int copiasPorMinuto;

    public Impresoras() {
    }

    public Impresoras(int nroStock, String nombre, Double precio, String nombreFabricante, int copiasPorMinuto) {
        super(nroStock, nombre, precio, nombreFabricante);
        this.copiasPorMinuto = copiasPorMinuto;
    }

    public int getCopiasPorMinuto() {
        return copiasPorMinuto;
    }

    public void setCopiasPorMinuto(int copiasPorMinuto) {
        this.copiasPorMinuto = copiasPorMinuto;
    }

    @Override
    public String toString() {
        return "Impresoras{" +super.toString()+
                "copiasPorMinuto=" + copiasPorMinuto +
                '}';
    }
}
