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
public class Guia4_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima
        los datos de las personas ingresadas por teclado e indique si son mayores 
        o menores de edad. Después de cada persona, el programa debe preguntarle 
        al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
        ingrese la palabra “No”.*/
        
        Scanner leer = new Scanner (System.in);
        String respuesta;
        
        do {
            persona("nombre", 0);
            System.out.println("¿Quiere seguir ingresando personas? Si/No");
            respuesta = leer.next();
            
        } while (!"No".equals(respuesta));
            
    }
    
    public static void persona (String nombre, int edad) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        System.out.println("");
        System.out.println("Hola " + nombre + " como estas?");
        System.out.println("");
        
        System.out.println(nombre + " ingresa tu edad");
        edad = leer.nextInt();
        System.out.println("");
        
        if (edad >= 18 ) {
            System.out.println(nombre + " veo que eres mayor de edad, Bienvenido!");
            System.out.println("");
        }
        else {
            System.out.println(nombre + " veo que todavia eres menor de edad, anda a tomar Danonino!");
            System.out.println("");
        }

    }
    
}
