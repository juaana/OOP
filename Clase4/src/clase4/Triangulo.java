/*
 1-A- Incluya la clase Triángulo a la jerarquía de figuras vista (carpeta tema4). Triángulo
debe heredar de Figura todo lo que es común y definir su constructor y sus atributos y
métodos propios. Además debe redefinir el método toString.
 */
package clase4;

/**
 *
 * @author juanazabaleta
 */
public class Triangulo extends Figura{
    private double lado1;
    private double lado2;
     private double lado3;
     
     
    public Triangulo(double lado1,double lado2,double lado3, String unColorR, String unColorL){
        super(unColorR,unColorL);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);

    } 
    
    public double getLado1(){
        return this.lado1;       
    }
    public double getLado2(){
        return this.lado2;       
    }
        
    public double getLado3(){
        return this.lado3;       
    }
    
    
    
    
  
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }
    
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }
    
    public void setLado3(double lado3){
        this.lado3 = lado3;
    }
    
    @Override
    public double calcularArea(){
        double s = calcularPerimetro() / 2;  // Semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    
     @Override
    public double calcularPerimetro(){
       return (getLado1() + getLado2() + getLado3() );
    }
    
     @Override
    public String toString(){
       String aux = super.toString() + 
                    " Lado 1: " + getLado1() + ", Lado 2: " + getLado2() + ", Lado 3: " + getLado3();
       return aux;
    }
    
}
