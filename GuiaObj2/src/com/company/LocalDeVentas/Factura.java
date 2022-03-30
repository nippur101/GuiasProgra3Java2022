package com.company.LocalDeVentas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

//Factura que representa una venta del
//local, cada Factura posee un identificador de las mismas características que el
//usado en Cliente. A su vez cada factura posee un monto total, una fecha y el Cliente
//que generó la compra. Para la fecha de la venta se le va a asignar la fecha y hora al
//momento de creación del objeto Factura. El tipo Factura debe contar con un
//método que calcule el monto final luego de aplicarle el descuento que posee el
//cliente.
public class Factura {
    private String id;
    private ArrayList<ItemVenta> items;
    private double montoTotal;
    private LocalDate fecha;
    private Cliente cliente;

    public Factura() {
    }

    public Factura( ArrayList<ItemVenta> items, Cliente cliente) {
        this.id = java.util.UUID.randomUUID().toString().toUpperCase().substring(0,6);
        this.items = items;
        this.montoTotal = montoTotalItems();
        this.fecha = LocalDate.now();
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double montoConDescuento(){
        if(this.cliente.getPorcDescuento()>0) {
            return this.montoTotal * (1 - this.cliente.getPorcDescuento() / 100.0);
        }else{
            return this.montoTotal;
        }
    }
    public double montoTotalItems(){
        Double montoSumado=0.0;
        for(ItemVenta i:this.items){
            montoSumado=i.getPrecioUnitario()+montoSumado;
        }
        return montoSumado;
    }
    //d. Cree un método que facilite la impresión del objeto de tipo Factura y que
    //siga el siguiente formato.
    //Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,email=?, descuento=?]]
    @Override
    public String toString() {
        return "Factura:[" +
                " id= " + id + "  Fecha:" +this.fecha+
                ", monto=" + montoTotal +", MontoCDescuento: "+montoConDescuento()
                +", "+ cliente.toString() +
                ']';
    }
}
