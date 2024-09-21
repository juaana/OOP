/*
 2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
- Informe la cantidad de personas mayores de 65 años.
- Muestre la representación de la persona con menor DNI.
 */
package clase2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author juanazabaleta
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dF=15;
        Persona [] personas = new Persona[dF];
        int edad;
        int i= 0;
        int cont= 0;
        int indiceMenorDNI = 0;
        int menorDNI;
        
        edad = GeneradorAleatorio.generarInt(100);
        while (edad != 0 && i<= (dF - 1)){
            personas[i] = new Persona(); 
            personas[i].setEdad(edad);
            personas[i].setDNI(GeneradorAleatorio.generarInt(1000));
            personas[i].setNombre(GeneradorAleatorio.generarString(20));
            i++;
            edad = GeneradorAleatorio.generarInt(100);
        }
        menorDNI= personas[0].getDNI();
        for (i=0 ; i<dF; i++){
           if( personas[i].getEdad()>= 65){
               cont++;
           }
           if(personas[i].getDNI() < menorDNI){
              indiceMenorDNI = i;
              menorDNI = personas[i].getDNI();
              
              
           }
           
           
        }
        System.out.println(cont + " personas tienen más de 65 años.");
        System.out.println(personas[indiceMenorDNI].toString());
    }
    
}
