package com.company.CuentaBancaria;

import java.util.ArrayList;

//Cuenta que también posee un identificador,
//un balance y un Cliente que es el dueño de la cuenta.  Algo a tener en
//cuenta es que el método extraer no puede extraer dinero si el balance total no lo
//permite, si esto sucede se debe imprimir un mensaje por pantalla que indique que
//la cuenta no posee saldo suficiente.
public class Cuenta {
    private String id;
    private Double balance;
    private ClienteBanco clienteBanco;
    private ArrayList<String> extracciones=new ArrayList<>();
    private ArrayList<String> depositos=new ArrayList<>();
    private int contadorExtracciones=0;
    private int contadorDepositos=0;

    public Cuenta() {
    }

    public Cuenta( Double balance, ClienteBanco clienteBanco) {
        this.id = java.util.UUID.randomUUID().toString().toUpperCase().substring(0,6);;
        this.balance = balance;
        this.clienteBanco = clienteBanco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public ClienteBanco getCliente() {
        return clienteBanco;
    }

    public void setCliente(ClienteBanco clienteBanco) {
        this.clienteBanco = clienteBanco;
    }
//La Cuenta debe exponer los
//métodos depositar y extraer que modifican el balance de la misma.
    public void depositar(Double deposito){
        depsotosVarios(deposito);
        this.balance=this.balance+deposito;
    }
    //d. Es necesario agregar una variante de Cuenta que permita un saldo deudor,
    //de máximo 2000 pesos. Esto significa que la cuenta puede aceptar un
    //balance negativo con un máximo de - 2000. Realice los cambios y pruebas
    //necesarias.
    public void extraer(Double extraccion){
        if((this.balance+2000)>extraccion) {
            extraccionesVarias(extraccion);
            this.balance = this.balance - extraccion;
        }else {
            System.out.println("No posee saldo suciente en la cuenta\n");
        }
    }
    //e. Analice cómo implementaría con las herramientas conocidas hasta el momento, llevar un registro de como máximo 10 operaciones de depósito y
    //extracción que se realizaron en la cuenta. En donde se almacene en memoria de alguna forma la siguiente cadena de texto:
    //i. Depósito: "El {NombreCliente}, depositó {MontoDepositado}"
    //ii. Extracción: "El {NombreCliente}, retiró {MontoRetirado}"
    public void extraccionesVarias(double extr ){
        contadorExtracciones++;
        extracciones.add(Double.toString(extr));
    }
    public void depsotosVarios( double dep){
        depositos.add(Double.toString(dep));
        contadorDepositos++;
    }

    public void mostrar10Depositos(){
        int inicio=contadorDepositos;
        int fin=contadorDepositos-10;
        while (inicio>fin){
            inicio--;
            System.out.println("Cliente: "+clienteBanco.getNombre()+" Depositó: "+depositos.get(inicio));
        }
    }
    public void mostrar10Extracciones(){
        int inicio=contadorExtracciones;
        int fin=contadorExtracciones-10;
        while (inicio>fin){
            inicio--;
            System.out.println("Cliente: "+clienteBanco.getNombre()+" Retiró: "+extracciones.get(inicio));
        }
    }
    @Override
    public String toString() {
        return "Cuenta{" +
                "id='" + id + '\'' +
                ", balance=" + balance +clienteBanco.toString() +
                '}';
    }
}
