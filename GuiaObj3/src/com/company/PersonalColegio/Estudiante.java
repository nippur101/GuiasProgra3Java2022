package com.company.PersonalColegio;
//Por otro lado tenemos al Estudiante que posee las características de
//Persona y las de un estudiante, que en este caso son, año de ingreso, cuota
//mensual y carrera.
public class Estudiante extends Persona{
    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;
    private static int contEstuSta=0;
    private int contadorEstudiante;

    public Estudiante() {
        this.contadorEstudiante= ++contEstuSta;
    }

    public Estudiante(int dni, String nombre, String apellido, String email, String direccion, int anioIngreso, double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
        this.contadorEstudiante= ++contEstuSta;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getContadorEstudiante() {
        return contadorEstudiante;
    }

    public void setContadorEstudiante(int contadorEstudiante) {
        this.contadorEstudiante = contadorEstudiante;
    }

    public static int getContEstuSta() {
        return contEstuSta;
    }

    public static void setContEstuSta(int contEstuSta) {
        Estudiante.contEstuSta = contEstuSta;
    }

    @Override
    public String toString() {
        return "Estudiante{" +super.toString()+
                ", anioIngreso=" + anioIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
