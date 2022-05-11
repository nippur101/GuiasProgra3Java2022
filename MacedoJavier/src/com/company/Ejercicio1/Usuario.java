package com.company.Ejercicio1;

public final class Usuario extends Persona{
    private String eMail;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, String eMail) {
        super(nombre, fechaNacimiento);
        this.eMail = eMail;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Usuario{" +super.toString()+
                "eMail='" + eMail + '\'' +
                '}';
    }
}
