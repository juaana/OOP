/*
 -A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
(iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.
 */
package tema3;

public class Estante {
    private Libro[] libros; // Un arreglo para almacenar los libros
    private int cantidadLibros; // La cantidad actual de libros en el estante

    public Estante() {
        libros = new Libro[20]; // Inicializar el arreglo para 20 libros
        cantidadLibros = 0; // Inicialmente no hay libros en el estante
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public boolean estaLleno() {
        return cantidadLibros == 20; // El estante está lleno si ya contiene 20 libros
    }

    public void agregarLibro(Libro unLibro) {
        if (!estaLleno()) {
            libros[cantidadLibros] = unLibro; // Agregar el libro al arreglo
            cantidadLibros++;
        } else {
            System.out.println("El estante está lleno. No se puede agregar más libros.");
        }
    }

    public String obtenerLibroPorTitulo(String tituloBuscado) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(tituloBuscado)) {
                return libros[i].toString();
            }
        }
        return "Libro no encontrado en el estante.";
    }
}
