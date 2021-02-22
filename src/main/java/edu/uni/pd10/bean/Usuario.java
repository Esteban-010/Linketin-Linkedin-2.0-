package edu.uni.pd10.bean;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String userName;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String contrasenia;
    private List<Tematica> tematicas = new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public void setTematicas(List<Tematica> tematicas) {
        this.tematicas = tematicas;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public int getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public List<Tematica> getTematicas() {
        return tematicas;
    }
    public String getContrasenia() {
        return contrasenia;
    }
}
