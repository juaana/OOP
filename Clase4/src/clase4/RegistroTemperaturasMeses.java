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
public class RegistroTemperaturasMeses extends RegistroTemperaturas{

    public RegistroTemperaturasMeses(int unaCantidadAños, int unAñoComienzo, Estacion unaEstacion) {
        super(unaCantidadAños, unAñoComienzo, unaEstacion);
    }

    @Override
    public String calcularPromedio(){
        String aux = "PROMEDIOS POR MES \n" ;
        double sumaTemp; 
        double promedioTemp;
        
        for (int i = 0; i < this.getMeses(); i++) {
            sumaTemp = 0;
            promedioTemp = 0;
            for (int j = 0; j < this.getCantidadAños(); j++) {
                sumaTemp += obtenerTemperatura(i,j);
            }
            promedioTemp = sumaTemp / this.getCantidadAños();
            aux += "Mes " + (i +1 ) + " "+ promedioTemp + "\n";
        }
        return aux;
 
        
    }
    
   
    
    
    
}
