package com.company;

import com.company.CuentaBancaria.ClienteBanco;
import com.company.CuentaBancaria.Cuenta;
import com.company.Libreria.Autor;
import com.company.Libreria.Libro;
import com.company.LocalDeVentas.Cliente;
import com.company.LocalDeVentas.Factura;
import com.company.LocalDeVentas.ItemVenta;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Ejer02();
    }
    public static void Ejer01(){
        //a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        Autor a1=new Autor("Joshua","Bloch","joshua@email.com",'M');
        Autor a2=new Autor("Joyanes","Aguilar","aguilar@email.com",'M');
        //b. Imprima por pantalla al autor previamente instanciado.
        System.out.println(a1);
        //c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450 pesos con una cantidad de 150 copias.
        ArrayList<Autor> a=new ArrayList<>();
        a.add(a1);
        a.add(a2);
        Libro l1=new Libro("Effective Java",a,150,450.0);

        //d. Imprima por pantalla el libro instanciado.
        System.out.println(l1);
        //e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        //cantidad en 50 copias.
        l1.setPrecio(500.0);
        l1.aumentarCopias(50);
        System.out.println(l1);
        //f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        //Libro “Effective Java”.
        System.out.println(l1.getAutor());
        //g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        //siguiente mensaje:
        //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        l1.imprimirLibro();
        //h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
        //cambios necesarios en el método del punto g, para imprimir un nuevo
        //mensaje que liste los autores que contribuyeron a ese libro.
    }
    public static void Ejer02(){
        //2. Nos contratan para hacer un programa que lleve el control de las ventas de un
        //local.
        // a. Investigue la clase UUID y sus métodos estáticos para la generación de los
        //ids. Investigue la clase LocalDate y sus métodos estáticos para la generación
        //de la fecha.
        //b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla. Para esto
        //haga uso de un método que facilite la impresión del mismo.
        //Cliente[id=?, nombre=?, email=?, descuento=?]
        ItemVenta item1=new ItemVenta("Shampoo","Elvive",260.0);
        ItemVenta item2=new ItemVenta("Crema Enjuague","Elvive",290.0);
        ItemVenta item3=new ItemVenta("Jabon","Rexona",60.0);
        ItemVenta item4=new ItemVenta("Lavandina","Ayudin",150.0);
        ItemVenta item5=new ItemVenta("Pasta dental","Colgate",120.0);
        ArrayList<ItemVenta> itemsC1=new ArrayList<>();
        itemsC1.add(item1);
        itemsC1.add(item1);
        itemsC1.add(item2);
        itemsC1.add(item2);
        itemsC1.add(item3);
        itemsC1.add(item4);

        ArrayList<ItemVenta> itemsC2=new ArrayList<>();
        itemsC2.add(item1);
        itemsC2.add(item2);
        itemsC2.add(item3);
        itemsC2.add(item5);
        itemsC2.add(item5);
        itemsC2.add(item5);

        Cliente client1=new Cliente("Juan Perez","juan@gmail.com",10.0);
        Cliente client2=new Cliente("Ludmila Lopez","ludmi@gmail.com",15.0);
        System.out.println(client1);
        System.out.println(client2);



        //c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
        //Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
        //monto total luego de aplicarle el descuento.
        Factura factura1=new Factura(itemsC1,client1);
        Factura factura2=new Factura(itemsC2,client2);


        //d. Cree un método que facilite la impresión del objeto de tipo Factura y que
        //siga el siguiente formato.
        //Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,email=?, descuento=?]]
        System.out.println(factura2);
        //Considere las modificaciones necesarias en el tipo Factura
        //para que el mismo pueda almacenar múltiples Ítems de venta y a su vez
        //calcular los montos totales con y sin el descuento aplicado.

    }
    public static void Ejer03(){
        //3. Necesitamos crear un programa para manejar los datos de una Cuenta bancaria de
        //un Cliente
        //a. Crear un Cliente e imprimirlo en pantalla.

        ClienteBanco client1=new ClienteBanco("Juan Perez",'M');
        //b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de
        //10000.
        Cuenta account1=new Cuenta(10000.0,client1);

        //c. Realizar operaciones de depósito y extracción para probar esa
        //funcionalidad.
        System.out.println(account1);
        account1.depositar(400.0);
        account1.depositar(600.0);
        account1.depositar(300.0);
        account1.depositar(200.0);
        account1.depositar(100.0);
        account1.depositar(900.0);
        account1.depositar(600.0);
        account1.depositar(300.0);
        account1.depositar(300.0);
        account1.depositar(200.0);
        account1.depositar(100.0);
        account1.mostrar10Depositos();
        account1.extraer(123.0);
        account1.extraer(33.0);
        account1.extraer(423.0);
        account1.extraer(163.0);
        account1.extraer(143.0);
        account1.extraer(877.0);
        account1.extraer(564.0);
        account1.extraer(344.0);
        account1.extraer(555.0);
        account1.extraer(666.0);
        account1.extraer(888.0);
        account1.extraer(111.0);
        account1.mostrar10Extracciones();

        //System.out.println(account1);
        //account1.extraer(11000.0);
        //System.out.println(account1);



    }
}