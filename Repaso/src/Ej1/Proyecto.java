/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author juanazabaleta
 */
public class Proyecto {
    private int maxInv = 50;
    private String nombreProyecto;
    private int codigo;
    private String nombreDirector;
    private Investigador [] investigadores;

    public Proyecto(String nombreProyecto, int codigo, String nombreDirector) {
        this.nombreProyecto = nombreProyecto;
        this.codigo = codigo;
        this.nombreDirector = nombreDirector;
        investigadores= new Investigador[maxInv];
    }

    public void agregarInvestigadorAlProyecto(Investigador unInvestigador){
        int i=0;
        while (i < maxInv && investigadores[i]!= null){
            i++;
        }
        
        if (investigadores[i] == null ){
        investigadores[i] = unInvestigador;
        }
        
    }
    
    public double dineroTotalOtorgado(){
        int i = 0;
        int j=0;
        double dineroOtorgado= 0;
        while(i < maxInv && investigadores[i] != null ){
            dineroOtorgado += investigadores[i].totalEnSubsidios();
            i++;
        }
        return dineroOtorgado;
    }
    
    
    public void otorgarTodos(String unNombre){
        int i=0;
        while (i<maxInv && !investigadores[i].getNombreCompleto().equals(unNombre)){
            i++;
        }
        if (investigadores[i].getNombreCompleto().equals(unNombre)){
            investigadores[i].otorgarSubsidios();
        }
        
    }
    
    public String toString(){
        String aux;
        int i=0;
        aux= "Nombre del proyecto: " + this.nombreProyecto + ".\nCódigo: "+ this.codigo + ".\nNombre del director: " + this.nombreDirector + ".\nDinero total otorgado del proyecto: $" + this.dineroTotalOtorgado() + "\n-----------\nInvestigadores: ";
        while(i<maxInv && investigadores[i]!= null){
            aux += "\n\n" + investigadores[i].toString();
            i++;
        }
        return aux;
    }
    
    
}
