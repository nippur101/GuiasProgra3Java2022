package com.company;

public class Main {

    public static void main(String[] args) {
	obj05();
    }

    public static void obj01(){
        //1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
        //1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
        //debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
        //siguientes pruebas:

        //a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        Rectangulo r=new Rectangulo(2.0,3.0);
        //b. Imprimir por pantalla el alto y ancho.
        System.out.println(r);
        //c. Imprimir por pantalla el área y perímetro.
        System.out.println(r.imprimirAreaYPerimetro());
        //d. Modificar el alto y el ancho de la instancia.
        r.setAlto(8.0);
        r.setAncho(4.0);
        //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
        System.out.println(r.imprimirAreaYPerimetro());
        //f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
        Rectangulo r2=new Rectangulo();
        System.out.println(r2);

    }
    public static void obj02(){
        //2. Modele el objeto Empleado que posee las siguientes características, dni, nombre,
        //apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
        //anual. A su vez se requiere otro método que permita aumentar el salario
        //dependiendo del porcentaje que se le pase por parámetro. Considere crear un
        //método que facilite imprimir por pantalla las características del objeto de la
        //siguiente forma:
        //Empleado[dni=?, nombre=?, apellido=?, salario=?]
        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
        //25000.
        Empleado e1=new Empleado(23456345,"Carlos","Gutierrez",25000);
        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
        //27500.
        Empleado e2=new Empleado(34234123,"Ana","Sanchez",27500);
        //c. Imprima ambos objetos por pantalla
        System.out.println(e1);
        System.out.println(e2);
        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        e1.aumentoSalario(15);
        System.out.println(e1);
        //salario anual del mismo.
        System.out.println("Salario anual: "+e1.salarioAnual());
    }

    public static void obj03(){
        //3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
        //descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
        //total teniendo en cuenta el precio unitario y cantidad. Un método que permita
        //imprimir por pantalla los atributos del objeto de la siguiente forma:
        //ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
        //a. Inicialice el objeto con los atributos necesarios
        Venta v=new Venta(23,"Shampoo",256.0,5);

        //b. Imprima por pantalla el objeto inicializado.
        System.out.println(v);
    }

    public static void obj04(){
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
        //Realice las siguientes operaciones:
        //1. Inicialice una cuenta con un monto inicial de 15000.
        Cuenta c= new Cuenta(34,"Juan Perez",15000.0);
        System.out.println(c);
        //2. Realice una operación de crédito de 2500.
        c.credito(2500.0);
        System.out.println(c);
        //3. Realice una operación de compra de 1500.
        c.debito(1500);
        System.out.println(c);
        //4. Realice una operación de compra de 30000.
        c.debito(30000);
        //5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
        //correcto.
        System.out.println(c);

    }

    public static void obj05(){
        //5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
        //Tenga en cuenta el rango de valores aceptados para cada uno de estos.
        //a. Hora: 0 … 23
        //b. Minuto: 0 … 59
        //c. Segundo: 0 … 59
        //Considere el siguiente comportamiento:
        //1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
        //usando zero a la izquierda ejemplo 13:04:22 .
        //2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
        //3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
        //4. Instanciar el objeto y probar los métodos creados.
        Hora h=new Hora(22,5,16);
        System.out.println(h);
        h.avanceUnSeg();
        h.retrocederUnSeg();
        //
    }

}
