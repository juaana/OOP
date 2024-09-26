/*
 Realizar un programa que instancie un círculo, le cargue información leída de teclado e
informe en consola el perímetro y el área
 */
package clase3;
import PaqueteLectura.Lector;
/**
 *
 * @author juanazabaleta
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circulo circulo = new Circulo();
       
       System.out.println("Ingrese el radio del círculo");
       circulo.setRadio(Lector.leerDouble());
       System.out.println("Ingrese el color de relleno del círculo");
       circulo.setColorRelleno(Lector.leerString());
       System.out.println("Ingrese el color de la línea del círculo");
       circulo.setColorLinea(Lector.leerString());
       
       System.out.println("El área del círculo es " + circulo.calcularArea());
       System.out.println("El perímetro del círculo es " + circulo.calcularPerimetro());
      System.out.println(circulo);
       
       
       
    }
    
}
