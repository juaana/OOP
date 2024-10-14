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
public class Supermercado {
    private String direccion;
    private int numVentaActual;
    private Caja cajas [];
    private int cantMaxCajas;
    private int cantCajas;

    public Supermercado(String direccion) {
        this.direccion = direccion;
        this.numVentaActual = 0;
        this.cantCajas= 0;
        this.cantMaxCajas = 5 ;
        this.cajas = new Caja [this.cantMaxCajas];
        
    }
    
    public void agregarCaja(Caja unaCaja){
        if (cantCajas < cantMaxCajas){
            cajas[cantCajas] = unaCaja;
            cantCajas ++;
        }
    }
    
    public void agregarTicketACaja(int numCaja, int CUIT, int cantProdComprados, double montoAbonado, String medioDePago){
        cajas[numCaja-1].agregarTicket(this.numVentaActual, CUIT, cantProdComprados, montoAbonado, medioDePago);
        
        this.numVentaActual++;
    }
    
    public int cajaMenorTicketsConCredito(){
       int aux= 0;
       int auxCantTicketsCred= 100000000;
        for (int i = 0; i < cantCajas; i++) {
            if(cajas[i].cantTicketsCredito() < auxCantTicketsCred ){
                aux = i;
                auxCantTicketsCred = cajas[i].cantTicketsCredito();
            }
            
        }
       return aux+1;
    }
    
    public String toString(){
        String aux= "Supermercado"+ "\nDirección: "+  this.direccion + "\nCantidad de cajas: "+ this.cantCajas+". ";
        for (int i = 0; i < cantCajas; i++) {
            aux += "\nCaja " + (i+1) + " " + cajas[i].toString();
        }
        return aux;
    }
    
    
}
