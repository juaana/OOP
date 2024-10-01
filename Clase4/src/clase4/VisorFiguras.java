/*
 5-A- Modifique la clase VisorFiguras: ahora debe permitir guardar las figuras a mostrar (a
lo sumo 5) y también mostrar todas las figuras guardadas. Use la siguiente estructura.
 */
package clase4;

/**
 *
 * @author juanazabaleta
 */
public class VisorFiguras {
    private int guardadas=0;
    private int capacidadMaxima=5;
    private Figura [] vector;
    
    public VisorFiguras(){
        vector= new Figura[capacidadMaxima];
    }
    
    public void guardar(Figura f){
        if (quedaEspacio()){
        vector[guardadas] = f;
        guardadas++;}
        
    } 
    public boolean quedaEspacio(){
        if (this.guardadas < capacidadMaxima){
            return true;
        }
        else {
            return false;
        }
    }
    public void mostrar(){
        int i;
        for (i=0; i < this.guardadas; i++){
            System.out.println(vector[i]);
        }
    }   
    
    public int getGuardadas() {
        return guardadas;
    }
}
