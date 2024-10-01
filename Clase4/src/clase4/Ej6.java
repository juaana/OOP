/*

f) Realice un programa principal que cree un Sistema con reporte anual para 3 años
consecutivos a partir del 2021, para la estación La Plata (latitud -34.921 y longitud -
57.955). Cargue todas las temperaturas (para todos los meses y años). Informe los
promedios anuales, y el mes y año en que se registró la mayor temperatura.



Luego cree un Sistema con informe mensual para 4 años a partir de 2020, para la
estación Mar del Plata (latitud -38.002 y longitud -57.556). Cargue todas las
temperaturas (para todos los meses y años). Informe los promedios mensuales, y el
mes y año en que se registró la mayor temperatura.
NOTA: Preste atención de no violar el encapsulamiento al resolver el ejercicio.
 */
package clase4;
import PaqueteLectura.GeneradorAleatorio; 
/**
 *
 * @author juanazabaleta
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacion estacion1 = new Estacion("La Plata", -34921 , 57955);
        RegistroTemperaturasAño registroTempAño = new RegistroTemperaturasAño(3, 2021, estacion1);     
        for (int i = 0; i < registroTempAño.getCantidadAños(); i++) {
            for (int j = 0; j < registroTempAño.getMeses(); j++) {
                 registroTempAño.registrarTemperatura(j, i, GeneradorAleatorio.generarDouble(30));
            }
        }
        System.out.println(registroTempAño.mesAñoConMasTemperatura());
        System.out.println(registroTempAño);
        
        
        Estacion estacion2 = new Estacion("Mar del Plata", -38002 , -57.556);
        RegistroTemperaturasMeses registroTempMeses = new RegistroTemperaturasMeses(4, 2020, estacion2);
        for (int i = 0; i < registroTempMeses.getCantidadAños(); i++) {
            for (int j = 0; j < registroTempMeses.getMeses(); j++) {
                 registroTempMeses.registrarTemperatura(j, i, GeneradorAleatorio.generarDouble(30));
            }
        }
        System.out.println(registroTempMeses.mesAñoConMasTemperatura());
        System.out.println(registroTempMeses);
        
    }
    
}
