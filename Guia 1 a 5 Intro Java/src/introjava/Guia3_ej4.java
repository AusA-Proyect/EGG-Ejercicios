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
public class Guia3_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa que pida una frase o palabra y valide si la primera
        letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se debera 
        de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
        se debera imprimir “INCORRECTO”. Nota: investigar la funcion Substring y equals() de Java.*/
        
        Scanner leer = new Scanner (System.in);
        
        String frase;
        
        System.out.println("Ingresa una palabra o una frase");
        frase = leer.nextLine();
        
        if (frase.substring(0, 1).equals("A")) {
                System.out.println("CORRECTO");
            }
        else {
                System.out.println("INCORRECTO");
            }
    }
    
}
