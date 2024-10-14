/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author juanazabaleta
 */
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private String horaApertura;
    private String horaCierre;
    private int cantPiso;
    private int cantPlaza;
    private Auto [][] autos;
    
    
    public Estacionamiento(String unNombre,  String unaDireccion){
        this.nombre = unNombre;
        this.direccion = unaDireccion;
        this.horaApertura = "08:00";
        this.horaCierre = "21:00";
        this.cantPiso = 5;
        this.cantPlaza= 10;
        autos = new Auto[cantPiso][cantPlaza];
        for (int i = 0; i < cantPiso; i++) {
            for (int j = 0; j < cantPlaza; j++) {
                autos[i][j] = null;
            }
        }    
    }

    public Estacionamiento(String unNombre,  String unaDireccion, String unaHoraApertura, String unaHoraCierre, int unaCantPiso, int unaCantPlaza){
        this.nombre = unNombre;
        this.direccion = unaDireccion;
        this.horaApertura = unaHoraApertura;
        this.horaCierre = unaHoraCierre;
        this.cantPiso = unaCantPiso;
        this.cantPlaza = unaCantPlaza;
        
        autos = new Auto[cantPiso][cantPlaza];
        
        for (int i = 0; i < cantPiso; i++) {
            for (int j = 0; j < cantPlaza; j++) {
                autos[i][j] = null;
            }
        }    
    }
    
    public void ingresarAuto(int unPiso, int unaPlaza, Auto unAuto){    
        if (autos[unPiso-1][unaPlaza-1] == null){
            autos[unPiso-1][unaPlaza-1] = unAuto;
        }    
    }
    
    public String buscarAuto(String unaPatente) {
    String aux = "";
    int i = 0;
    boolean encontrado = false; 
    
    while (i < cantPiso && !encontrado) {
        int j = 0;
        while (j < cantPlaza && !encontrado) {
            if (autos[i][j] != null) {
                if (autos[i][j].getPatente().equals(unaPatente)) {
                    aux = "El auto con la patente " + unaPatente + " se encuentra en el piso " + (i + 1) + " plaza " + (j + 1);
                    encontrado = true; 
                } else {
                    aux = "Auto inexistente";
                }
            }
            j++;
        }
        i++;
    }
    
    return aux;
}

    
    
    public int cantAutosEnPlaza(int unaPlaza){
        int contador=0;
        for (int i = 0; i < cantPiso; i++) {
            if (autos[i][unaPlaza-1] != null){
                contador++;
            }
        }
        return contador;
    }
    
    public String toString(){
        String aux = "ESTACIONAMIENTO";
        for (int i = 0; i < cantPiso; i++) {
            for (int j = 0; j < cantPlaza; j++) {
                if (autos[i][j] != null){
                   aux+= "\n Piso "+ (i+1) + ", plaza "+ (j+1) + autos[i][j].toString();
                }
                else {
                    aux+= "\n Piso "+ (i+1) + ", plaza "+ (j+1) + ": Libre";
                }
                
            }
        }
        return aux;
    }
    
    
}