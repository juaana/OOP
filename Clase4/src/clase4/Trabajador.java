/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author juanazabaleta
 */
public class Trabajador extends Persona {
    private String tipoTrabajo;
    
    public Trabajador(String unNombre, int unDNI , int unaEdad, String unTipoTrabajo){
        super(unNombre, unDNI, unaEdad);
        this.tipoTrabajo = unTipoTrabajo;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String unTipoTrabajo) {
        this.tipoTrabajo = unTipoTrabajo;
    }
    
    @Override
    public String toString(){
        String aux = super.toString() + " Soy " + this.tipoTrabajo;
        return aux;
    }
    
    
    
}
