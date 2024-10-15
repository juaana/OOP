/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenTurnoP2024;

/**
 *
 * @author juanazabaleta
 */
public abstract class Componente {
    private String nombre;
    private double costo;

    public Componente(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    
    public abstract double costoFinal();

    public double getCosto() {
        return costo;
    }
    
    public String toString(){
        String aux=  this.nombre + " - Costo final: " + this.costoFinal();
        return aux;
    }
    
}
