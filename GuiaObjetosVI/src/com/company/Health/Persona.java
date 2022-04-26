package com.company.Health;

public class Persona {
    private long dni;
    private String nombre="";
    private int edad=0;
    private char sexo='H';
    private double peso=0.0;//kg
    private double altura=0.0;//metros

    public Persona() {
        this.dni = this.generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.dni = this.generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(int dni, String nombre, int edad, char sexo, double peso, double altura) {
        this.dni = this.generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public long getDni() {
        return dni;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC(){
        double imc=this.peso/Math.pow(this.altura,2.0);
        if(imc<20){
            return -1;
        }else if(imc>20 && imc<=25){
            return 0;
        }else{
            return 1;
        }

    }
    public boolean esmayorDeEdad(){
        boolean age;
        if(this.edad>17) {
            return true;
        }else{
            return false;
        }
    }
    public char comprobarSexo(char sexo){
        if(sexo!=this.sexo){
            return 'H';
        }
        return sexo;
    }
    public long generaDNI(){
        return Math.round(Math.random()*100000000);
    }
    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
