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
public class Guia5_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
        y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
        se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).*/
        
        Scanner leer = new Scanner (System.in);
        
        String enter = " ";
        
        int [][] matriz = new int [4] [4];
        
        //Operacion llenado matriz
        for (int x=0 ; x < matriz.length; x++ ) {
            for (int y=0 ; y < matriz.length; y++) {
                matriz [x][y]= (int) (Math.random() * 10);
            }
        }
        System.out.println(enter);
        
        //Mostrar datos de la matriz    D
        
        for(int x=0 ; x < matriz.length; x++) {
            for(int y=0 ; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println();
        }
        
        System.out.println(enter);
        
        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
        
        System.out.println(enter);
        //Mostrar datos del vector  H
        
        // Mostrando al revez
        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[y][x]);   // Cambiando X por Y y Y por X
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
    
}
