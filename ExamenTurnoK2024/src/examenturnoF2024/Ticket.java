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
public class Ticket {
    private int numTicket;
    private int DNI;
    private int cantLibrosComprados;
    private double montoAbonado;
    private String medioDePago;

    public Ticket(int numTicket, int DNI, int cantLibrosComprados, double montoAbonado, String medioDePago) {
        this.numTicket = numTicket;
        this.DNI = DNI;
        this.cantLibrosComprados = cantLibrosComprados;
        this.montoAbonado = montoAbonado;
        this.medioDePago = medioDePago;
    }

    public int getCantLibrosComprados() {
        return cantLibrosComprados;
    }

    public double getMontoAbonado() {
        return montoAbonado;
    }
    
    public String toString(){
        String aux= "";
        aux= "Número de ticket: "+ this.numTicket + ". DNI del cliente: "+ this.DNI + ". Cantidad de libros: "+this.cantLibrosComprados+ ". Monto abonado: "+ this.montoAbonado + ". Medio de pago: "+ this.medioDePago+ ". ";
        return aux;
    }
    
    
    
}
