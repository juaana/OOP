/*
 La gira debe responder al mensaje actuar de manera distinta. Imprime la leyenda
“Buenas noches …” seguido del nombre de la ciudad de la fecha “actual”. Luego
debe imprimir el listado de temas como lo hace cualquier recital. Además debe
establecer la siguiente fecha de la gira como la nueva “actual”.
 */
package Ej3;

/**
 *
 * @author juanazabaleta
 */
public class Gira extends Recital{
    private String nombre;
    private Fecha fechas[];
    private int proxFecha;
    private int cantFechas;
    private int dimLCantFechas;

    public Gira(String nombre, String nombreBanda, int cantTemas, int cantFechas) {
        super(nombreBanda, cantTemas);
        this.nombre = nombre;
        this.cantFechas = cantFechas;
        this.fechas = new Fecha[this.cantFechas];
        this.dimLCantFechas = 0;
        this.proxFecha=0;
    }
    
    public void agregarFecha(Fecha fecha){
        if (dimLCantFechas < cantFechas){
        fechas [dimLCantFechas] = fecha;
        this.dimLCantFechas++;
        }
    }

    @Override 
    public String actuar(){
        String aux= " ";
        aux = "Buenas noches " + fechas[proxFecha].getCiudad();
        if (proxFecha < this.cantFechas){
            proxFecha++;
        }
        return aux + "\n" + super.actuar();
    }
    
    @Override
    public int calcularCosto(){
        int aux = 0 ;
        for (int i = 0; i < dimLCantFechas ; i++) {
            aux+= 3000;
        }
        return aux;
    }    
    
    
    
}
