/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

/**
 *
 * @author juanazabaleta
 */
public abstract class Recital {
    private String nombreBanda;
    private String temas [];
    private int cantTemas;
    private int dimLCantTemas;

    public Recital(String nombreBanda, int cantTemas) {
        this.nombreBanda = nombreBanda;
        this.cantTemas = cantTemas;
        this.temas = new String [this.cantTemas];
        this.dimLCantTemas = 0;
    }
    
    public void agregarTema(String unTema){
       if (dimLCantTemas < cantTemas){
           temas[dimLCantTemas] = unTema;
           dimLCantTemas++;
       }
    }
    
    public String actuar(){
        String aux= " ";
        for (int i = 0; i < dimLCantTemas; i++) {
            aux += "Y ahora tocaremos " + temas[i] + "\n";
        }
        return aux ;
    }
    
    public abstract int calcularCosto();
    
}
