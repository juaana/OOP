/*
 Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos.
- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local.
 */
package clase2;

import PaqueteLectura.Lector;
/**
 *
 * @author juanazabaleta
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimF=20;
        int i;
        int ganoRiver=0;
        int golesBocaLocal = 0; 
        String visitante;
        Partido [] partidos = new Partido [dimF];
        
        
        System.out.println("______________________________________");
        System.out.println("Ingrese el nombre del equipo visitante");
        visitante = Lector.leerString();
        
        
        
        for (i=0; i<dimF && !visitante.equals("ZZZ"); i++ ){
            partidos[i] = new Partido();
            partidos[i].setVisitante(visitante); 
            System.out.println("Ingrese la cantidad de goles del equipo visitante");
            partidos[i].setGolesVisitante(Lector.leerInt());
            System.out.println("Ingrese el nombre del equipo local");
            partidos[i].setLocal(Lector.leerString()); 
            System.out.println("Ingrese la cantidad de goles del equipo local");
            partidos[i].setGolesLocal(Lector.leerInt()); 
            System.out.println("______________________________________");
            System.out.println("Ingrese el nombre del equipo visitante");
            visitante = Lector.leerString();
        }
        
        
        for (i=0; i < dimF && partidos[i] != null; i++){ //Consultar si esta bien validar != null y si se puede recorrer asi y no con un while
            System.out.println(partidos[i].getLocal() +" "+  partidos[i].getGolesLocal() + " vs " +  partidos[i].getVisitante()+ " "+ partidos[i].getGolesVisitante() );
            if (partidos[i].getGanador().equalsIgnoreCase("River")){
                ganoRiver++;}
            
            if (partidos[i].getLocal().equalsIgnoreCase("Boca")) {
                golesBocaLocal+= partidos[i].getGolesLocal();
            } 
            
        }
        System.out.println("River gano "+ ganoRiver+ " partidos."); 
        System.out.println("Boca metió "+ golesBocaLocal+ " goles de local."); 

        
    }
    
    
}
