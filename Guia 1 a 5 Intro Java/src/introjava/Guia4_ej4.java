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
public class Guia4_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una función
        se lo pasamos por parámetro para que nos indique si es o no un número primo, 
        debe devolver true si es primo, sino false.
        Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
        Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
        */
        
        Scanner leer = new Scanner (System.in);
        int num;
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();        
        
        System.out.println("¿Su numero ingresado es primo? " + primo(num));
    }
    
    public static boolean primo (int numero) {
        
        int residuo, contador = 0;
        boolean respuesta = false;
        
        for (int i=1; i<=numero;i++) {
            
            residuo = numero%i; // aplico MOD y veo cuanto es el residuo
            
            if (residuo==0) {
                contador = contador + 1;
            }            
        }
        
        //El contador siempre tiene que sumar hasta 2 para que sea primo
        if (contador==2) {
            respuesta = true;
        }
                
        return respuesta;
    }
    
}
