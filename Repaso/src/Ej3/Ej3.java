/*
 d) Realice un programa que instancie un evento ocasional y una gira, cargando la
información necesaria. Luego, para ambos, imprima el costo e invoque al mensaje actuar.
 */
package Ej3;

/**
 *
 * @author juanazabaleta
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Gira gira = new Gira("Gira", "Banda 2" , 3, 2);
        Fecha fecha = new  Fecha("La Plata", 10);
        gira.agregarFecha(fecha);
        gira.agregarTema("Tema 1");
        gira.agregarTema("Tema 2");
        System.out.println("Costo de la gira: " + gira.calcularCosto());
        System.out.println(gira.actuar());
         
        EventoOcasional EO = new EventoOcasional(1, "Pepe", 1,"Banda", 2);
        EO.agregarTema("Tema 1");
        EO.agregarTema("Tema 4");
        System.out.println("Costo del evento: "+EO.calcularCosto());
        System.out.println(EO.actuar());    
    }
    
}
