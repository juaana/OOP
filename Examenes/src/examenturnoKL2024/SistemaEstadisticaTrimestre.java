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
public class SistemaEstadisticaTrimestre extends SistemaEstadistica{

    public SistemaEstadisticaTrimestre(String nombre, String facultad, int añoCreacion, int años) {
        super(nombre, facultad, añoCreacion, años);
    }
    
    public String toString(){
        String aux= "";
        int cant=0;
        aux= super.getCarrera().toString();
        
         for (int i = 1; i < super.getTrimestres()+1; i++) {
            for (int j = super.getCarrera().getAñoCreacion(); j < super.getCarrera().getAñoCreacion() + super.getAños(); j++) {
                cant+= super.obtenerEgresados(i, j);
            }
            aux+="Trimestre "+ i + " "+ cant + " egresados.\n";
            cant=0;
        }
        
        return aux;
    }
    
}
