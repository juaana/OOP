/*
4- Sobre un nuevo programa, modifique el ejercicio anterior para considerar que:
a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre, DNI, edad)
y el día en que se quiere presentar al casting. La persona debe ser inscripta en ese día, en el
siguiente turno disponible. En caso de no existir un turno en ese día, informe la situación.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos
de casting.
Una vez finalizada la inscripción:
b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
persona a entrevistar en cada turno asignado.
 */
package tema2;
import PaqueteLectura.Lector;

public class Ej0402 {
    public static void main(String[] args) {
        int dimFDias = 5;
        int dimFPersonas = 8;
        int dia = 0; // Inicializar el día en 0
        int turno = 0; // Inicializar el turno en 0
        boolean finalizarInscripcion = false; // Bandera para controlar la finalización de la inscripción

        Persona[][] casting = new Persona[dimFDias][dimFPersonas];
        int[] inscritosPorDia = new int[dimFDias]; // Almacena la cantidad de inscritos por día

        while (dia < dimFDias && !finalizarInscripcion) {
            System.out.println("Ingrese su nombre (o 'ZZZ' para finalizar)");
            String nombre = Lector.leerString();

            if (nombre.equals("ZZZ")) {
                finalizarInscripcion = true; // Establecer la bandera para finalizar la inscripción
            } else {
                System.out.println("Ingrese su DNI");
                int dni = Lector.leerInt();
                System.out.println("Ingrese su edad");
                int edad = Lector.leerInt();
                System.out.println("Ingrese el día en que desea presentarse (1-" + dimFDias + ")");
                int diaElegido = Lector.leerInt() - 1; // Restar 1 para ajustar al índice del arreglo

                if (diaElegido >= 0 && diaElegido < dimFDias) {
                    if (inscritosPorDia[diaElegido] < dimFPersonas) {
                        casting[diaElegido][inscritosPorDia[diaElegido]] = new Persona();
                        casting[diaElegido][inscritosPorDia[diaElegido]].setNombre(nombre);
                        casting[diaElegido][inscritosPorDia[diaElegido]].setDNI(dni);
                        casting[diaElegido][inscritosPorDia[diaElegido]].setEdad(edad);
                        inscritosPorDia[diaElegido]++; // Incrementar la cantidad de inscritos en ese día
                    } else {
                        System.out.println("No hay más turnos disponibles para el día " + (diaElegido + 1));
                    }
                } else {
                    System.out.println("Día ingresado fuera de rango.");
                }
            }
        }

        for (int i = 0; i < dimFDias; i++) {
            System.out.println("Día " + (i + 1) + ": " + inscritosPorDia[i] + " inscritos");

            for (int j = 0; j < dimFPersonas; j++) {
                if (casting[i][j] != null) {
                    System.out.println("  Turno " + (j + 1) + ": " + casting[i][j].getNombre());
                }
            }
        }
    }
}
