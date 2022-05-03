package com.company.POficina;

public class Impresoras extends ProductosInformaticos implements IDescuentos{
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
        return super.toString()+
                " copiasPorMinuto=" + copiasPorMinuto ;
    }


    @Override
    public double precioConDescuento(int porcentajeDescuento) {
        return this.getPrecio()*(1-(double)porcentajeDescuento/100.0);
    }
    public double actualizarPrecios(){
        double precioImpresora=this.getPrecio()*1.15;
        this.setPrecio(precioImpresora);
        return precioImpresora;
    }
}
