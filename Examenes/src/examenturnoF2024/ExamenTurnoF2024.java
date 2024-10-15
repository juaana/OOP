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
public class ExamenTurnoF2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libreria libreria = new Libreria( "Soy la libreria");
        libreria.generarTicket(1, 43232432, 2, 34234324, "Debito" );
        libreria.generarTicket(2, 12312321, 1, 321321321, "Debito" );
        
        libreria.marcarNoDisponible(2);
        System.out.println("Ticket con mayor monto: " + libreria.ticketConMayorMonto());
        System.out.println(libreria.toString());
    }
    
}
