package com.company.LocalDeVentas;
// Para esto es necesario modelar la clase Cliente, que posee un atributo id
//como identificador del cliente, el mismo debe ser un valor compuesto por letras y
//números aleatorios que se generan automáticamente al crear un Cliente. El Cliente
// también posee un nombre, un email y un porcentaje de descuento.

public class Cliente {
    private String id;
    private String nombre;
    private String eMail;
    private Double porcDescuento;

    public Cliente() {
    }

    public Cliente( String nombre, String eMail, Double porcDescuento) {
        this.id = java.util.UUID.randomUUID().toString().toUpperCase().substring(0,6);;//.replace("-", "");
        this.nombre = nombre;
        this.eMail = eMail;
        this.porcDescuento = porcDescuento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Double getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(Double porcDescuento) {
        this.porcDescuento = porcDescuento;
    }

    @Override
    public String toString() {
        return "Cliente[" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", eMail='" + eMail + '\'' +
                ", porcDescuento=" + porcDescuento +
                ']';
    }
}
