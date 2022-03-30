package com.company;
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
public class Hora {
    private int hora=0;
    private int min=0;
    private int seg=0;

    public Hora() {
    }

    public Hora(int hora, int min, int seg) {
        if(hora>=0 && hora<24)
            this.hora = hora;
        if(min>=0 && min<60)
            this.min = min;
        if(seg>=0 && seg<60)
            this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora>=0 && hora<24) {
            this.hora = hora;
        }else{
            System.out.println("Ingrese una hora correcta\n");
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if(min>=0 && min<60) {
            this.min = min;
        }else{
            System.out.println("Ingrese minutos correctos\n");
        }

    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        if(seg>=0 && seg<60) {
            this.seg = seg;
        }else{
            System.out.println("Ingrese segundos correctos\n");
        }

    }
    //2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
    public void avanceUnSeg(){
        this.seg=this.seg+1;
        System.out.println(this);
    }
    //3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.

    public void retrocederUnSeg(){
        this.seg=this.seg-1;
        System.out.println(this);
    }

    //1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
    //usando zero a la izquierda ejemplo 13:04:22 .




    @Override
    public String toString() {
        String h,m,s;
        h=Integer.toString(hora);
        m=Integer.toString(min);
        s=Integer.toString(seg);
        h=String.format("%2s",h).replace(' ','0');
        m=String.format("%2s",m).replace(' ','0');
        s=String.format("%2s",s).replace(' ','0');
       /*
        if(h.length()<2){
            h="0"+h;
        }
        if(m.length()<2){
            m="0"+m;
        }
        if(s.length()<2){
            s="0"+s;
        }

        */
        return "Hora\n" +
                "" + h +
                ":" + m +
                ":" + s ;
    }
}
