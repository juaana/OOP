/*
3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
(iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.*/
package tema3;

import PaqueteLectura.Lector;

    public class Ej0303 {

    public static void main(String[] args) {
        Estante estante = new Estante(); // Instanciar un estante

        // Cargar varios libros en el estante
        cargarLibrosEnEstante(estante);

        // Buscar e informar el autor del libro "Mujercitas"
        String tituloBuscado = "Mujercitas";
        String libroMujercitas = estante.obtenerLibroPorTitulo(tituloBuscado);
        System.out.println(libroMujercitas);
        
    }

    public static void cargarLibrosEnEstante(Estante estante) {
        int dimF = 20;
        int i = 0;
        Libro libro;

        // Cargar libros en el estante
        System.out.println("Ingrese un nuevo libro (Escriba 'L' para terminar)");
        String unLibro = Lector.leerString();
        while (!unLibro.equalsIgnoreCase("L") && i < dimF) {
            libro = new Libro(); // Crear una nueva instancia de libro
            libro.setTitulo(unLibro); // Establecer el título del libro
            estante.agregarLibro(libro); // Agregar el libro al estante
            i++;

            // Leer el siguiente libro
            System.out.println("Ingrese un nuevo libro (Escriba 'L' para terminar)");
            unLibro = Lector.leerString();
        }
    }
}
