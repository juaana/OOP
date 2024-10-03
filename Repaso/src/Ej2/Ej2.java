/*
 Realice un programa que instancie un estacionamiento con 3 pisos y 3 plazas por piso.
Registre 6 autos en el estacionamiento en distintos lugares.
Muestre la representación String del estacionamiento en consola.
Muestre la cantidad de autos ubicados en la plaza 1.
Lea una patente por teclado e informe si dicho auto se encuentra en el estacionamiento
o no. En caso de encontrarse, la información a imprimir es el piso y plaza que ocupa.
 */
package Ej2;

import PaqueteLectura.Lector;
/**
 *
 * @author juanazabaleta
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento("TeLoGuardo", "Calle falsa 1234", "05:00", "05:10", 3, 3);
        
        Auto auto1= new Auto("John Doe", "AAA111");
        Auto auto2= new Auto("Juan", "BBB222");
        Auto auto3= new Auto("Pedro", "CCC333");
        Auto auto4= new Auto("Carlos", "DDD444");
        Auto auto5= new Auto("Franco", "EEE555");
        Auto auto6= new Auto("Felipe", "FFF666");
        
        estacionamiento.ingresarAuto(1, 1, auto1);
        estacionamiento.ingresarAuto(1, 2, auto2);
        estacionamiento.ingresarAuto(1, 3, auto3);
        estacionamiento.ingresarAuto(2, 1, auto4);
        estacionamiento.ingresarAuto(2, 2, auto5);
        estacionamiento.ingresarAuto(2, 3, auto6);
        
        System.out.println(estacionamiento.toString());
        System.out.println("En la plaza 1 hay "+ estacionamiento.cantAutosEnPlaza(1) + " autos estacionados.");
        
        
        System.out.println("Ingrese el número de patente a buscar.");
        String autoBuscado = estacionamiento.buscarAuto(Lector.leerString());
        
        System.out.println(autoBuscado);
        
        
        
        
        
                
    }
    
}
