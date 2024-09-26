/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author juanazabaleta
 */
public class Hotel {
    private Habitacion habitaciones[];
    private int cantHabitaciones;
    private int i;
    
    
    public Hotel (int unaCantHabitaciones ){
        this.cantHabitaciones = unaCantHabitaciones;
        this.habitaciones = new Habitacion [cantHabitaciones];
        
        for (i=0; i<cantHabitaciones; i++){
            habitaciones[i] = new Habitacion();
        }
    }
   
    public void agregarCliente(int numeroHabitacion, Cliente unCliente ){
        habitaciones[numeroHabitacion].setOcupada(true);
        habitaciones[numeroHabitacion].setCliente(unCliente);
    }
    
    public void aumentarCostos(double unMonto){
        for (i=0; i< cantHabitaciones; i++){
            habitaciones[i].setCostoPorNoche(habitaciones[i].getCostoPorNoche() + unMonto);
            
        }
    }
    
    public String toString(){
        String aux= "Hotel: \n";
        for (i=0; i< cantHabitaciones; i++){
         aux += "Habitación " + (i+1) +": "+  habitaciones[i] + "\n";
        }
        return aux;
    }
    
    
    
}
