package com.company.Ejercicio1;

public final class Empleado extends Persona{
    private long numeroEmpleado;

    public Empleado() {
        this.numeroEmpleado = Math.round(Math.random()*1000000);
    }

    public Empleado(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.numeroEmpleado = Math.round(Math.random()*1000000);
    }

    @Override
    public String toString() {
        return "Empleado{" +super.toString()+
                "numeroEmpleado=" + numeroEmpleado +
                '}';
    }
}
