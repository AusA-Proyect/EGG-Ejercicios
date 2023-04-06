package introjava;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AusA
 */
public class Guia3_ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        
        ****
        *  *
        *  *
        ****
        */
        
        Scanner leer = new Scanner (System.in);
        
        int num;
        
        System.out.println("Ingrese el valor de N");
        num = leer.nextInt();
        
        System.out.println("");  // Enter
        
        for(int i=1 ; i<=num ; i++) {
            for(int j=1 ; j<=num ; j++) {
                if (j==num) {
                    System.out.println("*");
                }
                 else if (i == 1 || i == num) {
                    System.out.print("*");

                } else if (j > 1 && j < num) {
                    System.out.print(" ");

                } else if (j == 1) {
                    System.out.print("*");
                }               
            }
        }
        System.out.println("");  // Enter
    }
    
}
