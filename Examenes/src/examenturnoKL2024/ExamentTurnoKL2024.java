/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenturnoKL2024;

/**
 *
 * @author juanazabaleta
 */
public class ExamentTurnoKL2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SistemaEstadisticaAño SEA = new SistemaEstadisticaAño("Licenciatura en sistemas. Plan 2015", "Facultad de Informática", 2015, 2);
       SistemaEstadisticaTrimestre SET = new SistemaEstadisticaTrimestre("Licenciatura en sistemas. Plan 2015", "Facultad de Informática", 2015, 2);
       
       SEA.registrarEgresado(1, 2015, 20);
       SEA.registrarEgresado(2, 2015, 20);
       SEA.registrarEgresado(3, 2015, 20);
       SEA.registrarEgresado(4, 2015, 20);
       SEA.registrarEgresado(1, 2016, 20);
       SEA.registrarEgresado(2, 2016, 20);
       SEA.registrarEgresado(3, 2016, 20);
       SEA.registrarEgresado(4, 2016, 20);
       
       System.out.println("Egresados en el primer cuatrimestre del año 2015: "+ SEA.obtenerEgresados(1, 2015));
       System.out.println("Cantidad de trimestres con 20 egresados: " + SEA.cantidadDeTrimConEgresados(20));
       System.out.println(SEA.toString());
       
       
       
       SET.registrarEgresado(1, 2015, 20);
       SET.registrarEgresado(2, 2015, 20);
       SET.registrarEgresado(3, 2015, 20);
       SET.registrarEgresado(4, 2015, 20);
       SET.registrarEgresado(1, 2016, 20);
       SET.registrarEgresado(2, 2016, 20);
       SET.registrarEgresado(3, 2016, 20);
       SET.registrarEgresado(4, 2016, 20);
       
       System.out.println("Egresados en el primer cuatrimestre del año 2015: "+ SEA.obtenerEgresados(1, 2015));
       System.out.println("Cantidad de trimestres con 10 egresados: " + SET.cantidadDeTrimConEgresados(10));
       System.out.println(SET.toString());
       
       
       SistemaEstadisticaAño SEA1 = new SistemaEstadisticaAño("Ingeniería en computación. Plan 2011", "Facultad de Informática", 2011, 2);
       SistemaEstadisticaTrimestre SET1 = new SistemaEstadisticaTrimestre("Ingeniería en computación. Plan 2011", "Facultad de Informática", 2011, 2);
       
       SEA1.registrarEgresado(1, 2011, 10);
       SEA1.registrarEgresado(2, 2011, 10);
       SEA1.registrarEgresado(3, 2011, 10);
       SEA1.registrarEgresado(4, 2011, 10);
       SEA1.registrarEgresado(1, 2012, 10);
       SEA1.registrarEgresado(2, 2012, 10);
       SEA1.registrarEgresado(3, 2012, 10);
       SEA1.registrarEgresado(4, 2012, 10);
       
       System.out.println("Egresados en el primer cuatrimestre del año 2012: "+ SEA1.obtenerEgresados(1, 2012));
       System.out.println("Cantidad de trimestres con 20 egresados: " + SEA1.cantidadDeTrimConEgresados(20));
       System.out.println(SEA1.toString());
       
       SET1.registrarEgresado(1, 2011, 10);
       SET1.registrarEgresado(2, 2011, 10);
       SET1.registrarEgresado(3, 2011, 10);
       SET1.registrarEgresado(4, 2011, 10);
       SET1.registrarEgresado(1, 2012, 10);
       SET1.registrarEgresado(2, 2012, 10);
       SET1.registrarEgresado(3, 2012, 10);
       SET1.registrarEgresado(4, 2012, 10);
       
       System.out.println("Egresados en el primer cuatrimestre del año 2012: "+ SET1.obtenerEgresados(1, 2012));
       System.out.println("Cantidad de trimestres con 20 egresados: " + SET1.cantidadDeTrimConEgresados(20));
       System.out.println(SET1.toString());
    }
    
}
