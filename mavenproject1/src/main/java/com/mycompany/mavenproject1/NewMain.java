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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    profesor profe=new profesor("queiri", "chalate ", "11/03/2000", "f", 18 , " Ing ","Programador ");
        System.out.println(profe.toString());
    
     estudiante estu =new estudiante("Fati", "Aguilares", "12/5/2001", "f", 18, 1800, "Ing. Sistemas y Computacion");
        System.out.println(estu.toString());
    }
    
}
