/*
 4- Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
(1..4). Realice un programa que permita informar la cantidad de personas que
concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al
edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de
oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro.
de piso 9. Al finalizar la llegada de personas, informe lo pedido.
 */
package clase1;
import PaqueteLectura.Lector;
/**
 *
 * @author juanazabaleta
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimFP = 8;
        int dimFO = 4;
        int[][] edif =  new int[dimFP][dimFO];
        int piso;
        int oficina;
        int i;
        int j;
        System.out.println("Ingrese el número de piso");
        piso = Lector.leerInt();
        while (piso < 9) {
            System.out.println("Ingrese el número de oficina");
            oficina = Lector.leerInt();
            edif[piso-1][oficina-1] += 1;
            System.out.println("Ingrese el número de piso");
            piso = Lector.leerInt();
        }
        for (i=0 ; i < dimFP; i++){
            for (j=0; j< dimFO; j++){
                System.out.println("Piso "+ (i+1) + " Oficina "+ (j+1) + ": "+ edif[i][j]);
            }
        }
        
    }
    
}
