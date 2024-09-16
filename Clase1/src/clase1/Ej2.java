package clase1;

import PaqueteLectura.Lector;

/**
 *
 * @author juanazabaleta
 */
public class Ej2 {
    public static void main(String[] args) {
        int dimF = 15;
        double[] vAltura = new double[dimF];
        double suma = 0.0;
        int i;

        // Leer las alturas de los jugadores
        for (i = 0; i < dimF; i++) {
            System.out.println("Ingrese la altura del jugador número " + (i + 1) + ":");
            vAltura[i] = Lector.leerDouble();
            suma += vAltura[i];
        }

        // Calcular la altura promedio
        double promedio = suma / dimF;
        System.out.println("La altura promedio es: " + promedio);

        // Contar la cantidad de jugadores con altura por encima del promedio
        int cantidadPorEncimaPromedio = 0;
        for (i = 0; i < dimF; i++) {
            if (vAltura[i] > promedio) {
                cantidadPorEncimaPromedio++;
            }
        }

        // Informar la cantidad de jugadores por encima del promedio
        System.out.println("Cantidad de jugadores con altura por encima del promedio: " + cantidadPorEncimaPromedio);
    }
}
