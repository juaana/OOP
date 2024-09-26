/*
 
 */
package clase3;

/**
 *
 * @author juanazabaleta
 */
public class Cliente {
    private String nombre;
    private int DNI;
    private int edad;
            
    public Cliente(){  
    }
    
    public Cliente(String unNombre, int unDNI, int unaEdad){
        nombre= unNombre;
        DNI=unDNI;
        edad = unaEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int unDNI) {
        this.DNI = unDNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }

    @Override
    public String toString() {
        return "Cliente: "+ nombre + ", DNI: " + DNI + ", edad: " + edad + ".";
    }
 
    
    
    
    
    
}
