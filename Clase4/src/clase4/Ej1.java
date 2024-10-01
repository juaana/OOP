/*
 E- Realizar un programa que instancie un triángulo y un círculo. Muestre en consola la
representación String de cada uno. Pruebe el funcionamiento del método despintar.
 */
package clase4;
public class Ej1 {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3.6, 3 ,3 , "Rojo", "Azul");
        Circulo circulo = new Circulo(3, "Amarillo", "Rosa");
        
        System.out.println(triangulo);
        System.out.println(circulo);
        
        triangulo.despintar();
        circulo.despintar();
       
        System.out.println(triangulo);
        System.out.println(circulo);
        
    }
    
}
