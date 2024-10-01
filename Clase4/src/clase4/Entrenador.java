/*
 Los entrenadores son empleados que se caracterizan por la cantidad de campeonatos
ganados.
 */
package clase4;

/**
 *
 * @author juanazabaleta
 */
public class Entrenador extends Empleado{
    private int cantCampeonatosGanados;
   
    public Entrenador(String unNombre, double unSueldoBasico, int unaAntiguedad, int unaCantCampeonatosGanados) {
        super(unNombre, unSueldoBasico, unaAntiguedad);
        this.cantCampeonatosGanados = unaCantCampeonatosGanados;
    }

    public int getCantCampeonatosGanados() {
        return cantCampeonatosGanados;
    }

    public void setCantCampeonatosGanados(int unaCantCampeonatosGanados) {
        this.cantCampeonatosGanados = unaCantCampeonatosGanados;
    }
    
    
    @Override
    public double calcularEfectividad(){
        return this.cantCampeonatosGanados / getAntiguedad();
    }
    @Override
    public double calcularSueldoACobrar(){
        if (this.cantCampeonatosGanados > 0  && this.cantCampeonatosGanados <= 4){
        return calcularSueldo() + 5000;
        }
        else{
            if (this.cantCampeonatosGanados >= 5 && this.cantCampeonatosGanados <= 10){
                return calcularSueldo() + 30000;      
            }
            else {
                if (this.cantCampeonatosGanados > 10) {
                    return calcularSueldo() + 50000; 
                }
                else {
                    return calcularSueldo();
                }
            }
        }
    }
    
}
