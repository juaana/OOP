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
public abstract class RegistroTemperaturas {
    private int meses = 12;
    private int cantidadAños;
    private int añoComienzo;
    private double [][] registroAños;
    private int i;
    private int j;
    private Estacion estacion;
    
    
    public RegistroTemperaturas(int unaCantidadAños, int unAñoComienzo, Estacion unaEstacion){
        this.estacion = unaEstacion;
        this.cantidadAños= unaCantidadAños;
        this.añoComienzo = unAñoComienzo;
        registroAños = new double[12][this.cantidadAños];
        
        for (i=0; i<meses; i++){
            for (j=0; j<this.cantidadAños; j++){
                registroAños[i][j] = 1000;
            }
        }
    }

    public int getCantidadAños() {
        return cantidadAños;
    }

    public int getMeses() {
        return meses;
    }

    public int getAñoComienzo() {
        return añoComienzo;
    }
    
    public void registrarTemperatura(int unMes, int unAño, double unaTemperatura){
        registroAños[unMes][unAño] = unaTemperatura;
    }
    
    public double obtenerTemperatura(int unMes, int unAño){
        return registroAños[unMes][unAño];
    }
    
    public String mesAñoConMasTemperatura(){
        int mesMasAlto = -1;
        int añoMasAlto = -1;
        double valorMasAlto = -1;
        for (i=0; i<meses; i++){
            for (j=0; j<cantidadAños; j++){
                if (registroAños[i][j] > valorMasAlto){
                    valorMasAlto = registroAños[i][j];
                    mesMasAlto = i;
                    añoMasAlto =j;
                }
            }
        }
        String aux = "En el mes " + mesMasAlto + " del año "+ (this.añoComienzo + añoMasAlto) + " se registró la mayor temperatura.";
        return aux;
    }
    
    public abstract String calcularPromedio();
    
    
    @Override
    public String toString(){
        return estacion.toString() + calcularPromedio();
    }
    
    
}
