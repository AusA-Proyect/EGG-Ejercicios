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
public class Guia3_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Crear un programa que dado un número determine si es par o impar.
        */
        Scanner leer = new Scanner (System.in);
        int num;
        
        System.out.println("Ingresa el numero");
        num = leer.nextInt();
        
            if ( num%2 == 0) {
                System.out.println("El nuermo es PAR");
            }
            else {
                System.out.println("El numero es IMPAR");
            }
                
    }
    
}
