/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenTurnoP2024;

/**
 *
 * @author juanazabaleta
 */
public class Pan extends Componente {
    private String calidad;

    public Pan(String calidad, String nombre, double costo) {
        super(nombre, costo);
        this.calidad = calidad;
    }

    
    @Override
    public double costoFinal(){
        double aux=0;
        if (this.calidad.equals("Premium")){
            aux= super.getCosto() * 1.20;
        }
        else{
            aux= super.getCosto();
        }
        return aux;
    };
    
    @Override
    public String toString(){
        String aux= "";
        aux= "Un pan: "+ super.toString() + "- Calidad "+ this.calidad;
        return aux;
    }    
    
}
