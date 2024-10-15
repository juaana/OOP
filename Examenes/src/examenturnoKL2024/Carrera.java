/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenturnoKL2024;

/**
 *
 * @author juanazabaleta
 */
public class Carrera {
    private String nombre;
    private String facultad;
    private int añoCreacion;
    
     public Carrera(String nombre, String facultad, int añoCreacion){
         this.nombre = nombre;
         this.facultad = facultad;
         this.añoCreacion= añoCreacion;
     }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    @Override
    public String toString() {
        return "Carrera: " + nombre + ", facultad: " + facultad + ", año de creación: " + añoCreacion + ".\n";
    }
    
     
     
}
