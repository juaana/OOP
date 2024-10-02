/*
iii) Escriba un programa que instancie un proyecto con tres investigadores. Agregue dos
subsidios a cada investigador y otorgue los subsidios de uno de ellos. Luego imprima
todos los datos del proyecto en pantalla.
 */
package Ej1;

/**
 *
 * @author juanazabaleta
 */
public class InstanciarProyecto {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Proyecto 1", 1, "Pepito");
        
        Investigador investigador1 = new Investigador("Investigador 1", 2, "Todologo");
        proyecto.agregarInvestigadorAlProyecto(investigador1);
        
        Subsidio subsidio1 = new Subsidio(10, "Porque si");
        investigador1.agregarSubsidio(subsidio1);
        
        Subsidio subsidio2 = new Subsidio(10, "Porque no");
        investigador1.agregarSubsidio(subsidio2);
        
        
        
        Investigador investigador2 = new Investigador("Investigador 2", 3, "Duendologo");
        proyecto.agregarInvestigadorAlProyecto(investigador2);
        
        Subsidio subsidio3 = new Subsidio(5, "Porque si");
        investigador2.agregarSubsidio(subsidio3);
        
        Subsidio subsidio4 = new Subsidio(5, "Porque no");
        investigador2.agregarSubsidio(subsidio4);
        
        
        Investigador investigador3 = new Investigador("Investigador 3", 4, "Chismoso");
        proyecto.agregarInvestigadorAlProyecto(investigador3);
        Subsidio subsidio5 = new Subsidio(2, "Porque si");
        investigador3.agregarSubsidio(subsidio5);
        Subsidio subsidio6 = new Subsidio(2, "Porque no");
        investigador3.agregarSubsidio(subsidio6);
        
        proyecto.otorgarTodos("Investigador 1");
        
        
        System.out.println(proyecto.toString());
        
    }
    
}
