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
public class CoroHileras extends Coro {
    private Corista coristas[][];
    private int dimLF;
    private int dimLC;
    private int dimF;
    
    public CoroHileras(Director director, int dimF) {
        super(director);
        this.dimF = dimF;
        this.coristas = new Corista[dimF][dimF];
        this.dimLF = 0;
        this.dimLC = 0;
        
    }
    @Override
    public void agregarCorista(Corista corista) {
        if (dimLF < this.dimF) {
            if (dimLC >= this.dimF) {
                dimLC = 0;  // Reiniciar el contador de columnas
                dimLF++;    // Avanzar a la siguiente fila
        }
        
        if (dimLF < this.dimF) { 
            coristas[dimLF][dimLC] = corista;
            dimLC++; 
        }
     }
    }
    
    @Override 
    public boolean estaLleno() {
        return (dimLF * dimF + dimLC) == (dimF * dimF);
    }

    @Override 
    public boolean estaOrdenado(){
        boolean aux = true;
        int actual=0;
        for (int i = 0; i < dimLF && aux == true; i++) {
            
            for (int j = 0; j < dimLC && aux == true; j++) {
                if (i == 0 && j>=1){
                    if (coristas[i][j-1].getTonoFundamental() < coristas[i][j].getTonoFundamental()){
                        aux = false;
                    }
                }
                if (j == 0){
                    actual = coristas[i][j].getTonoFundamental();
                }
                else{
                    if(actual != coristas[i][j].getTonoFundamental()){
                        aux= false;
                    }
                }
            }
            
        }
        return aux;
    }
    
    @Override
    public String toString() {
    String aux = "";
    for (int i = 0; i < this.dimF; i++) {
        
        for (int j = 0; j < this.dimF; j++) {
            if (coristas[i][j] != null) {
                aux += coristas[i][j].toString() + "\n";
            }
        }
    }
    return super.toString() + aux;
}

    
    
    
    
}
