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
public class Turno {
    private String nombreDocente;
    private double sueldoDocente;
    private double costoCuota;
    private Alumno alumnosInscriptos [];
    private int capacidadAlumnos;
    private int dimL;
    
    
    public Turno(double unCostoCuota, double unSueldoDocente, String unNombreDocente, int unaCapacidadAlumnos){
        this.costoCuota = unCostoCuota;
        this.sueldoDocente = unSueldoDocente;
        this.nombreDocente = unNombreDocente;
        this.capacidadAlumnos = unaCapacidadAlumnos;
        this.alumnosInscriptos = new Alumno [this.capacidadAlumnos];
        
    }
    
    
    public void agregarAlumno(Alumno alumno){
        if (dimL < capacidadAlumnos){
            alumnosInscriptos[dimL] = alumno;
            dimL++;
        }
    }
    
    public double recaudacion(){
        double aux= this.costoCuota * dimL;
        aux= aux - sueldoDocente;
        return aux;
    }
    
    public String toString(){
        String aux= "";
        aux = "{Docente " + this.nombreDocente + ". ";
        
        for (int i = 0; i < dimL; i++) {
            aux+= "Alumno " + (i+1)+": " + alumnosInscriptos[i].toString()+ ". ";
        }
        aux+= "}";
        return aux;
        
    }
    
    
}
