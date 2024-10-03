/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author juanazabaleta
 */
public class Auto {
    private String nombreDueño;
    private String patente;
    
    
    public Auto(String unNombreDueño, String unaPatente){
        this.nombreDueño = unNombreDueño;
        this.patente = unaPatente;
    }            

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return "\nNombre del dueño: "+ nombreDueño + "\nPatente:" + patente;
    }
    
    
    
}
