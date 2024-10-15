/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenturnoKL2024;

/**
 *
 * @author juanazabaleta
 */
public abstract class SistemaEstadistica {
    private Carrera carrera;
    private int trimestres;
    private int años;
    private int cantEgresos[][];
    
    public SistemaEstadistica(String nombre, String facultad, int añoCreacion, int años) {
        this.carrera = new Carrera(nombre, facultad,añoCreacion);
        this.trimestres = 4;
        this.años = años;
        this.cantEgresos = new int[años][trimestres];
        
        for (int i = 0; i < años; i++) {
            for (int j = 0; j < trimestres; j++) {
                cantEgresos[i][j] = -1;
            }
            
        }
        
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public int getTrimestres() {
        return trimestres;
    }

    public int getAños() {
        return años;
    }
    
    
    public void registrarEgresado(int unTrimestre, int unAño, int unaCantidadEgresados){
        cantEgresos[unAño-carrera.getAñoCreacion()][unTrimestre-1] = unaCantidadEgresados;
    }
    
    public int obtenerEgresados(int unTrimestre, int unAño){
        return cantEgresos[unAño-carrera.getAñoCreacion()][unTrimestre-1];
    }
    
    public int cantidadDeTrimConEgresados(int unaCantEgresados){
        int aux=0;
        for (int i = 0; i < años; i++) {
            for (int j = 0; j < trimestres; j++) {
                if (cantEgresos[i][j] == unaCantEgresados){
                    aux++;
                }
            }
            
        }
        return aux;
        
    }
    public String toString(){
        String aux= "";
        aux= carrera.toString();
        return aux;
    }
    
}
