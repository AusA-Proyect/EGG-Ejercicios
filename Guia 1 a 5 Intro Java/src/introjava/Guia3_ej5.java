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
public class Guia3_ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa en el cual se ingrese un valor limite positivo,
        y a continuacion solicite numeros al usuario hasta que la suma de los
        numeros introducidos supere el limite inicial.*/

        Scanner leer = new Scanner (System.in);
        
        int num, num2, suma = 0;
        System.out.println("Ingrese un numero tope");
        num = leer.nextInt();
        
        do {
            System.out.println("Ingrese el numero a sumar");
            num2 = leer.nextInt();
            suma = suma + num2;
            
        } while (suma < num);
            
        
        
    }
    
}
