/*
3- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona. Pensar en la estructura de datos a utilizar. Para comparar
Strings use el método equals.
 */
package tema2;
import PaqueteLectura.Lector;

public class Ej0302 {
    public static void main(String[] args) {
        int dimFDias = 5;
        int dimFPersonas = 8;
        int dia = 0; // Inicializar el día en 0
        int turno = 0; // Inicializar el turno en 0

        Persona[][] casting = new Persona[dimFDias][dimFPersonas];
        System.out.println("Ingrese su nombre");
        String nombre = Lector.leerString();
        while ((dia < dimFDias) && (!nombre.equals("ZZZ"))) {
            
            while (!nombre.equals("ZZZ") && turno < dimFPersonas) {
                casting[dia][turno] = new Persona();
                casting[dia][turno].setNombre(nombre);
                System.out.println("Ingrese su DNI");
                casting[dia][turno].setDNI(Lector.leerInt());
                System.out.println("Ingrese su edad");
                casting[dia][turno].setEdad(Lector.leerInt());

                // Avanzar al siguiente turno
                turno++;

                // Si se han completado los 8 turnos en el día actual, avanza al siguiente día
                if (turno == dimFPersonas) {
                    dia++;
                    turno = 0; // Reiniciar el turno para el nuevo día
                }

                // Si todavía no se han llenado todos los días, solicitar el nombre nuevamente
                if (dia < dimFDias) {
                    System.out.println("Ingrese su nombre");
                    nombre = Lector.leerString();
                }
            }

            // Si se llega a "ZZZ" o se llenan todos los turnos del día, avanza al siguiente día
            dia++;

            // Reiniciar el turno para el nuevo día
            turno = 0;
        }

        for (int i = 0; i < dimFDias; i++) {
            for (int j = 0; j < dimFPersonas; j++) {
                if (casting[i][j] != null) {
                    System.out.println("El día " + (i + 1) + " en el turno " + (j + 1) + " se entrevistará a " + casting[i][j].getNombre());
                }
            }
        }
    }
}
