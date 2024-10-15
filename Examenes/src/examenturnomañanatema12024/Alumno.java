/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenturnomañanatema12024;

/**
 *
 * @author juanazabaleta
 */
public class Alumno {
    private int DNI;
    private String nombre;
    private String lugarResidencia;
    
    public Alumno(int unDNI, String unNombre, String unLugarResidencia){
        this.DNI = unDNI;
        this.nombre = unNombre;
        this.lugarResidencia = unLugarResidencia;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }
    
    public String toString(){
        String aux = "";
        aux= "DNI: " + this.DNI + ". Nombre: "+ this.nombre + ". Lugar de residencia: " + this.lugarResidencia;
        return aux;
    }
    
    
    
}
