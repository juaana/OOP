/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenturnoE2024;

/**
 *
 * @author juanazabaleta
 */
public class Caja {
    private String nombreCajero;
    private Ticket tickets[];
    private int cantMaxTickets;
    private int cantTickets;
   

    public Caja(String nombreCajero, int cantMaxTickets) {
        this.nombreCajero = nombreCajero;
        this.cantMaxTickets = cantMaxTickets;
        this.tickets = new Ticket [this.cantMaxTickets];
        this.cantTickets = 0;
    }
    
    
    public void agregarTicket(int numTicket, int CUIT, int cantProdComprados, double montoAbonado, String medioDePago){
        if (cantTickets < cantMaxTickets){
            Ticket ticket = new Ticket(numTicket, CUIT, cantProdComprados, montoAbonado, medioDePago);
            tickets[cantTickets] = ticket;
            cantTickets++;
        }
        
    }
    
    public int cantTicketsCredito(){
        int contador=0;
        for (int i = 0; i < cantTickets; i++) {
            if (tickets[i].getMedioDePago().equals("Credito")){
                contador++;
            }
        }
        return contador;
    }
    
    public String toString(){
        String aux= "\nNombre del cajero: " + this.nombreCajero + ". Tickets emitidos: [";
        for (int i = 0; i < cantTickets; i++) {
            aux += tickets[i].toString();
        }
        aux+= "]";
        return aux;      
    }
}
