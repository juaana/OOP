/*
1-A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)
 */
package clase3;

/**
 *
 * @author juanazabaleta
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorRelleno;
    private String colorLinea;
    /**
     * @param args the command line arguments
     */
    public Triangulo (double unLado1, double unLado2, double unLado3, String unColorRelleno, String unColorLinea) {
        lado1 = unLado1;
        lado2 = unLado2;
        lado3 = unLado3;
        colorRelleno = unColorRelleno;
        colorLinea = unColorLinea; 
    }
    public Triangulo(){
        
    }
    
    public double getLado1(){
        return lado1;
    }
    
    public double getLado2(){
        return lado2;
    }
    public double getLado3(){
        return lado3;
    }
    
    public String getColorRelleno(){
        return colorRelleno;
    }
    
    public String getColorLinea(){
        return colorLinea;
    }
    
    public void setLado1(double unLado1){
        lado1 = unLado1;
        
    }
    public void setLado2(double unLado2){
        lado2 = unLado2;
    }
    public void setLado3(double unLado3){
        lado3 = unLado3;
    }
    public void setColorRelleno(String unColorRelleno){
        colorRelleno = unColorRelleno;
    }
    public void setColorLinea(String unColorLinea){
        colorLinea = unColorLinea;
    }
    
    public double calcularPerimetro(){
        return (lado1+lado2+lado3);
    }
    
   public double calcularArea() {
        double s = calcularPerimetro() / 2;  // Semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
   
    
    
}
