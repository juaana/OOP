/*
 3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
(iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.
B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
busque e informe el autor del libro “Mujercitas”.
C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que
almacenen como máximo N libros? ¿Cómo instanciaría el estante?
 */
package clase3;

/**
 *
 * @author juanazabaleta
 */
public class Estante {
    private Libro[] libros;
    private int cantidadLibros;
    private int cuantosLibros;
    private int nLibros;
    
    public Estante(int nLibros){
        libros = new Libro[nLibros];  // El estante puede almacenar hasta 20 libros
        cantidadLibros = 0;
    }
    
    public int getCantidadLibros() {
        return cantidadLibros;
    }
    
    public boolean estaLleno() {
        return cantidadLibros >= nLibros;  
    }
    
    
  public String cualEsElLibro(String unTitulo){
    int i;
    for (i = 0; i < nLibros && libros[i] != null; i++) {  //Cambiar a while
        if (libros[i].getTitulo().equals(unTitulo)) {
            return libros[i].toString(); 
        }
    }
    return "No se encontró el libro";
}
    
  public String buscarAutorDeLibro(String titulo) {
    for (int i = 0; i < cantidadLibros; i++) {
        if (libros[i].getTitulo().equals(titulo)) {
            return "El autor de " + titulo + " es " + libros[i].getPrimerAutor();
        }
    }
    return "No se encontró el libro " + titulo;
}
    
    public String agregarLibro(Libro unLibro){
        if (cantidadLibros < nLibros){
            libros[cantidadLibros] = unLibro;
            cantidadLibros++;
            return "El libro se añadió con éxito";
        }
        else {
            return "El estante se encuentra lleno";
        } 
    }
    
    
    
}
