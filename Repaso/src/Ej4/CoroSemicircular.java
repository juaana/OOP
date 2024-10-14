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
public class CoroSemicircular extends Coro {
    private Corista coristas[];
    private int dimL;
    private int dimF;

    public CoroSemicircular(Director director, int dimF) {
        super(director);
        this.coristas = new Corista[dimF];
        this.dimF = dimF;
        this.dimL=0;
    }
    
    @Override
    public void agregarCorista(Corista corista){
        if (dimL < this.dimF){
            coristas[dimL] = corista;
            dimL++;
        }    
    }
    @Override 
    public boolean estaLleno(){
        return dimL == dimF;
    }
    
    @Override 
    public boolean estaOrdenado(){
        boolean aux= true;
        for (int i = 0; i < dimL-1 && aux == true; i++) {
            if (coristas[i].getTonoFundamental() > coristas[i+1].getTonoFundamental()){
                aux= true;
            }
            else{
                aux = false;
            }
                
         
        }
        return aux;
    }
    
    @Override
    public String toString() {
        String aux= super.toString();
        for (int i = 0; i < dimL; i++) {
            aux+= coristas[i].toString()+"\n";
        }
        return aux;
    }
}
