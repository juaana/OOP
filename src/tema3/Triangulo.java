/*
Nota: Trabajar sobre la carpeta “tema3” del proyecto
1-A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)
B- Realizar un programa que instancie un triángulo, le cargue información leída desde
teclado e informe en consola el perímetro y el área.
NOTA: Calcular el área con la fórmula Área = √s(s − a)(s − b)(s − c) , donde a, b y c son
los lados y s =
𝐚+𝐛+𝐜
2
. La función raíz cuadrada es Math.sqrt(#)
 */
package tema3;

/**
 *
 * @author jjuan
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String relleno;
    private String colorLinea; 
    
    
    public Triangulo (double ladoUno,double ladoDos,double ladoTres, String unRelleno, String unColorLinea){
        lado1 = ladoUno;
        lado2 = ladoDos;
        lado3 = ladoTres;
        relleno = unRelleno;
        colorLinea = unColorLinea;        
    }
    
    public Triangulo(){
     
    }

    public double getLadoUno() {
        return lado1;
    }

    public double getLadoDos() {
        return lado2;
    }

    public double getLadoTres() {
        return  lado3;
    }
    
    public String getColorRelleno() {
        return  relleno;
    }

    public String getColorLinea() {
        return  colorLinea;
    }

    public void setLadoUno(double ladoUno) {
        lado1 = ladoUno;
    }

    public void setLadoDos(double ladoDos) {
        lado2 = ladoDos;
    }
    public void setLadoTres(double ladoTres) {
        lado3 = ladoTres;
    }

    public void setColorRelleno(String unRelleno) {
        relleno = unRelleno;
    }

    public void setColorLinea(String unColorLinea) {
        colorLinea = unColorLinea;
    }
    
    public double getCalcularPerimetro(){
        double perimetro;
        perimetro = lado1 + lado2 + lado3;
        return perimetro;    
    }
    
    public double getCalcularArea() {
    double s = (lado1 + lado2 + lado3) / 2;
    double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    return area;
}

}
