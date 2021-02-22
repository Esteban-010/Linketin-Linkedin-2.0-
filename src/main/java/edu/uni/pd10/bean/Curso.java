package edu.uni.pd10.bean;

public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean premium;
    private int categoria;

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public boolean getPremium(){
        return premium;
    }
    public int getCategoria() {
        return categoria;
    }
}

