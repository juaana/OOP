/*
 4-A- Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, guarda el cliente que la reservó (nombre, DNI y edad).
(i) Genere las clases necesarias. Para cada una provea métodos getters/setters adecuados.
(ii) Implemente los constructores necesarios para iniciar: los clientes a partir de nombre,
DNI, edad; el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/
2000 y 8000.
(iii) Implemente en las clases que corresponda todos los métodos necesarios para:
- Ingresar un cliente C en la habitación número X. Asuma que X es válido (es decir, está
en el rango 1..N) y que la habitación está libre.
- Aumentar el precio de todas las habitaciones en un monto recibido.
- Obtener la representación String del hotel, siguiendo el formato:
{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada}
…
{Habitación N: costo, libre u ocupada, información del cliente si está ocupada}
B- Realice un programa que instancie un hotel, ingrese clientes en distintas habitaciones,
muestre el hotel, aumente el precio de las habitaciones y vuelva a mostrar el hotel.
 */
package clase3;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author juanazabaleta
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Hotel hotel;
        Cliente cliente;
        int cantHabitaciones;
        int i;
        
        System.out.println("Ingrese la cantidad de habitaciones del hotel");  
        cantHabitaciones= Lector.leerInt();
        hotel = new Hotel(cantHabitaciones);
        
        for (i = 0; i< cantHabitaciones; i++){
                    System.out.println("Ingrese el nombre del cliente");
        cliente = new Cliente();
        cliente.setNombre(Lector.leerString());
        System.out.println("Ingrese el DNI del cliente");
        cliente.setDNI(Lector.leerInt());
        System.out.println("Ingrese la edad del cliente");
        cliente.setEdad(Lector.leerInt());
        System.out.println("Ingrese la habitacion en la que desea ingresar el cliente");
        hotel.agregarCliente(Lector.leerInt() - 1, cliente);   
        }
        
        System.out.println("--------------");
        System.out.println("Ingrese el aumento que desea aplicar");
        hotel.aumentarCostos(Lector.leerDouble());
        System.out.println(hotel);
        
        
        
        
    }
    
}
