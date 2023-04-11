/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejex2.Libreria;

import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class Libreria {
    
    /* Orden:
    1.- Atributos
    2.- Constructores
    3.- Setter
    4.- Getter
    5.- Metodos funcionales o Funciones
    6.- ToStrings
    
    */
    
    //Guia 7 ejercicio extra 2
    
    //Atributos
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double distancia;
    
    // Constructores
    public Libreria(){
        
    }
    
    //Setters

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    //Getters

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }
    
    //Metodos
    
    public void crearPuntos(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de X del primer punto ");
        x1 = leer.nextDouble();
        
        System.out.println("Ingrese el valor de Y del primer punto ");
        y1 = leer.nextDouble();
        
        System.out.println("Ingrese el valor de X del segundo punto ");
        x2 = leer.nextDouble();
        
        System.out.println("Ingrese el valor de Y del segundo punto ");
        y2 = leer.nextDouble();       
        
    }
    
    public void calcularDistancia(){
        
        //Formula de Pitagoras
        distancia = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
        
        System.out.println("La distancia entre el punto " + (int)x1 + "," + (int)y1 + " y el punto " + (int)x2 + "," + (int)y2 + " es de " + distancia);
    }
}
