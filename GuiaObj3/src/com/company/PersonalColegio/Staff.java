package com.company.PersonalColegio;
//Staff que también es una Persona pero
//con características propias de alguien que trabaja para una institución, por ejemplo
//salario y turno, este puede ser mañana o noche.
public class Staff extends Persona{
    private Double salario;
    private String turno;
    private static int contStaffStat=0;
    private int contadorStaff;

    public Staff() {
        this.contadorStaff=++contStaffStat;
    }

    public Staff(int dni, String nombre, String apellido, String email, String direccion, Double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
        this.contadorStaff=++contStaffStat;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public double salarioAnual(){
        return this.salario*12;
    }

    public int getContadorStaff() {
        return contadorStaff;
    }

    public void setContadorStaff(int contadorStaff) {
        this.contadorStaff = contadorStaff;
    }

    public static int getContStaffStat() {
        return contStaffStat;
    }

    public static void setContStaffStat(int contStaffStat) {
        Staff.contStaffStat = contStaffStat;
    }

    @Override
    public String toString() {
        return "Staff{" +super.toString()+
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
