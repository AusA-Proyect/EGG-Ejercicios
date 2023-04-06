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
public class Guia6_ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada 
        por números del 1 al 9 donde la suma de sus filas, 
        sus columnas y sus diagonales son idénticas. Crear un 
        programa que permita introducir un cuadrado por teclado 
        y determine si este cuadrado es mágico o no. El programa 
        deberá comprobar que los números introducidos son correctos, 
        es decir, están entre el 1 y el 9.*/
        
        Scanner leer = new Scanner (System.in);        
        
        int [][] matriz = new int [3] [3];
        
        for (int x=0 ; x < matriz.length; x++ ) {
            for (int y=0 ; y < matriz.length; y++) {
                matriz [x][y]= (int) (Math.random() * 10);
            }
        }
        
    }
    
}
