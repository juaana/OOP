/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author juanazabaleta
 */
public class Estacion  {
    private String nombre;
    private double latitud;
    private double longitud; 
    
    
    public Estacion(String unNombre, double unaLatitud, double unaLongitud){
        this.nombre = unNombre;
        this.latitud = unaLatitud;
        this.longitud = unaLongitud;
    }

    
    public String toString(){
        String aux;
        aux = "Estación "+ this.nombre + ". Latitud: " + this.latitud + ". Longitud: " + this.longitud + "\n";
        return aux;
    }
    
    
    
}
