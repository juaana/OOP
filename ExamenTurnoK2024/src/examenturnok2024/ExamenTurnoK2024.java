/*
 Realice un programa que instancle una empresa informática con un líder. Agregue algunos programadores a la empresa.
Aumente los sueldos básicos de todos los programadores de la empresa en un monto. Muestre la
representación String de la empresa.
 */
package examenturnoK2024;

/**
 *
 * @author juanazabaleta
 */
public class ExamenTurnoK2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProgramadorLider programadorlider = new ProgramadorLider(1, 1, "Pepito", 313213, 1000000, 10, "Java");
        Empresa empresa = new Empresa("Tequieromucho", programadorlider, 2);
        Programador programador1= new Programador("Franco", 42423, 1000000, 10, "Java");
        Programador programador2= new Programador("Juana", 423242, 1000000, 201, "JavaScript");
        empresa.agregarProgramador(programador1);
        empresa.agregarProgramador(programador2);
        empresa.aumentarSueldosBasicos(1); 
        System.out.println(empresa.toString());
        
        
        
        
        
        
    }
    
}
