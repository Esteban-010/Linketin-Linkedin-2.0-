package edu.uni.pd10.bean;

import java.util.ArrayList;
import java.util.List;

public class Tematica{
    private int id;
    private String nombre;
    private List<Curso> listaCursos= new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public List<Curso> getListaCursos() {
        return listaCursos;
    }

}
