/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author juanazabaleta
 */
public class Autor {
    private String nombre;
    private String biografia;    
    private String origen;
    
    public Autor(String unNombre, String unaBiografia, String unOrigen){
        nombre = unNombre;
        biografia = unaBiografia;
        origen = unOrigen;
    }
    
    public Autor(){
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setBiografia(String unaBiografia){
        biografia = unaBiografia;
    }
    
    public void setOrigen(String unOrigen){
        origen = unOrigen;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getBiografia(){
        return biografia;
    }
    
    public String getOrigen(){
        return origen;
    }
    
    public String toString(){
        String aux;
        aux= nombre + " Biografia: " + biografia + " Origen: "+ origen;
        return (aux);
    }

}
