/*
5- El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen
(con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad
de la comida (2) Precio (3) Ambiente.
Escriba un programa que lea desde teclado las calificaciones de los cinco clientes
para cada uno de los aspectos y almacene la información en una estructura. Luego
imprima la calificación promedio obtenida por cada aspecto.
 */
package clase1;
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
        int clientes = 5;
        int aspectos = 4;
        int i;
        int j;
        int[][] calif = new int[clientes][aspectos];
        double suma=0;
        for (i=0; i < clientes ; i++){
            System.out.println("Cliente "+ (i+1));
            for (j=0; j < aspectos ; j++){
                System.out.println("Ingrese su calificación para el aspecto "+ j + ":" );
                calif[i][j]= Lector.leerInt();
            } 
             System.out.println("___________________");
        }
            for (j=0; j< aspectos; j++){
            suma=0;
            System.out.println("Aspecto "+ j);
            for (i=0; i < clientes ; i++){
                suma += calif[i][j];
            }
            suma = suma / 5;
            System.out.println("Promedio "+ suma);
        }
    }
    
}
