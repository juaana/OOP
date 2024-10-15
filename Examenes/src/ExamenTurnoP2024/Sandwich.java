/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenTurnoP2024;



public class Sandwich {
    private String nombre;
    private Ingrediente ingredientes[];
    private int dimFIng;
    private int dimLIng;
    private Pan pan;

    public Sandwich(Pan unPan, String nombre, int dimFIng) {
        this.nombre = nombre;
        this.dimFIng = dimFIng;
        this.pan = unPan;
        this.ingredientes = new Ingrediente[dimFIng];
        this.dimLIng=0;
    }
    
    public void agregarIngrediente(Ingrediente ingrediente){
        if(dimLIng < dimFIng ){
            ingredientes[dimLIng] = ingrediente;
            dimLIng++;
        }
    }
    
    public String toString(){
        double costoFinal=0;
        String aux="Sandwich: "+ this.nombre +"\n"+ pan.toString();
        for (int i = 0; i < dimLIng; i++) {
            aux+= "\n"+ingredientes[i].toString();
            costoFinal+= ingredientes[i].costoFinal();
        }
        costoFinal+= pan.costoFinal();
        aux+= "\nCosto final del sandwich: "+ costoFinal;
        return aux;
        
    }
    
}
