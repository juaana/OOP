/*
1- Se dispone de la clase Persona (en la carpeta tema2). 
Un objeto persona puede crearse sin valores iniciales o
enviando en el mensaje de creación el nombre, DNI y edad (en ese orden). 
Un objeto persona responde a los siguientes mensajes:   
getNombre() retorna el nombre (String) de la persona 
getDNI() retorna el dni (int) de la persona getEdad() retorna la edad (int) de la persona 
setNombre(X) modifica el nombre de la persona al “String” pasado por parámetro (X) setDNI(X) modifica el DNI de la persona al “int” pasado por parámetro (X) 
setEdad(X) modifica la edad de la persona al “int” pasado por parámetro (X) 
toString() retorna un String que representa al objeto. Ej:  “Mi nombre es Mauro, mi DNI es 11203737 y tengo 70 años”  
 */
package tema2;

/**
 *
 * @author vsanz
 */
public class Demo01EnvioMensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String saludo1 = "hola";
        /*Envio al objeto string el mensaje length, provoca que se ejecute el método length - 
        devuelve la longitud - la cual se imprime */
        System.out.println(saludo1.length());    //Imprime 4
        /*Envio al objeto string el mensaje charAt(0), provoca que se ejecute el método charAt - 
        devuelve el caracter en la posición recibida - el cual se imprime */
        System.out.println(saludo1.charAt(0));   //Imprime h
        System.out.println(saludo1.toUpperCase().equals("HOLA")); // Imprime true

    }
    
}
