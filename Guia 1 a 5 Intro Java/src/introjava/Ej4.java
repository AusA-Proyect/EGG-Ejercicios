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
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        int num1,resultado;
        
        System.out.println("Ingresa los grados");
        num1 = leer.nextInt();
        
        System.out.println("Los grados en Farenheit son: " + (32 + (9 * num1 / 5)) + "° F");
    }
    
}
