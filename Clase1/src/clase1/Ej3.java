/*
 3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Leer un valor entero e indicar si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento".
 */
package clase1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author juanazabaleta
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int dimFF = 5;
        int dimFC= 5; 
        int[][] matrizEnt = new int[dimFF][dimFC]; 
        int i;
        int j;
        int suma = 0;
        
        for (i=0; i <dimFF ; i++){
            for (j=0; j<dimFC; j++){
                matrizEnt[i][j]= GeneradorAleatorio.generarInt(30);
                System.out.println("Fila "+ (i+1)+" Columna " + (j+1)+ ": "+ matrizEnt[i][j]);
                     
            }
        }
        for (j=0; j<dimFC ; j++){
            suma += matrizEnt[0][j]; //Atención aca con el tema de la indexación
        }
        System.out.println("La suma de los números de la fila 1 es : " + suma);
    //- Generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. Luego, imprima el vector.
        
        int dimF = 5; 
        int[] vEnteros = new int[dimF]; 
        
        for (i= 0; i<dimFF ; i++){
            for (j=0; j<dimFC; j++){
                vEnteros[j] += matrizEnt[i][j];
            }
        }
        for (j=0; j < dimF ; j++){
            System.out.println("La suma de los números de la columna "+ (j+1) + " es: " + vEnteros[j]);
        }
        System.out.println("Ingrese el número que desea buscar");
        int numero = Lector.leerInt();
        boolean esta= false;
        for (i=0; i< dimFF; i++){
            for (j=0; j< dimFC; j++){
               if (numero == matrizEnt[i][j]){
                   System.out.println("El número "+ numero + " se encuentra en la fila "+ (i+1) + " columna " + (j+1));
                   esta= true;
               }
               
            }
        }
        if (esta == false){
            System.out.println("No se encontró el número "+ numero);
        }
    }
    
}
