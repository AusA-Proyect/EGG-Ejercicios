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
public class IntroJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
                
        String frase;
        
        System.out.println("Ingresa una frase");
        frase = leer.nextLine(); // Guarda el nombre en la variable "nombre"
        
        System.out.println(frase.toUpperCase()); // Seria "frase".toUpperCase para convertir la frase en MAYUSCULA
        
        System.out.println(frase.toLowerCase()); // Igual que el anterior pero en MINUSCULA

        
    }
    
}
