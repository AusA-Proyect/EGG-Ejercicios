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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        int num;
        System.out.println("Ingresa un numero");
        num = leer.nextInt();
        
        System.out.println("El doble es: " + (num * 2 ));
        System.out.println("El triple es: " + (num * 3 ));
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));
        
    }
    
}
