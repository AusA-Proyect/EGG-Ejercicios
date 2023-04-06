/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia.atributos;

import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class Atributos {
    
    /* Orden:
    1.- Atributos
    2.- Constructores
    3.- Geter
    4.- Setter
    5.- Metodos funcionales o Funciones
    6.- ToStrings
    
    */
    
    //Guia 7 ejercicio 2
    
    //Atributos
    private double radio;
    private double area;
    private double perimetro;
    
    //Constructores
    public Atributos() {

    }
    
    public Atributos(double radio) {
        
        if (radio > 0) {
            this.radio = radio;
        }
        
    }

    //Seter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Getter
    public double getRadio() {
        return radio;
    }
    
    //Metodos
    
    public double crearCircunferencia() {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del radio ");
        this.radio = leer.nextDouble();
        
        return radio;
    }
    
    public double area() {
        
        this.area =(Math.PI*(radio*radio));        
        System.out.println("El area es " + area);
        
        return area;        
    }
    
    public double perimetro() {
        
        perimetro = (2*Math.PI*radio);
        System.out.println("El perimetro es " + perimetro);
        
        return perimetro;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Atributos{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
    
}
