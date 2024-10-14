/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author juanazabaleta
 */
public class Corista extends Persona {
    private int tonoFundamental;

    public Corista(int tonoFundamental, String nombre, int DNI, int edad) {
        super(nombre, DNI, edad);
        this.tonoFundamental = tonoFundamental;
    }

    public int getTonoFundamental() {
        return tonoFundamental;
    }
    @Override
    public String toString() {
        return "\nCorista: \n"+super.toString() + ", tono fundamental: " + tonoFundamental;
    }  
    
    
    
}
