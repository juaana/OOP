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
public class Director extends Persona{
    private int antiguedad;

    public Director(int antiguedad, String nombre, int DNI, int edad) {
        super(nombre, DNI, edad);
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "\nDirector: \n"+ super.toString() + ", antiguedad: " + antiguedad+"\n";
    }
    
    
}
