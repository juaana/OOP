/*
Los jugadores son empleados que se caracterizan por el número de partidos jugados y
el número de goles anotados.
 */
package clase4;

/**
 *
 * @author juanazabaleta
 */
public class Jugador extends Empleado {
    private int partidosJugados;
    private int numeroGoles;

    public Jugador(String unNombre, double unSueldoBasico, int unaAntiguedad, int unosPartidosJugados, int unNumeroGoles) {
        super(unNombre, unSueldoBasico, unaAntiguedad);
        this.partidosJugados = unosPartidosJugados;
        this.numeroGoles = unNumeroGoles;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int unosPartidosJugados) {
        this.partidosJugados = unosPartidosJugados;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int unNumeroGoles) {
        this.numeroGoles = unNumeroGoles;
    }
    
    @Override
    public double calcularEfectividad(){
        return this.numeroGoles / this.partidosJugados;
    }
    
    @Override
    public double calcularSueldoACobrar(){
        if (calcularEfectividad() >= 0.5) {
            return calcularSueldo() *2; 
        }
        else {
            return calcularSueldo();
        }
    }
    
}
