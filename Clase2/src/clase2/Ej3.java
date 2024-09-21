/*
 3- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona. Pensar en la estructura de datos a utilizar. Para comparar
Strings use el método equals.
 */
package clase2;
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
        int dia = 5;
        int persona = 8;
        int i = 0;
        int j = 0;
        int contador = 0;
        String nombre = "";
        Persona [][] personas = new Persona[persona][dia];
        
        System.out.println("Ingrese el nombre de la persona"+ (j +1) +" del día "+ (i+1));
        nombre = Lector.leerString();
        
        while (!nombre.equals("ZZZ") && contador < 40 ){   
                j=0;
            while (!nombre.equals("ZZZ") && j < persona ){
                personas[j][i] = new Persona();
                personas[j][i].setNombre(nombre);
                System.out.println("Ingrese el DNI de la persona"+ (j +1) +" del día "+ (i+1));
                personas[j][i].setDNI(Lector.leerInt());
                System.out.println("Ingrese la edad de la persona"+ (j +1) +" del día "+ (i+1));
                personas[j][i].setEdad(Lector.leerInt());
                  
                j++;
                contador++;
                if (j< persona){
                System.out.println("Ingrese el nombre de la persona"+ (j +1) +" del día "+ (i+1));
                nombre = Lector.leerString();
                }
            }
            i++;    
        }
        System.out.println("Fin del casting");
        
        for (i = 0; i<dia ; i++){
            for (j=0; j<persona; j++){
                System.out.println("Persona " + (j+1) + " día " + (i+1) + " "+ personas[j][i].getNombre());
            }
        }
        
        
        
    }
    
}
