/*
De igual manera, incluya la clase Círculo a la jerarquía de figuras.
 */
package clase4;

/**
 *
 * @author juanazabaleta
 */
public class Circulo extends Figura {
    private double radio;

    
    public Circulo(double unRadio, String unColorRelleno, String unColorLinea ){
        super(unColorRelleno, unColorLinea);
        setRadio(unRadio);
    }

    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRadio(), 2); 
    }

     @Override
    public double calcularPerimetro(){
       return (2 * (getRadio() * Math.PI));
    }
    
    @Override
    public String toString(){
       String aux = super.toString() + ". Radio: " + this.radio;
       return aux;
    }
    
    
}
