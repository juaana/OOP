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
public class Ticket {
    private int numeroTicket;
    private int CUIT;
    private int cantProdComprados;
    private double montoAbonado;
    private String medioDePago;

    public Ticket(int numeroTicket, int CUIT, int cantProdComprados, double montoAbonado, String medioDePago) {
        this.numeroTicket = numeroTicket;
        this.CUIT = CUIT;
        this.cantProdComprados = cantProdComprados;
        this.montoAbonado = montoAbonado;
        this.medioDePago = medioDePago;
        
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public String getMedioDePago() {
        return medioDePago;
    }
    
    public String toString(){
        String aux= "Nro de ticket: " + this.numeroTicket + ". CUIT: " + this.CUIT + ". Cantidad productos: " + this.cantProdComprados +  ". Monto: " + this.montoAbonado +  ". Medio de pago: " + this.medioDePago + ". ";
        return aux;
    }
    
    
    
}
