/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author USUARIO
 */
public class profesor extends persona{
     private String Titulo;
    private String Dedicacion;
    
    public profesor (String Nombre,String Direccion,String Fecha, String Genero, int Edad,String Titulo,String Dedicacion){
    
    this.Nombre=Nombre;
    this.direccion=Direccion;
    this.fechaNc=Fecha;
    this.Genero=Genero;
    this.Edad=Edad;
    this.Titulo=Titulo;  
    this.Dedicacion=Dedicacion;
    
    
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDedicacion() {
        return Dedicacion;
    }

    public void setDedicacion(String Dedicacion) {
        this.Dedicacion = Dedicacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNc() {
        return fechaNc;
    }

    public void setFechaNc(String fechaNc) {
        this.fechaNc = fechaNc;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "profesor{" + "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero + ", Edad=" + Edad + ", Titulo=" + Titulo + ", Dedicacion=" + Dedicacion + '}';
    }
    
}
