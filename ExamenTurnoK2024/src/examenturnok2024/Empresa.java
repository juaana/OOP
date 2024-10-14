/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenturnok2024;

/**
 *
 * @author juanazabaleta
 */
public class Empresa {
    private String nombre;
    private ProgramadorLider programadorlider;
    private Programador programadores[];
    private int cantProgMax;
    private int cantProgActual;

    public Empresa(String nombre, ProgramadorLider programadorlider, int cantProgMax) {
        this.nombre = nombre;
        this.programadorlider = programadorlider;
        this.cantProgMax = cantProgMax;
        this.programadores = new Programador [cantProgMax];
        this.cantProgActual = 0;
    }
    
    public void agregarProgramador(Programador programador){
        if (cantProgActual < cantProgMax){
            programadores[cantProgActual] = programador;
            cantProgActual++;
        }
    }
    
    public double calcularMontoTotalSueldos(){
        double aux = programadorlider.calcularSueldo();
        for (int i = 0; i < cantProgActual; i++) {
            aux += programadores[i].calcularSueldo();
        }
        
        return aux;
    }
    
    public void aumentarSueldosBasicos(double aumento){
        programadorlider.aumentarSueldo(aumento);
        for (int i = 0; i < cantProgActual; i++) {
            programadores[i].aumentarSueldo(aumento);     
        }
    }
    
    public String toString(){
        String aux= "Empresa: " + this.nombre +"\n";
        aux+= programadorlider.toString();
        for (int i = 0; i < cantProgActual ; i++) {
            aux+= "Programador: " + (i+1) +" "+ programadores[i].toString();
        }
        aux += "Monto total en sueldos a abonar por la empresa " + this.calcularMontoTotalSueldos();
        return aux;
    }
    
    
    
}
