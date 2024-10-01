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
public class RegistroTemperaturasAño extends RegistroTemperaturas {

    public RegistroTemperaturasAño(int unaCantidadAños, int unAñoComienzo, Estacion unaEstacion) {
        super(unaCantidadAños, unAñoComienzo, unaEstacion);
    }

    @Override
    public String calcularPromedio(){
        String aux = "PROMEDIOS POR AÑO \n" ;
        double sumaTemp; 
        double promedioTemp;
        
        for (int i = 0; i < this.getCantidadAños(); i++) {
            sumaTemp = 0;
            promedioTemp = 0;
            
            for (int j = 0; j < this.getMeses(); j++) {
                sumaTemp += obtenerTemperatura(j,i);
            }
            promedioTemp = sumaTemp / this.getMeses();
            aux += "Año " + (this.getAñoComienzo()+ i) + " " + promedioTemp + "\n";
        }
        
        return aux;
        
    }

}
       
