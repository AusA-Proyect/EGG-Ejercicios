/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author AusA
 */
public class Guia5_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector con los 100 primeros
        números enteros y los muestre por pantalla en orden descendente.*/
        
        int [] vector = new int [101];
        
        for (int i = 0; i < vector.length; i++ ) {
            vector [i] = i;
        }
        
        for (int j = vector.length - 1; j >= 0; j-- ) {
            System.out.println(" El numero es " + j);
        }
    }
    
}
