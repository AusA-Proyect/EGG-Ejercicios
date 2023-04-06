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
public class Guia5_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando 
        cuántos números son de 1 dígito, cuántos de 2 dígitos, 
        etcétera (hasta 5 dígitos).*/
        
        Scanner leer = new Scanner (System.in);
        int tamano, num;
        
        System.out.println("Ingrese el tamaño del Vector");
        tamano = leer.nextInt();
        
        int [] vector = new int [tamano];
        
        //Operacion llenado
        for (int i = 0; i < vector.length; i++ ) {
            vector [i] = (int) (Math.random() * 100000);
        }
        System.out.println(" ");
                
        //Mostrar datos del vector        
        String aux = " ";        
        for (int datos: vector ) {
            aux = aux + " " + datos;
        }
        System.out.println(aux);
        System.out.println(" ");
        //Mostrar datos del vector      
                
        System.out.println("Los numero con 1 digito son: " + contador1(vector));
        System.out.println("Los numero con 2 digito son: " + contador2(vector));
        System.out.println("Los numero con 3 digito son: " + contador3(vector));
        System.out.println("Los numero con 4 digito son: " + contador4(vector));
        System.out.println("Los numero con 5 digito son: " + contador5(vector));      
        
    }
    
    
    public static int contador1 (int [] vector) {
        
        int contador1 = 0;
                
        for (int i = 0; i <= vector.length-1; i++ ) {
            
            if (String.valueOf(vector[i]).length() == 1) {
                contador1 = contador1 + 1;
            }
        }

        return contador1;
    }
    
    public static int contador2 (int [] vector) {
        
        int contador2 = 0;
                
        for (int i = 0; i <= vector.length-1; i++ ) {
            
            if (String.valueOf(vector[i]).length() == 2) {
                contador2 = contador2 + 1;
            }
        }

        return contador2;
    }
    
    public static int contador3 (int [] vector) {
        
        int contador3 = 0;
                
        for (int i = 0; i <= vector.length-1; i++ ) {
            
            if (String.valueOf(vector[i]).length() == 3) {
                contador3 = contador3 + 1;
            }
        }

        return contador3;
    }
    
    public static int contador4 (int [] vector) {
        
        int contador4 = 0;
                
        for (int i = 0; i <= vector.length-1; i++ ) {
            
            if (String.valueOf(vector[i]).length() == 4) {
                contador4 = contador4 + 1;
            }
        }

        return contador4;
    }
    
    public static int contador5 (int [] vector) {
        
        int contador5 = 0;
                
        for (int i = 0; i <= vector.length-1; i++ ) {
            
            if (String.valueOf(vector[i]).length() == 5) {
                contador5 = contador5 + 1;
            }
        }

        return contador5;
    }
    
}
