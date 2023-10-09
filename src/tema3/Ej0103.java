/*
B- Realizar un programa que instancie un triángulo, le cargue información leída desde
teclado e informe en consola el perímetro y el área.
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author jjuan
 */
public class Ej0103 {

    
    public static void main(String[] args) {
        Triangulo triangulo= new Triangulo();
        System.out.println("Ingrese el tamaño en cm del lado 1");
        triangulo.setLadoUno(Lector.leerDouble());
         System.out.println("Ingrese el tamaño en cm del lado 2");
        triangulo.setLadoDos(Lector.leerDouble());
         System.out.println("Ingrese el tamaño en cm del lado 3");
        triangulo.setLadoTres(Lector.leerDouble());
        
         System.out.println("El perímetro del triangulo es "+ triangulo.getCalcularPerimetro());
         System.out.println("El área del triangulo es " + triangulo.getCalcularArea());
        
    }
    
}
