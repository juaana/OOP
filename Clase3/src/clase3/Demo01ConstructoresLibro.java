/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package clase3;

/**
 *
 * @author vsanz
 */
public class Demo01ConstructoresLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 "Herbert Schildt","Herbert Schildt es un autor, programador y músico informático estadounidense. Ha escrito libros sobre varios lenguajes de programación. También fue miembro fundador de la banda de rock progresivo Starcastle .","Illinois, USA" ,"978-0071809252", 21.72);
        
        Libro libro2= new Libro("Learning Java by Building Android Games",  
                              "CreateSpace Independent Publishing", 
                               "John Horton","John Horton Conway (Liverpool, 26 de diciembre de 1937-Princeton, Nueva Jersey, 11 de abril de 2020) fue un prolífico matemático británico, especialista en la teoría de grupos (teoría de grupos finitos), teoría de nudos, teoría de números, teoría de juegos y teoría de códigos.","Liverpool, UK", "978-1512108347");
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Precio del libro2: " +libro2.getPrecio());
        System.out.println("Año edición del libro2: " +libro2.getAñoEdicion());
        System.out.println(libro2.getPrimerAutor());
        
        Libro libro3= new Libro(); 
    }
    
}
