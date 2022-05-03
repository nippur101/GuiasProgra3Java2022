package com.company.POficina;

public class Silla extends Muebles implements IDescuentos{
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
        return super.toString()+
                " contieneruedas=" + contieneruedas ;
    }


    @Override
    public double precioConDescuento(int porcentajeDescuento) {
        return this.getPrecio()*(1-(double)porcentajeDescuento/100.0);
    }
    public double actualizarPrecios(){
      double precioSilla=this.getPrecio()*1.05;
        this.setPrecio(precioSilla);
        return precioSilla;
    }
}
