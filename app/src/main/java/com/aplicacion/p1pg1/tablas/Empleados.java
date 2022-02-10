package com.aplicacion.p1pg1.tablas;

import android.content.Intent;

public class Empleados
{
    private Integer id;
    private String nombres;
    private String apellidos;
    private Integer edad;
    private String correo;
    private byte[] foto;


    public Empleados()
    {
        // Constructor Vacio
    }

    public Empleados(Integer id, String nombres, String apellidos, Integer edad, String correo, byte[] foto) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correo = correo;
        this.foto = foto;
    }



    public Integer getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public byte[] getFoto() {
        return foto;
    }
}
