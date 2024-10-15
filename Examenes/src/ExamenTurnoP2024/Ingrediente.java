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
public class Ingrediente extends Componente{
    private String grupo;

    public Ingrediente(String grupo, String nombre, double costo) {
        super(nombre, costo);
        this.grupo = grupo;
    }
    
    @Override
    public double costoFinal(){
        double aux=0;
        if (this.grupo.equals("B")){
            aux= super.getCosto() * 1.10;
        }
        else{
            aux= super.getCosto();
        }
        return aux;
    };
    
    @Override
    public String toString(){
        String aux= "";
        aux= "Un ingrediente: "+ super.toString() + " - Grupo "+ this.grupo;
        return aux;
    }    
    
}
