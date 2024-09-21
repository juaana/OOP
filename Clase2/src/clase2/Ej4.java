/*
 4- Sobre un nuevo programa, modifique el ejercicio anterior para considerar que:
a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre, DNI, edad)
y el día en que se quiere presentar al casting. La persona debe ser inscripta en ese día, en el
siguiente turno disponible. En caso de no existir un turno en ese día, informe la situación.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos de
casting.
Una vez finalizada la inscripción:
b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
persona a entrevistar en cada turno asignado.
 */
package clase2;
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
        int dia = 5;
        int persona = 8;
        int i;
        int j;
        int diaElegido;
        
        int contador = 0;
        String nombre;
        Persona [][] personas = new Persona[persona][dia];
        
       
        boolean continuar = true;//Flag que determina si sigue o no

        while (continuar && contador < 40) { //Mientras continuar sea verdadera
            System.out.println("Ingrese el nombre de la persona (o 'ZZZ' para terminar): ");
            nombre = Lector.leerString();

            if (nombre.equals("ZZZ")) { //Si llego a ZZZ entonces paso la flag a false
                continuar = false; 
            } else {
                    System.out.println("Ingrese el día elegido (1-5):"); //Sino sigo y pido el dia 
                    diaElegido = Lector.leerInt();      
                    i = diaElegido - 1; 
                    j = 0;

                    // Buscar un espacio disponible
                    while (j < persona && personas[j][i] != null) {    //Busco hasta null
                        j++;
                    }
                    
                    if (j < persona) { //Mientras j este dentro del rango de persona
                        personas[j][i] = new Persona();
                        personas[j][i].setNombre(nombre);
                        System.out.println("Ingrese el DNI de la persona " + (j + 1) + " del día " + (i + 1));
                        personas[j][i].setDNI(Lector.leerInt());
                        System.out.println("Ingrese la edad de la persona " + (j + 1) + " del día " + (i + 1));
                        personas[j][i].setEdad(Lector.leerInt());
                        contador++;
                    } else {
                        System.out.println("No hay más espacios disponibles para el día " + diaElegido); //Si no esta dentro del rango quiere decir que tengo que terminar
                    }
                }
            }
        i=0;
        j=0;
        
        while (i < dia){
            contador= 0;
            System.out.println("Día "+ (i+1));
            while (j< persona){
                if (personas[j][i] != null){
                  System.out.println("Turno "+ (j+1) + ": " + personas[j][i].getNombre());
                  contador++;
                }
                
                j++;
            }
            System.out.println("El día "+ (i+1) + " se inscribieron " + contador + " personas.");
            i++;
            j=0;
            
        }
        
        
        
        }

    }
