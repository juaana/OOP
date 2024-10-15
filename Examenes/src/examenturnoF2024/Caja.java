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
public class Caja {
    private boolean disponibilidad;
    private Ticket tickets [];
    private int cantMaxTickets;
    private int dimLTickets;
    
    
    
    public Caja(int unaCantMaxTickets){
        this.disponibilidad = true;
        this.cantMaxTickets = unaCantMaxTickets;
        this.tickets = new Ticket[this.cantMaxTickets];
        this.dimLTickets = 0;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public int cantidadLibrosVendidos(){
        int aux=0;
        for (int i = 0; i < dimLTickets; i++) {
            aux+= tickets[i].getCantLibrosComprados();
        }
        return aux;
    }
    
    
    public void agregarTicket(Ticket unTicket){
        if (this.dimLTickets < cantMaxTickets){
            tickets[dimLTickets] = unTicket;
            dimLTickets++;
        }
    }
    
    public Ticket ticketMasAlto(){
        double montoMasAlto = -1;
        int indiceMontoMasAlto = 0;
        
        for (int i = 0; i < dimLTickets; i++) {
            if(tickets[i].getMontoAbonado() > montoMasAlto){
                montoMasAlto= tickets[i].getMontoAbonado();
                indiceMontoMasAlto = i;
            }
        }
        return tickets[indiceMontoMasAlto];
    }
    
    public String toString(){
        String aux= "Disponibilidad: " + this.disponibilidad + ". Tickets emitidos: ";
        for (int i = 0; i < this.dimLTickets; i++) {
            aux+= tickets[i].toString();
        }
        return aux;
    }
    
}
