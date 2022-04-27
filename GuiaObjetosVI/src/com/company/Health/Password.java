package com.company.Health;

public class Password {
    private int longitud=8;
    private String contrasenia;

    public Password() {
    }

    public Password(int longitud) {
        this.contrasenia=generarPassword(this.longitud);
        this.longitud = longitud;
    }
    public String generarPassword(int longitud){
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<longitud;i++){
         sb.append((char)((Math.round(Math.random()*74)+48)));
        }
        return sb.toString();
    }
    private int contarMayusculas(String palabra){
        int cont=0;
        for(int i=0;i<palabra.length();i++){
            if(Character.isUpperCase(palabra.charAt(i))){
                cont++;
            }
        }
        return cont;
    }
    private int contarMinusculas(String palabra){
        int cont=0;
        for(int i=0;i<palabra.length();i++){
            if(Character.isLowerCase(palabra.charAt(i))){
                cont++;
            }
        }
        return cont;
    }
    private int contarNumeros(String palabra){
        int cont=0;
        for(int i=0;i<palabra.length();i++){
            if(Character.isDigit(palabra.charAt(i))){
                cont++;
            }
        }
        return cont;
    }

    public boolean esFuerte(){
        int may,min,num;
        may=contarMayusculas(this.contrasenia);
        min=contarMinusculas(this.contrasenia);
        num=contarNumeros(this.contrasenia);
        System.out.println(may+"-"+min+" -"+num);
        if(may>2 && min>1 && num>5){
            return true;
        }
        return false;

    }
}
