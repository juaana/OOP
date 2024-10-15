/*
 Realice um programa que instancie un Sändwich con un Pan y cargue Ingredientes. Luego, imprima la
representacion del Sandwich.
 */
package ExamenTurnoP2024;

/**
 *
 * @author juanazabaleta
 */
public class ExamenTurnoP2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pan pan = new Pan("Premium", "Ciabatta", 10);
        Sandwich sandwich= new Sandwich(pan, "Chamuchito", 2);
        Ingrediente ingrediente1 = new Ingrediente("B", "Queso", 1);
        Ingrediente ingrediente2 = new Ingrediente("A", "Tomate", 1);
        sandwich.agregarIngrediente(ingrediente1);
        sandwich.agregarIngrediente(ingrediente2);
        
        System.out.println(sandwich.toString());
        
    }
    
}
