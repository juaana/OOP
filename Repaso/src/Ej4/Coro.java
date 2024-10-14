/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author juanazabaleta
 */
public abstract class Coro {
    private String nombre;
    private Director director;

    public Coro(Director director) {
        this.director = director;
    }
    
    public abstract void agregarCorista(Corista corista);
    
    public abstract boolean estaLleno();
    public abstract boolean estaOrdenado();
    
    public String toString(){
        String aux= "Nombre del coro: " + nombre + director.toString();
        return aux;
    }
}
