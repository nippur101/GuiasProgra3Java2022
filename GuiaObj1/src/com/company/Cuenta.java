package com.company;
//4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
//y balance. Considere los getters, setters y constructores necesarios. Tenga en
//cuenta los siguientes métodos.
//a. El método crédito que representa un depósito de dinero en la cuenta. Este
//método debe devolver el balance luego de la operación.
//b. El método débito que representa una sustracción de dinero de la cuenta.
//Este método debe devolver el balance luego de la operación. Si el dinero en
//la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
//pantalla un aviso.
//c. Un método que imprima por pantalla las características del objeto.
public class Cuenta {
    private int id;
    private String nombre;
    private Double balance;

    public Cuenta() {
    }

    public Cuenta(int id, String nombre, Double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public double credito(double deposito){
        return this.balance=this.balance+deposito;
    }

    public double debito( double sustraccion){
        if(sustraccion>this.balance){
            System.out.println("NO hay suficiente dinero en la cuenta\n");
            return this.balance;
        }else {
            return this.balance = this.balance - sustraccion;
        }
    }

    @Override
    public String toString() {
        return "Cuenta[" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                ']';
    }
}
