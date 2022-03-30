package com.company.VideoStore;
//catálogo de películas, Cada film de su inventario cuenta con un título, una fecha de
//lanzamiento, una duración en minutos, una clasificación de audiencia, las siglas del país de
//origen y una descripción de la misma.
public class Pelicula {
    private String titulo;
    private String genero;
    private String clasificacion;
    private int duracionMin;
    private String fechaLanzamiento;
    private String pais;
    private String descripcion;
    private int nroCopiasDisponibles;
    private int nroVecesAlquilada;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, String clasificacion, int duracionMin, String fechaLanzamiento, String pais, String descripcion, int nroCopiasDisponibles) {
        this.titulo = titulo;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.duracionMin = duracionMin;
        this.fechaLanzamiento = fechaLanzamiento;
        this.pais = pais;
        this.descripcion = descripcion;
        this.nroCopiasDisponibles = nroCopiasDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNroCopiasDisponibles() {
        return nroCopiasDisponibles;
    }

    public void setNroCopiasDisponibles(int nroCopiasDisponibles) {
        this.nroCopiasDisponibles = nroCopiasDisponibles;
    }

    public int getNroVecesAlquilada() {
        return nroVecesAlquilada;
    }

    public void setNroVecesAlquilada(int nroVecesAlquilada) {
        this.nroVecesAlquilada = nroVecesAlquilada;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", duracionMin=" + duracionMin +
                ", fechaLanzamiento='" + fechaLanzamiento + '\'' +
                ", pais='" + pais + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nroCopiasDisponibles=" + nroCopiasDisponibles +
                '}';
    }
}
