/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;
import PaqueteLectura.Lector;
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        
        System.out.println("Ingrese el lado 1");
        triangulo.setLado1(Lector.leerDouble());
        System.out.println("Ingrese el lado 2");
        triangulo.setLado2(Lector.leerDouble());
        System.out.println("Ingrese el lado 3");
        triangulo.setLado3(Lector.leerDouble());
       
        System.out.println("El perimetro del triángulo es "+ triangulo.calcularPerimetro());
        System.out.println("El área del triángulo es "+ triangulo.calcularArea());  
        
    }
    
}
