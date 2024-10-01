/*
B- Cualquier empleado debe responder al mensaje calcularEfectividad. La efectividad
del entrenador es el promedio de campeonatos ganados por año de antigüedad, mientras
que la del jugador es el promedio de goles por partido.
 */
package clase4;
public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;
    private int antiguedad;
    
    
    public Empleado(String unNombre, double unSueldoBasico, int unaAntiguedad){
        this.nombre = unNombre;
        this.sueldoBasico = unSueldoBasico;
        this.antiguedad = unaAntiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double unSueldoBasico) {
        this.sueldoBasico = unSueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int unaAntiguedad) {
        this.antiguedad = unaAntiguedad;
    }
    
    
    public abstract double calcularEfectividad();
    
    
    
    public double calcularSueldo(){
        double porcentaje = ((10 / 100) * this.sueldoBasico);
        return (this.sueldoBasico + (porcentaje * this.antiguedad));
    }
    
    public abstract double calcularSueldoACobrar();
    
    public String toString(){
        return ("Nombre " + nombre + ". Sueldo: "+ calcularSueldoACobrar() + ". Efectividad: "+ calcularEfectividad());
    }
    
    
    
}
