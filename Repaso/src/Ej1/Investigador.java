/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author juanazabaleta
 */
public class Investigador {
    private int maxSub = 5;
    private String nombreCompleto;
    private int categoria;
    private String especialidad;
    private Subsidio [] subsidios;

    public Investigador(String nombreCompleto, int categoria, String especialidad) {
        this.nombreCompleto = nombreCompleto;
        this.categoria = categoria;
        this.especialidad = especialidad;
        subsidios = new Subsidio[maxSub];
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    
    
   public void agregarSubsidio(Subsidio unSubsidio){
       int i = 0;
       while(i < maxSub && subsidios[i]!= null){
           i++;
       }
       
       if (subsidios[i] == null ){
           subsidios[i] = unSubsidio;
       }
       
   }
   
   public double totalEnSubsidios(){
        int i=0;
        double totalSubsidios = 0;
        while(i < maxSub && subsidios[i]!= null){
            if(subsidios[i].isOtorgado() == true ){
                totalSubsidios += subsidios[i].getMontoPedido();
            }
            i++;
        }
        return totalSubsidios;
   }
    
   public void otorgarSubsidios(){
       int i=0 ;
       while(i < maxSub && subsidios[i]!= null){
           subsidios[i].setOtorgado(true);
           i++;
       }
   }
    
    
}
