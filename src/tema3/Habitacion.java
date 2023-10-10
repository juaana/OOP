/*
 HABITACIONES: Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, 
 */
package tema3;

public class Habitacion {

    private double costoNoche;
    private boolean ocupado;
    private Cliente cliente;

    
    public Habitacion(double costoNoche, boolean ocupado, Cliente cliente) {
        this.costoNoche = costoNoche;
        this.ocupado = ocupado;
        this.cliente = cliente;
    
    }

    public Habitacion() {
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    

    public double getCostoNoche() {
        return costoNoche;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setCostoNoche(double costoNoche) {
        this.costoNoche = costoNoche;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
   
   
    
    
}
