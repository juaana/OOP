/*

F- Realizar un programa que instancie un jugador y un entrenador. Informe la
representación String de cada uno.
 */
package clase4;

/**
 *
 * @author juanazabaleta
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Pepe", 2000, 2, 3, 3);
        Entrenador entrenador = new Entrenador("John Doe", 3000, 2, 0);
        
        System.out.println(jugador);
        System.out.println(entrenador);
        
    }
    
}
