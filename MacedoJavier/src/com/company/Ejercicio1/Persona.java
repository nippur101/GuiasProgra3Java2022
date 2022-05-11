package com.company.Ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

//id, nombre, apellido y fecha
//de nacimiento. Cree
public abstract class Persona {
    private int id;
    private static int idS=0;
    private String nombre;
    private String fechaNacimiento;

    public Persona() {
        this.id = idS++;
    }

    public Persona( String nombre, String fechaNacimiento) {
        this.id = idS++;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id && Objects.equals(nombre, persona.nombre) && Objects.equals(fechaNacimiento, persona.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, fechaNacimiento);
    }
}
