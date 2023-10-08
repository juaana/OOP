/*
1- Se dispone de la clase Persona (en la carpeta tema2). 
Un objeto persona puede crearse sin valores iniciales o enviando en el mensaje de creación el nombre,
DNI y edad (en ese orden). 
Un objeto persona responde a los siguientes mensajes:   
getNombre() retorna el nombre (String) de la persona 
getDNI() retorna el dni (int) de la persona 
getEdad() retorna la edad (int) de la persona 
setNombre(X) modifica el nombre de la persona al “String” pasado por parámetro (X) 
setDNI(X) modifica el DNI de la persona al “int” pasado por parámetro (X) 
setEdad(X) modifica la edad de la persona al “int” pasado por parámetro (X) 
toString() retorna un String que representa al objeto. Ej:  “Mi nombre es Mauro, mi DNI es 11203737 y tengo 70 años” 
 */
package tema2;

import PaqueteLectura.Lector;
public class Ej0102{
    
    public static void main(String[] args) {
       
      // Crear una persona con valores iniciales
Persona persona1 = new Persona("Mauro", 11203737, 70);


System.out.println("Ingrese el nombre de la persona");
persona1.setNombre(Lector.leerString());
System.out.println("Ingrese el DNI de la persona");
persona1.setDNI(Lector.leerInt());
System.out.println("Ingrese la edad de la persona");
persona1.setEdad(Lector.leerInt());

System.out.println(persona1.toString());
    
}
}
