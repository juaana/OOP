/*
Escriba un programa que instancie un coro de cada tipo. Lea o bien la cantidad de
coristas (en el caso del coro semicircular) o la cantidad de hileras e integrantes por
hilera (en el caso del coro por hileras). Luego cree la cantidad de coristas necesarios,
leyendo sus datos, y almacenándolos en el coro. Finalmente imprima toda la
información de los coros indicando si están bien formados o no.
 */
package Ej4;

/**
 *
 * @author juanazabaleta
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Director director1 = new Director(2, "Pepito", 12345, 23);
       CoroSemicircular coroSC = new CoroSemicircular(director1, 2); 
       Corista corista1 = new Corista(2, "Corista tono2", 11345, 20);
       Corista corista2 = new Corista(1, "Corista tono1", 113445, 21);
       
       coroSC.agregarCorista(corista2);
       coroSC.agregarCorista(corista1);
       
       
       System.out.println(coroSC.estaLleno());
       System.out.println(coroSC.estaOrdenado());
       System.out.println(coroSC.toString());
       
       Director director2 = new Director(3, "Pepinillo", 4444, 24);
       CoroHileras coroH = new CoroHileras(director2, 2); 
       
       Corista corista3 = new Corista(3, "Corista tono2", 11345, 20);
       coroH.agregarCorista(corista3);
       coroH.agregarCorista(corista3); 
       
       
       System.out.println(coroH.estaLleno());
       System.out.println(coroH.estaOrdenado());
       System.out.println(coroH.toString());
       
    }
}
