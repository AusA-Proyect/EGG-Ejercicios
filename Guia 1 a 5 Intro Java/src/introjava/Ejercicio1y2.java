/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class Ejercicio1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int num1,num2,resultado;
        
        System.out.println("Ingresa el primero numero a sumar");
        num1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero a sumar ");
        num2 = leer.nextInt();
        
        System.out.println("El resultado de la suma es: " + (num1 + num2));
        
        String nombre;
        
        System.out.println("Ingresa tu nombre");
        nombre = leer.next(); // Guarda el nombre en la variable "nombre"
        
        System.out.println("Hola " + nombre + " como estas?");
        
    }
    
}
