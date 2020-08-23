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
public class estudiante extends persona {
     private int Matricula;
    private String Carrera;

  

   public estudiante(String Nombre,String Direccion,String Fecha, String Genero, int Edad,int Matricula,String Carrera){
 this.Nombre=Nombre;
 this.direccion=Direccion;
 this.fechaNc=Fecha;
 this.Genero=Genero;
 this.Edad=Edad;
 this.Matricula=Matricula;
 this.Carrera=Carrera;
   
   
   }

    @Override
    public String toString() {
        return "classEstudiante{" + "Nombre=" + Nombre + ", direccion=" + direccion + ", fechaNc=" + fechaNc + ", Genero=" + Genero + ", Edad=" + Edad + ", Matricula=" + Matricula + ", Carrera=" + Carrera + '}';
    }
    
    
}
    

