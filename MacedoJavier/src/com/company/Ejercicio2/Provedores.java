package com.company.Ejercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Provedores extends PersonasLocal{
    private LocalDateTime horarioLlegada;

    public Provedores() {
    }

    public Provedores(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public LocalDateTime getHorarioLlegada() {
        return horarioLlegada;
    }

    @Override
    public String toString() {
        return "Provedores{" +super.toString()+
                "horarioLlegada=" + horarioLlegada +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provedores that = (Provedores) o;
        return Objects.equals(horarioLlegada, that.horarioLlegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horarioLlegada);
    }
}
