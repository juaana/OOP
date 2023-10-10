/*
B- Realizar un programa que instancie un círculo, le cargue información leída de teclado e
informe en consola el perímetro y el área.
 */
package tema3;

import PaqueteLectura.Lector;
public class Ej0503 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        
    System.out.println("Ingrese el radio del círculo");
    circulo.setRadio(Lector.leerDouble());
    System.out.println( "El perímetro del círculo es " + circulo.calcularPerimetro());
    System.out.println( "El área del círculo es " + circulo.calcularArea());
    
    }
}
