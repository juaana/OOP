/*
Implemente la clase Autor, sabiendo que se caracterizan por nombre, biografía y origen
y que deben permitir devolver/modificar el valor de sus atributos y devolver una
representación String formada por nombre, biografía y origen.
Luego realice las modificaciones necesarias en la clase Libro.
 */
package tema3;

public class Autor {
    private String nombre;
    private String biografia;
    private String origen;
    
    public Autor() {    
    }
    
    public Autor(String unNombre, String unaBiografia, String unOrigen) {
        nombre = unNombre;
        biografia = unaBiografia; 
        origen = unOrigen;
    }
    
    public String getNombreAutor() {
        return nombre;
    }
    
    public String getBiografiaAutor() {
        return biografia;
    }
    
    public String getOrigenAutor() {
        return origen;
    }
    
    public void setNombreAutor(String unNombre) {
        nombre = unNombre;
    }
    
    public void setBiografiaAutor(String unaBiografia) {
        biografia = unaBiografia; 
    }
    
    public void setOrigenAutor(String unOrigen) {
        origen = unOrigen;
    }
    
    public String autorToString() {
        String autor = "El nombre del autor es " + nombre + ", la biografía del autor es " + biografia + " y el origen del autor es " + origen;
        return autor;
    }
}
