/*
5- Se dispone de la clase Partido (en la carpeta tema2). Un objeto partido representa un
encuentro entre dos equipos (local y visitante). Un objeto partido puede crearse sin
valores iniciales o enviando en el mensaje de creación el nombre del equipo local, el
nombre del visitante, la cantidad de goles del local y del visitante (en ese orden). Un objeto
partido sabe responder a los siguientes mensajes:

getLocal() retorna el nombre (String) del equipo local
getVisitante() retorna el nombre (String) del equipo visitante
getGolesLocal() retorna la cantidad de goles (int) del equipo local
getGolesVisitante() retorna la cantidad de goles (int) del equipo visitante
setLocal(X) modifica el nombre del equipo local al “String” X
setVisitante(X) modifica el nombre del equipo visitante al “String” X
setGolesLocal(X) modifica la cantidad de goles del equipo local al “int” X
setGolesVisitante(X) modifica la cantidad de goles del equipo visitante al “int” X
hayGanador() retorna un boolean que indica si hubo (true) o no hubo (false) ganador
getGanador() retorna el nombre (String) del ganador del partido (si no hubo retorna
un String vacío).
hayEmpate()retorna un boolean que indica si hubo (true) o no hubo (false) empate

1. Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato: a) La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos.
2. Luego de la carga:
a) Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
b) Calcular e informar la cantidad de partidos que ganó River.
c) Calcular e informar el total de goles que realizó Boca jugando de local.
 */
package tema2;

import PaqueteLectura.Lector;
public class Ej0502 {
    public static void main(String[] args) {
      int dimF= 20;
      int i=0;
      int contador = 0;
      Partido [] partidos = new Partido[dimF];
      
      int ganadosRiver= 0;
      int golesBocaLocal =0;
      System.out.println("Ingrese el nombre del equipo visitante");
      String visitante = Lector.leerString();
      while (i<20 && !visitante.equals("ZZZ")){
          
          partidos [i] = new Partido();
          partidos[i].setVisitante(visitante);
          System.out.println("Ingrese la cantidad de goles del equipo visitante");
          partidos[i].setGolesVisitante(Lector.leerInt());
          System.out.println("Ingrese el nombre del equipo local");
          partidos[i].setLocal(Lector.leerString());
          System.out.println("Ingrese la cantidad de goles del equipo local");
          partidos[i].setGolesLocal(Lector.leerInt());
          contador++;
          System.out.println("Ingrese el nombre del equipo visitante");
          visitante = Lector.leerString();
          i++;          
      }
      for (i=0; i<contador; i++){
          System.out.println("Partido " + (i+1) + ": " + partidos[i].getLocal() + " " + partidos[i].getGolesLocal()+ " VS " +  partidos[i].getVisitante() + " " + partidos[i].getGolesVisitante());
          if (partidos[i].getGanador().equals("River") ){
              ganadosRiver ++;
          }
          if (partidos[i].getLocal().equals("Boca")){
              golesBocaLocal += partidos[i].getGolesLocal();
          }
      }
      System.out.println("River ganó " + ganadosRiver + " partidos.");
      System.out.println("Boca metió " + golesBocaLocal + " goles jugando como local.");
      
    }  
}
