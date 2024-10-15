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
public class ExamenTurnoE2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo el supermercado
        Supermercado supermercado = new Supermercado("Calle falsa 1234");
        
        //Creo caja 1
        Caja caja1= new Caja("John Dow", 2);
        
        //Agrego caja 1 al supermercado
        supermercado.agregarCaja(caja1);
        
        //Agrego tickets a caja 1
        supermercado.agregarTicketACaja(1,111111, 2,33, "Credito");
        supermercado.agregarTicketACaja(1,12345, 3,37, "Credito");
        
        
        //Creo caja 2
        Caja caja2= new Caja("Gatubelo", 3);
        //Agrego caja 2 al supermercado
        supermercado.agregarCaja(caja2);
        //Agrego tickets a caja 2 
        supermercado.agregarTicketACaja(2,101010, 5,43, "Debito");
        supermercado.agregarTicketACaja(2,4324, 7,73, "Debito");
        supermercado.agregarTicketACaja(2,4234325,55,37, "Credito");
        
        
        System.out.println("Caja con menor cantidad de tickets comprados con crédito " + supermercado.cajaMenorTicketsConCredito());
        System.out.println(supermercado.toString());
       
        
    }
    
}
