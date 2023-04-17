/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej2.entidades;

/**
 *
 * @author AusA
 */
public class Entidades {
    
    /* Orden:
    1.- Atributos
    2.- Constructores
    3.- Setter
    4.- Getter
    5.- Metodos funcionales o Funciones
    6.- ToStrings
    
    */
    
    //Guia 8 ejercicio 2
    
    //Atributos
    
    private double capacidadMaxima;
    private double cantidadActual;
    
    //Constructores
    
    public Entidades(){
        
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;  
        
    }
    
    public Entidades(double capacidadMaxima, double cantidadActual){
        
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;        
        
    }
    
    //Setter

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //Getters

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    @Override
    public String toString() {
        return "Entidades{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
