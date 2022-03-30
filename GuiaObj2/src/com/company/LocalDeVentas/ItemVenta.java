package com.company.LocalDeVentas;
//e. Analizar de agregar el tipo ItemVenta, que representa un producto que
//forma parte de la venta. El mismo contiene un id, un nombre, descripción y
//precio unitario.
public class ItemVenta {
    private String id;
    private String nombreItem;
    private String descripcion;
    private Double precioUnitario;

    public ItemVenta() {
    }

    public ItemVenta( String nombreItem, String descripcion, Double precioUnitario) {
        this.id = java.util.UUID.randomUUID().toString().toUpperCase().substring(0,6);;
        this.nombreItem = nombreItem;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id='" + id + '\'' +
                ", nombreItem='" + nombreItem + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
