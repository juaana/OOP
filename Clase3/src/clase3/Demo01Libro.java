/*
 Programa que instancia un objeto libro e inicializa sus v.i.s enviando mensajes set#
 */
package clase3;

/**
 *
 * @author vsanz
 */
public class Demo01Libro {

    /**
     * http://www.amazon.com/Java-Beginners-Guide-Herbert-Schildt/dp/0071809252/ref=sr_1_3?s=books&ie=UTF8&qid=1434108310&sr=1-3
     */
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Java: A Beginner's Guide");
        libro.setEditorial("Mcgraw-Hill");
        libro.setAñoEdicion(2014);
        Autor unAutor= new Autor("Herbert Schildt","Herbert Schildt es un autor, programador y músico informático estadounidense. Ha escrito libros sobre varios lenguajes de programación. También fue miembro fundador de la banda de rock progresivo Starcastle .","Illinois, USA");
        libro.setPrimerAutor(unAutor);
        libro.setISBN("978-0071809252");
        libro.setPrecio(21.72);
        System.out.println(libro.toString());
        System.out.println(libro); /* invoca automaticamente al metodo toString */
        System.out.println(libro.getPrimerAutor());
    }
    
}
