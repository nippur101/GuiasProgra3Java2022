package com.company.Health;

import java.util.Objects;

public class Password {
    private int longitud = 8;
    private String contrasenia;

    public Password() {
        contrasenia=generarPassword(longitud);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasenia=generarPassword(longitud);
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String generarPassword(int longitud) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            sb.append((char) ((Math.round(Math.random() * 74) + 48)));
        }
        return sb.toString();
    }

    private int contarMayusculas() {
        int cont = 0;
        for (int i = 0; i < this.contrasenia.length(); i++) {
            if (Character.isUpperCase(this.contrasenia.charAt(i))) {
                cont++;
            }
        }
        return cont;
    }

    private int contarMinusculas() {
        int cont = 0;

        for (int i = 0; i < this.contrasenia.length(); i++) {
            if (Character.isLowerCase(this.contrasenia.charAt(i))) {
                cont++;
            }
        }
        return cont;
    }

    private int contarNumeros() {
        int cont = 0;

        for (int i = 0; i <this.contrasenia.length(); i++) {
            if (Character.isDigit(this.contrasenia.charAt(i))) {
                cont++;
            }
        }
        return cont;
    }

    public boolean esFuerte() {
        int may, min, num;
        may = contarMayusculas();
        min = contarMinusculas();
        num = contarNumeros();

        if (may > 2 && min > 1 && num > 5) {
            return true;
        }
        return false;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return longitud == password.longitud && contrasenia.equals(password.contrasenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitud, contrasenia);
    }
}
