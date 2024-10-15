/*
 Realice un programa que instancie un curso. Agregue algunos alumnos al curso. Imprima la representación String
del curso y si es rentable o no.
 */
package examenturnomañanatema12024;

/**
 *
 * @author juanazabaleta
 */
public class ExamenTurnoMañanaTema12024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Turno Tpresencial = new Turno(1000000, 5, "Pepe", 2);
        Turno Tonline = new Turno(20000000, 10, "John Doe", 1);
        
        Curso cursoIngles = new Curso("Bla bla bla", Tonline, Tpresencial);
        
        Alumno alumno1 = new Alumno(12345, "Jejej", "La Plata");
        Alumno alumno2 = new Alumno(2222, "fjdsadn", "La Plata");
        Alumno alumno3 = new Alumno(12121212, "Jejej", "Un lugar");
        
        cursoIngles.agregarAlumno(alumno1);
        cursoIngles.agregarAlumno(alumno2);
        cursoIngles.agregarAlumno(alumno3);
        
        System.out.println(cursoIngles.toString());
        System.out.println("¿El curso de inglés es rentable? " + cursoIngles.esRentable());
    }
    
}
