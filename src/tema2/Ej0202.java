/*
 2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
- Informe la cantidad de personas mayores de 65 años.
- Muestre la representación de la persona con menor DNI.
 */
package tema2;

import PaqueteLectura.GeneradorAleatorio;

public class Ej0202 {
    public static void main(String[] args) {
        int dimF = 15;
        Persona[] personas = new Persona[dimF];
        int i = 0;
        int edad;
        int masSesenta = 0;
        int menorEdad = Integer.MAX_VALUE; // Inicializar con un valor alto
        int menor = -1; // Inicializar como -1 para indicar que no se ha encontrado ninguna persona

        edad = GeneradorAleatorio.generarInt(99);

        while (edad != 0 && i < dimF) {
            personas[i] = new Persona(); // Crear una nueva Persona en cada iteración
            personas[i].setEdad(edad);
            personas[i].setNombre(GeneradorAleatorio.generarString(10));
            personas[i].setDNI(GeneradorAleatorio.generarInt(8));
            i++;
            edad = GeneradorAleatorio.generarInt(99);
        }

        for (i = 0; i < dimF && personas[i] != null; i++) {
            if (personas[i].getEdad() > 65) {
                masSesenta++;
            }
            if (personas[i].getDNI() < menorEdad) {
                menorEdad = personas[i].getDNI();
                menor = i;
            }
        }

        System.out.println("La cantidad de personas mayores de 65 años es " + masSesenta);
        System.out.println("La persona con el DNI más bajo se llama " + personas[menor].getNombre() + ", tiene " + personas[menor].getEdad() + " años y su DNI es " + personas[menor].getDNI());
        
    }
}
