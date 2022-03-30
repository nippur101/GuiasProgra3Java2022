package com.company;

import com.sun.jdi.IntegerValue;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
	//ej1();
	//ej2();
	//ej3();
       // ej4();
    ej11();

    }
    public static void ej1(){
        // 1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una
        //variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
        //A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
        //diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
        //variable C.
        int N;
        double A;
        char C;
        N=2;
        A=2.5;
        C='j';
        int c=C;
        System.out.println(A+N);
        System.out.println(A-N);
        System.out.println(c);
    }
    public static void ej2(){
        //2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos
        //variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar
        //por pantalla una serie de operaciones entre ellas.
        int X;
        int Y;
        double N;
        double M;
        X=2;
        Y=3;
        N=2.56;
        M=3.54;
        System.out.println(X+Y);
        System.out.println(N+M);
        System.out.println(M*Y);
        System.out.println(N/X);
    }
    public static void ej3(){
        //3. Programa Java que declare una variable entera N, asignarle un valor. A continuación
        //escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su
        //valor a 3, duplicar su valor.
        int N;
        N=3;
        System.out.println(N);
        N=N+77;
        System.out.println(N);
        N=N-3;
        System.out.println(N);
        N=N*2;
        System.out.println(N);
    }
    public static void ej4(){
        //4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
        //cada una. A continuación realiza las instrucciones necesarias para que: B tome el
        //valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
        int A;
        int B;
        int C;
        int D;
        A=2;
        B=5;
        C=9;
        D=13;
        System.out.println(A+"-"+B+"-"+C+"-"+D);
        B=C;
        System.out.println(A+"-"+B+"-"+C+"-"+D);
        C=A;
        System.out.println(A+"-"+B+"-"+C+"-"+D);
        A=D;
        System.out.println(A+"-"+B+"-"+C+"-"+D);
        D=B;
        System.out.println(A+"-"+B+"-"+C+"-"+D);

    }
    public static void ej5(){
        //5. Programa Java que declare una variable A de tipo entero, asignarle un valor. A
        //continuación mostrar un mensaje indicando si A es par o impar.
        int A;
        A=2;
        if(A%2==0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
    }

    public static void ej6(){
        //6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A
        //continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.
        int B=3;
        if(B>0){
            System.out.println("es positivo");
        }else{
            System.out.println("es negativo");
        }

    }
    public static void ej7(){
        //7. Programa Java que declare una variable C de tipo entero y asignarle un valor. A
        //continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
        //si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
        //100.
        int C=34;

    }
    public static void ej8(){
        //8. Programa Java que lea un nombre y muestre por pantalla:
        //“Buenos días, {NOMBRE}”.

        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un nombre\n");
        String a=entrada.nextLine();
        System.out.println("Buenos dias, "+a);

    }
    public static void ej9(){
        //9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de
        //ese número y lo muestre por pantalla.
        int a;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un Numero \n");
        a=entrada.nextInt();
        System.out.println("El doble es: "+2*a+"\n");
        System.out.println("El triple es: "+3*a+"\n");

    }
    public static void ej10(){
        //10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
        //centígrados.
        double a, g;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una tempertura en grados Farenheit \n");
        a=entrada.nextDouble();
        g=5.0/9.0*(a-32.0);
        System.out.println("La temperatura en °C es : "+g);

    }
    public static void ej11(){
        //11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y
        //muestra por pantalla la longitud y el área de la circunferencia.
        double r, res;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo \n");
        r=entrada.nextDouble();
        System.out.println("La longitud de la circunsferencia es "+2*PI*r+" y eel area "+PI*r*r);


    }
    public static void ej12(){
        //12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
        double v,vf;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una velocidad en km/h \n");
        v=entrada.nextDouble();
        System.out.println("La velocidad en m/s es "+v*1000/3600);
    }

    public static void ej16(){
        //16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.
        int numero;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Un numero de 3 cifras \n");
        numero=entrada.nextInt();
        if(numero>999 || numero<100){
            System.out.println("El numero ingresado es incorrecto");
        }
        String num=Integer.toString(numero);
        for(int i=0;i<num.length();i++){
            System.out.println(num.charAt(i));// muestra caracter en la posicion i
        }
    }
    public static void ej17(){
        //17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
        //posiciones impares.
        int N;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Un numero de 5 cifras \n");
        N=entrada.nextInt();
        if(N>99999 || N<10000){
            System.out.println("El numero ingresado es incorrecto");
        }
        String num=Integer.toString(N);
        for(int i=0;i<num.length();i++){
            if(i%2!=0) {
                System.out.println(num.charAt(i));// muestra caracter en la posicion i
            }
        }
    }
    public static void ej18(){
        //18.Programa que lea tres números enteros H, M, S que contienen hora, minutos y
        //segundos respectivamente, y comprueba si la hora que indican es una hora válida.
        int H,M,S;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una hora \n");
        H=entrada.nextInt();
        System.out.println("Ingrese una minutos \n");
        M=entrada.nextInt();
        System.out.println("Ingrese una segundos \n");
        S=entrada.nextInt();
        if((0<=H && H<24) && (0<=M && M<60) && (0<=S && S<60)){
            System.out.println("La hora ingresada "+H+":"+M+":"+S+" es valida\n");
        }else{
            System.out.println("La hora ingresada "+H+":"+M+":"+S+" NO es valida\n");
        }


    }
}
