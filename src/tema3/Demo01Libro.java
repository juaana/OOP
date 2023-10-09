/*
 Programa que instancia un objeto libro e inicializa sus v.i.s enviando mensajes set#
 */
package tema3;


public class Demo01Libro {

    public static void main(String[] args) {
        Libro libro = new Libro();
        Autor autor = new Autor();
        autor.setNombreAutor("Herbert Schildt");
        
        libro.setTitulo("Java: A Beginner's Guide");
        libro.setEditorial("McGraw-Hill");
        libro.setAñoEdicion(2014);
        libro.setPrimerAutor(autor);
        libro.setISBN("978-0071809252");
        libro.setPrecio(21.72);
        
        System.out.println(libro); // Invoca automáticamente al método toString
    }
}
