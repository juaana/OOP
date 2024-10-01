/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author juanazabaleta
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Pepe", 41414141, 36);
        Trabajador trabajador = new Trabajador("Juan", 432432, 55, "Jardinero");
        
        System.out.println(persona);
        System.out.println(trabajador);
    }
    
}
