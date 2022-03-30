package com.company.Libreria;

import java.util.ArrayList;

//1. Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
//precio, stock y Autor, este último posee las características de nombre, apellido,
//email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
//único autor. Ejecute las siguientes instrucciones:
public class Libro {
    private String titulo;
    private ArrayList<Autor>  autor;
    private int stock;
    private Double precio;

    public Libro() {
    }

    public Libro(String titulo, ArrayList<Autor> autor, int stock, Double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Autor> getAutor() {
        return autor;
    }

    public void setAutor(ArrayList<Autor> autor) {
        this.autor = autor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void aumentarCopias(int numero){
        this.stock=this.stock+numero;
    }
    public void disminuirCopias(int numero){
        if(this.stock>numero) {
            this.stock = this.stock - numero;
        }else{
            System.out.println("No hay esa cantidad de copias\n");
        }
    }
    //g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
    //siguiente mensaje:
    //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
    public String juntarAutores(){
        String autores="";
        for(Autor a:this.autor){
            autores=a.getNombre()+" "+a.getApellido()+"-"+autores;
        }
        return autores;
    }

    public void imprimirLibro(){


        System.out.println("El libro "+this.titulo+" de "+this.juntarAutores()+".Se vende a "+this.getPrecio()+" pesos.");
    }
    @Override
    public String toString() {
        return "Libro: " +
                "titulo= " + titulo +
                " | autor= " + this.juntarAutores()+
                " | stock= " + stock +
                " | precio= " + precio
              ;
    }
}
