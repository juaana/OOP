/*
 4-A- Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, guarda el cliente que la reservó (nombre, DNI y edad).
(i) Genere las clases necesarias. Para cada una provea métodos getters/setters adecuados.
(ii) Implemente los constructores necesarios para iniciar: los clientes a partir de nombre,
DNI, edad; el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/
2000 y 8000.
 */
package clase3;


import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author juanazabaleta
 */
public class Habitacion {
    private double costoPorNoche;
    private boolean ocupada;
    private Cliente cliente;
    
    
    public Habitacion(){
        
        costoPorNoche = 2000 + GeneradorAleatorio.generarDouble(6000);
        ocupada = false;
        cliente = null;
    }

    public double getCostoPorNoche() {
        return costoPorNoche;
    }

    public void setCostoPorNoche(double unCostoPorNoche) {
        costoPorNoche = unCostoPorNoche;
    }
    
    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
      public boolean getOcupada() {
        return ocupada;
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente unCliente) {
        cliente = unCliente;
    }

    @Override
    public String toString() {
        if (ocupada == false){ 
            return  costoPorNoche +", " + "habitación libre";
        
        }
        else{
             return  costoPorNoche +", " + "habitacion ocupada" + ", " + cliente ;
        }
        
    }
    

    
    
    
}
