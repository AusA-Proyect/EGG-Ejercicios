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
public class Guia5_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector de tamaño N con 
        valores aleatorios y le pida al usuario un número a buscar 
        en el vector. El programa mostrará dónde se encuentra el numero
        y si se encuentra repetido*/
        
        Scanner leer = new Scanner (System.in);
        int tamano, num;
        
        System.out.println("Ingrese el tamaño del Vector");
        tamano = leer.nextInt();
        
        int [] vector = new int [tamano];
        
        //Operacion
        for (int i = 0; i < vector.length; i++ ) {
            vector [i] = (int) (Math.random() * 10);
        }
        System.out.println(" ");
                
//        //Mostrar datos del vector        
//        String aux = " ";        
//        for (int datos: vector ) {
//            aux = aux + " " + datos;
//        }
//        System.out.println(aux);
//        System.out.println(" ");
//        //Mostrar datos del vector
        
        System.out.println("Ingrese el numero a buscar del 0 al " + vector.length );
        num = leer.nextInt();
        System.out.println(" ");
        
        int cantidad;
        
        cantidad = buscar(num, vector);
    
        System.out.println("Su numero se repitio " + cantidad + " veces.");
        
        
    }
    
public static int buscar (int num, int [] vector) {
        
    int contador = 0;       
    
    System.out.print("Su numero esta en la posicion: ");
            
    for (int i = 0; i <= vector.length-1; i++ ) {
            if (num != vector[i]) {
            }
            else {
                System.out.print(i + ", ");
                contador = contador + 1;
            }
    }
    System.out.println(" ");
    System.out.println(" ");
    
    return contador;
    }
    
}
