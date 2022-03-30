package com.company;
//2. Modele el objeto Empleado que posee las siguientes características, dni, nombre,
//apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
//anual. A su vez se requiere otro método que permita aumentar el salario
//dependiendo del porcentaje que se le pase por parámetro. Considere crear un
//método que facilite imprimir por pantalla las características del objeto de la
//siguiente forma:
public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado() {
    }

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioAnual(){
        return this.salario*12;
    }

    public void aumentoSalario(double porcentaje){
        this.salario=this.salario*(1.0+porcentaje/100.0);
    }

//Empleado[dni=?, nombre=?, apellido=?, salario=?]
    @Override
    public String toString() {
        return "Empleado[" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                ']';
    }
}
