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
}
