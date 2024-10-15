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
public class Programador {
    private String nombre;
    private int DNI;
    private double sueldoBasico;
    private int lineasCodigoHR;
    private String lenguajePref;

    public Programador(String nombre, int DNI, double sueldoBasico, int lineasCodigoHR, String lenguajePref) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoBasico = sueldoBasico;
        this.lineasCodigoHR = lineasCodigoHR;
        this.lenguajePref = lenguajePref;
    }
    
    public double calcularSueldo(){
        double aux= this.sueldoBasico;
        if (this.lineasCodigoHR > 200){
            aux+= 50000;
        }
        return aux;
    }
    
    public void aumentarSueldo(double aumento){
        sueldoBasico += aumento;
    }

    @Override
    public String toString() {
        String aux= nombre + ", " + DNI + ", " + lenguajePref + ", " + this.calcularSueldo()+ "\n";
        return aux;
    }
      
}
