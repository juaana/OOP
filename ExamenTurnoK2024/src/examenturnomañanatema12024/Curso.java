/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenturnomañanatema12024;

/**
 *
 * @author juanazabaleta
 */
public class Curso {
    private String descripcion;
    private Turno TO;
    private Turno TP;
    
    public Curso(String unaDescripcion, Turno turnoOnline, Turno turnoPresencial){
        this.descripcion = unaDescripcion;
        this.TO = turnoOnline;
        this.TP = turnoPresencial;
    }
    
    public void agregarAlumno(Alumno alumno){
        if (alumno.getLugarResidencia().equals("La Plata")){
            TP.agregarAlumno(alumno);
        }
        else{
            TO.agregarAlumno(alumno);
        }
    }
    
    public double gananciaMensual(){
        double aux = TO.recaudacion() + TP.recaudacion();
        return aux;
    }
    
    
    public boolean esRentable(){
        return this.gananciaMensual() > 800000;       
    }
    
    public String toString(){
        String aux= "Descripcion "+ this.descripcion + ". Ganancia mensual neta del curso "+ this.gananciaMensual()+ "\n";
        aux+= "Turno Online: " + TO.toString() + "\nTurno Presencial: " + TP.toString();
        return aux;
    }
    
    
    
}
