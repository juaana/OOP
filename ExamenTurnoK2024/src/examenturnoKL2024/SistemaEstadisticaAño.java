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
public class SistemaEstadisticaAño extends SistemaEstadistica {

    public SistemaEstadisticaAño(String nombre, String facultad, int añoCreacion, int años) {
        super(nombre, facultad, añoCreacion, años);
    }
    
    @Override
    public String toString(){
        String aux= "";
        int cant= 0;
        aux= super.toString();
        for (int j = super.getCarrera().getAñoCreacion(); j < super.getCarrera().getAñoCreacion() + super.getAños(); j++) {
            for (int i = 1; i < super.getTrimestres()+1; i++) {
                cant+= super.obtenerEgresados(i, j);
            }
            aux += "Año "+ j + " "+ cant +" egresados.\n";
            cant=0;
        }
        
        return aux;
    }
    
}
