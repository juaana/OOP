/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenturnoF2024;

/**
 *
 * @author juanazabaleta
 */
public class Libreria {
    private String nombre;
    private int numVentaActual;
    private int cantCajas;
    private Caja cajas [];
    
    public Libreria(String unNombre){
        this.nombre = unNombre;
        this.numVentaActual = 0;
        this.cantCajas = 4;
        this.cajas = new Caja[this.cantCajas];
        for (int i = 0; i < cantCajas; i++) {
            cajas[i] = new Caja(10); 
        }
    }
    
    public void generarTicket(int unNumCaja, int unDNI, int unaCantLibros, double unMonto, String unMedioDePago ){
        Ticket ticket = new Ticket(this.numVentaActual, unDNI,  unaCantLibros,unMonto,  unMedioDePago);
        cajas[unNumCaja-1].agregarTicket(ticket); 
        numVentaActual++;
    }
    
    public void marcarNoDisponible(int unNumero){
        for (int i = 0; i < cantCajas ; i++) {
            if(cajas[i].cantidadLibrosVendidos() < unNumero){
                cajas[i].setDisponibilidad(false);
            }
        }
    }
    
    public Ticket ticketConMayorMonto() {
    Ticket ticketMayor = null; 
    double montoMasAlto = -1; 
    
    for (Caja caja : cajas) {
        Ticket ticketActual = caja.ticketMasAlto(); 
        if (ticketActual != null && ticketActual.getMontoAbonado() > montoMasAlto) {
            montoMasAlto = ticketActual.getMontoAbonado();
            ticketMayor = ticketActual; 
        }
    }
    return ticketMayor; 
}

    
    public String toString(){
        String aux = "Librería: "+ this.nombre + "\n";
        for (int i = 0; i < cantCajas; i++) {
            aux+= "Caja "+ (i+1)+ ": "+ cajas[i].toString() + "\n"; 
        }
        return aux;
    }
    
}
