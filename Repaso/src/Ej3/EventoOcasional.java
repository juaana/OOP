/*
 iii. El evento ocasional debe saber responder al mensaje actuar de manera distinta:
 Si es un show de beneficencia se imprime la leyenda “Recuerden colaborar con…“
seguido del nombre del contratante.

 Si es un show de TV se imprime “Saludos amigos televidentes”

 Si es un show privado se imprime “Un feliz cumpleaños para…” seguido del
nombre del contratante.
Independientemente del motivo del evento, luego se imprime el listado de temas como
lo hace cualquier recital.
 */
package Ej3;

/**
 *
 * @author juanazabaleta
 */
public class EventoOcasional extends Recital{
    private int numMotivo;
    private String nombreContratante;
    private int diaEvento;
    private String[] motivos = {"A beneficio",  "Show de TV", "Show privado"};
    private String[] saludos = {"Recuerden colaborar con ",  "Saludos amigos televidentes", "Un feliz cumpleaños para "};
    private int[] costos = {0, 50000, 150000};


    public EventoOcasional(int numMotivo, String nombreContratante, int diaEvento, String nombreBanda, int cantTemas) {
        super(nombreBanda, cantTemas);
        this.numMotivo = numMotivo - 1 ;
        this.nombreContratante = nombreContratante;
        this.diaEvento = diaEvento;
        
    }
    
    @Override
    public String actuar(){
        String aux= saludos[numMotivo];
        if (this.numMotivo != 1 ){
            aux += this.nombreContratante; 
        }
        return aux + "\n" + super.actuar();    
    }
    
    @Override
    public int calcularCosto(){
        return costos[this.numMotivo];
    }
}
