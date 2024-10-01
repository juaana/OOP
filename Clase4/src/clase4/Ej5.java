/*
5-A- Modifique la clase VisorFiguras: ahora debe permitir guardar las figuras a mostrar (a
lo sumo 5) y también mostrar todas las figuras guardadas. Use la siguiente estructura.

Realice un programa que instancie el visor, guarde dos cuadrados y un rectángulo en el
visor y por último haga que el visor muestre sus figuras almacenadas.
 */
package clase4;

/**
 *
 * @author juanazabaleta
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VisorFiguras figuras = new VisorFiguras();
       Cuadrado cuadrado1 = new Cuadrado(1, "Rojo", "Azul");
       figuras.guardar(cuadrado1);
       Cuadrado cuadrado2 = new Cuadrado(2, "Negro", "Negro");
       figuras.guardar(cuadrado2);
       Rectangulo rectangulo1 = new Rectangulo (2,2,"Azul", "Azul");
       figuras.guardar(rectangulo1);
       figuras.mostrar();
               
    }
    
}
