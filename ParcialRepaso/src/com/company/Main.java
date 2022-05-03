package com.company;

import com.company.POficina.*;
import com.sun.javafx.embed.EmbeddedSceneInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//region CARGA DE DATOS
        Escritorios desk1=new Escritorios(5,"King",54000.0,1.5,1.6);
        Escritorios desk2=new Escritorios(4,"Queen",45000.0,1.4,1.5);
        Impresoras print1=new Impresoras(6,"Epson2000",25600.0,"Epson",54);
        Impresoras print2=new Impresoras(3,"HP1000",22600.0,"HP",44);
        Notebooks notebook1=new Notebooks(4,"BanghoOffice",125400.0,"Bangho",8);
        Notebooks notebook2=new Notebooks(2,"HP4000",150400.0,"HP",16);
        Silla chear1=new Silla(5,"gamer",45000.0,true);
        Silla chear2=new Silla(5,"Office",35000.0,true);
        List<ProductosOficina> stock=new ArrayList<>();
        stock.add(desk1);
        stock.add(desk2);
        stock.add(print1);
        stock.add(print2);
        stock.add(notebook1);
        stock.add(notebook2);
        stock.add(chear1);
        stock.add(chear2);
//endregion
        //mostrar(stock);
        //IngresoDescuento(print1,chear1);

        mostrarPrecioActualizado(stock);

    }
    public static void mostrar(List<ProductosOficina> stock){
        for(ProductosOficina productos:stock){
            if(productos instanceof Escritorios) {
                System.out.println("Escritorio: "+productos.toString());
            }
            if(productos instanceof Impresoras) {
                System.out.println("Impresoras: "+productos.toString());
            }
            if(productos instanceof Notebooks) {
                System.out.println("Notebook: "+productos.toString());
            }
            if(productos instanceof Silla) {
                System.out.println("Sillas: "+productos.toString());
            }
        }
    }
    public static void IngresoDescuento(Impresoras print,Silla chear){
        System.out.println("======================================");
        System.out.println(print.toString());
        System.out.println("Precio con descuento: "+print.precioConDescuento(30));
        System.out.println("======================================");
        System.out.println(chear.toString());
        System.out.println("Precio con descuento: "+chear.precioConDescuento(35));

    }
    public static void mostrarPrecioActualizado(List<ProductosOficina> stock){
        System.out.println("====================================================================");
        mostrar(stock);
        System.out.println("======================================");
        for(ProductosOficina lista:stock){
            System.out.println(lista.toString());
            System.out.println("Precio Actualizado: "+lista.actualizarPrecios());
        }
    }
}
