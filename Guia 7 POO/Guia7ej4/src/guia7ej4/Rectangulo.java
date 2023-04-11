/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej4;

import guia7ej4.Atributos.Atributos;

/**
 *
 * @author AusA
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Atributos Rectangulo = new Atributos();
        
        Rectangulo.datosRectangulo();
        
        System.out.println("El rectangulo se creo correctamente.");        
        System.out.println("Tiene una superficie de " + Rectangulo.superficie());
        System.out.println("Tiene un perimetro de " + Rectangulo.perimetro() + "cm");
        
        System.out.println("Dibujando el rectangulo ");
        Rectangulo.crearRectangulo();
        
    }
    
}
