/*
 4-A- 
HABITACIONES: Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, 

CLIENTE: guarda el cliente que la reservó (nombre, DNI y edad)

(i) Genere las clases necesarias. Para cada una provea métodos getters/setters adecuados.

(ii) Implemente los constructores necesarios para iniciar: los clientes a partir de nombre,
DNI, edad; el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/
2000 y 8000.


/*
 HABITACIONES: Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, 
 */
package tema3;

public class Hotel {


    private Habitacion[] habitacion;
    private int cantHabitaciones;

    public Hotel(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
        this.habitacion = new Habitacion[cantHabitaciones];

        double minimo = 2000; // Valor mínimo del rango
        double maximo = 8000; // Valor máximo del rango

        for (int i = 0; i < cantHabitaciones; i++) {
            habitacion[i] = new Habitacion(); // Crear una nueva instancia de Habitacion
            habitacion[i].setOcupado(false);
            double aleatorio = minimo + Math.random() * (maximo - minimo);
            habitacion[i].setCostoNoche(aleatorio);
        }
    }

    
    public Habitacion[] getHabitacion() {
        return habitacion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }
    
    public void setHabitacion(Habitacion[] habitacion) {
        this.habitacion = habitacion;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }
    
    public void ingresarClienteEnHabitacion(int numeroHabitacion, Cliente cliente) {
    if (numeroHabitacion >= 1 && numeroHabitacion <= cantHabitaciones) {
        Habitacion habitacion = this.habitacion[numeroHabitacion]; // Restar 1 porque los índices comienzan en 0
        if (!habitacion.isOcupado()) {
            habitacion.setCliente(cliente);
            habitacion.setOcupado(true);
            System.out.println("Cliente ingresado con éxito en la habitación " + numeroHabitacion);
        } else {
            System.out.println("La habitación " + numeroHabitacion + " está ocupada.");
        }
    } else {
        System.out.println("Número de habitación no válido.");
    }
}

}



   
   
    
    

