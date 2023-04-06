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
public class Guia3_ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que pida dos números enteros positivos por teclado
        y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
        y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
        El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
        si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
        se debe mostrar el siguiente mensaje de confirmación: 
        ¿Está seguro que desea salir del programa (S/N)? 
        Si el usuario selecciona el carácter ‘S’ se sale del programa, 
        caso contrario se vuelve a mostrar el menú.
        
        MENU
        1. SUMAR
        2. RESTAR
        3. MULTIPLICAR
        4. DIVIDIR
        5. SALIR
        Elija opcion;
        
        */
        
        Scanner leer = new Scanner (System.in);
        
        int num, num2, operacion;
        String case5;
        boolean salir = false;
        
        System.out.println("Ingrese el primer numero");
        num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        
        do {
            System.out.println("Ahora seleccione la operacion a realizar");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            operacion = leer.nextInt();
            
            switch (operacion) {
            
            case 1:
                System.out.println("La suma de los numeros ingresados es: " + (num + num2));
                break;
            case 2:
                System.out.println("La resta de los numeros ingresados es: " + (num - num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros ingresados es: " + (num * num2));
                break;
            case 4:
                System.out.println("La division de los numeros ingresados es: " + (num / num2));
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                case5 = leer.next();
                case5 = case5.toUpperCase();
                
                if (case5.equals("S")) {
                    System.out.println("Hasta luego :)");
                    salir = true;
                }
                else if (case5.equals("N")) {
                    System.out.println("Volviendo al menu");
                }
                else {
                    System.out.println("La opción ingresada no es válida, volviendo al menú");
                }
                break;    
            }
                
        } while (salir == false);
        
    }
    
}
