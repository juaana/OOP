/*
 B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
    busque e informe el autor del libro “Mujercitas”.
 */
package clase3;
import PaqueteLectura.Lector;
/**
 *
 * @author juanazabaleta
 */
public class Ej3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nLibros;
        
        System.out.println("Ingrese la cantidad de libros que se encuentran en el estante");
        nLibros = Lector.leerInt();
        Estante estante = new Estante(nLibros);  // Crear un nuevo estante
        
        // Cargar varios libros en el estante
        for (int i = 0; i < nLibros; i++) {
            // Crear una nueva instancia de Libro y Autor en cada iteración
            Libro libro = new Libro();
            Autor autor = new Autor();

            System.out.println("Ingrese el título del libro número " + (i + 1));
            libro.setTitulo(Lector.leerString());

            System.out.println("Ingrese el nombre del autor del libro número " + (i + 1));
            autor.setNombre(Lector.leerString());
            System.out.println("Ingrese la biografía del autor del libro número " + (i + 1));
            autor.setBiografia(Lector.leerString());
            System.out.println("Ingrese el origen del autor del libro número " + (i + 1));
            autor.setOrigen(Lector.leerString());
            libro.setPrimerAutor(autor);  // Asignar el autor al libro

            System.out.println("Ingrese la editorial del libro número " + (i + 1));
            libro.setEditorial(Lector.leerString());
            System.out.println("Ingrese el ISBN del libro número " + (i + 1));
            libro.setISBN(Lector.leerString());
            System.out.println("Ingrese el año de edición del libro número " + (i + 1));
            libro.setAñoEdicion(Lector.leerInt());
            System.out.println("Ingrese el precio del libro número " + (i + 1));
            libro.setPrecio(Lector.leerDouble());

            // Agregar el libro al estante
            estante.agregarLibro(libro);
        }

        // Buscar e informar el autor del libro "Mujercitas"
        System.out.println("Buscando el autor del libro 'Mujercitas'...");
        String autorMujercitas = estante.buscarAutorDeLibro("Mujercitas");
        System.out.println(autorMujercitas);
    }
    
}
