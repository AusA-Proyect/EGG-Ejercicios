/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class Guia5_ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es antisimétrica. 
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
        traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
        La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
        sus filas por columnas (o viceversa).*/
        
        Scanner leer = new Scanner (System.in);
        
        String enter = " ";
        
        int [][] matriz = new int [3] [3];
        int [][] matriz_anti = new int [3] [3];       
        Random num = new Random();
        
        // Otra forma de generar numeros random incluidos negativos
//        for(int i = 1; i<=5; i++) {
//            System.out.println(num.nextInt());
//        }
        
        
        //Operacion llenado con numeros al azar
        for (int x=0 ; x < matriz.length; x++ ) {
            for (int y=0 ; y < matriz.length; y++) {
                matriz [x][y]= num.nextInt(9-(-9)+1)+(-9); // NOMBRE.nextInt(HASTA-DESDE+1)+DESDE;
            }
        }
        System.out.println(enter);
        
        //Operacion llenado Matriz antisimétrica
        for (int x=0 ; x < matriz_anti.length; x++ ) {
            for (int y=0 ; y < matriz_anti.length; y++) {
                matriz_anti [y][x]= -matriz [x][y];         // Cambiando X por Y y Y por X y poniendo -matriz [x][y] para invertir los signos de los numeros de la matriz original 
            }
        }
        
        //Mostrar datos de la matriz    D
        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
        
        System.out.println(enter);
        //Mostrar datos de la matriz    H
        
        //Mostrar datos de la matriz    D
        for (int x=0; x < matriz_anti.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz_anti[x].length; y++) {
                System.out.print (matriz_anti[x][y]);
                if (y!=matriz_anti[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
        
        System.out.println(enter);
        //Mostrar datos de la matriz    H
        
    }
    
}
