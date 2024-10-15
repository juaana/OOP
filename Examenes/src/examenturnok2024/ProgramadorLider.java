/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenturnoK2024;

/**
 *
 * @author juanazabaleta
 */
public class ProgramadorLider extends Programador {
    private int antiguedad;
    private int proyectosDirigidos;

    public ProgramadorLider(int antiguedad, int proyectosDirigidos, String nombre, int DNI, double sueldoBasico, int lineasCodigoHR, String lenguajePref) {
        super(nombre, DNI, sueldoBasico, lineasCodigoHR, lenguajePref);
        this.antiguedad = antiguedad;
        this.proyectosDirigidos = proyectosDirigidos;
    }
    
    @Override
    public double calcularSueldo(){
        double aux= super.calcularSueldo();
        aux+= (this.antiguedad * 10000);
        aux+= (this.proyectosDirigidos * 20000);
        
        return aux;
    }  
}
