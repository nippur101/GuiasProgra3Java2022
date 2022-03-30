package com.company;
//3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
//descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
//total teniendo en cuenta el precio unitario y cantidad. Un método que permita
//imprimir por pantalla los atributos del objeto de la siguiente forma:

//a. Inicialice el objeto con los atributos necesarios
//b. Imprima por pantalla el objeto inicializado.
public class Venta {
    private int id;
    private String descripcion;
    private double precioUnitario;
    private int cantidad;

    public Venta() {
    }

    public Venta(int identificador, String descripcion, double precioUnitario, int cantidad) {
        this.id = identificador;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double precioTotal(){
        return this.cantidad*this.precioUnitario;
    }

    //ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]


    @Override
    public String toString() {
        return "Venta[ " +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", PrecioTotal=" + this.precioTotal() +
                ']';
    }
}
