/*
 (iii) Implemente en las clases que corresponda todos los métodos necesarios para:
- Ingresar un cliente C en la habitación número X. Asuma que X es válido (es decir, está
en el rango 1..N) y que la habitación está libre.
- Aumentar el precio de todas las habitaciones en un monto recibido.
- Obtener la representación String del hotel, siguiendo el formato:
{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada}
…
{Habitación N: costo, libre u ocupada, información del cliente si está ocupada}
 
 */
package tema3;
import PaqueteLectura.Lector;
public class Ej0403 {

 public static void main(String[] args) {
    int i;
    System.out.println("Ingrese la cantidad de habitaciones del hotel");
    int cantidadHabitaciones = Lector.leerInt();
    Hotel hotel = new Hotel(cantidadHabitaciones);

    System.out.println("Ingrese el número de la habitación en la que desea ingresar al cliente");
    i = Lector.leerInt();

    // Verificar que el número de habitación sea válido
    if (i >= 1 && i <= cantidadHabitaciones) {
        // Crear un objeto Cliente con los datos del cliente
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = Lector.leerString();
        System.out.println("Ingrese el DNI del cliente: ");
        int dni = Lector.leerInt();
        System.out.println("Ingrese la edad del cliente: ");
        int edad = Lector.leerInt();
        Cliente cliente = new Cliente(nombre, dni, edad);

        // Ingresar al cliente en la habitación
        hotel.ingresarClienteEnHabitacion(i, cliente);
    } else {
        System.out.println("Número de habitación no válido.");
    }
 }
}




