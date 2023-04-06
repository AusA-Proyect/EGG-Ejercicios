package introjava;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AusA
 */
public class Guia4_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Crea una aplicación que le pida dos números al usuario y este pueda 
        elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
        tener una función para cada operación matemática y deben devolver sus 
        resultados para imprimirlos en el main. */
        
        Scanner leer = new Scanner (System.in);
        
        int num1, num2, operacion;
        String case5;
        boolean salir = false;
        
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        System.out.println("");
        
        int sumar = suma(num1, num2);
        int restar = resta(num1, num2);
        int multiplicar = multiplicacion(num1, num2);
        int dividir = division(num1, num2);
        
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
                System.out.println("La suma de los numeros ingresados es: " + sumar);
                System.out.println("");
                break;
            case 2:
                System.out.println("La resta de los numeros ingresados es: " + restar);
                System.out.println("");
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros ingresados es: " + multiplicar);
                System.out.println("");
                break;
            case 4:
                System.out.println("La division de los numeros ingresados es: " + dividir);
                System.out.println("");
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
                System.out.println("");
                break;    
            }
                
        } while (salir == false);
    }
    
    public static int suma (int a, int b) {
        
        //Operacion
        int c = a + b;
        return c;
    }
    
    public static int resta (int a, int b) {
        
        //Operacion
        int c = a - b;
        return c;
    }
    
    public static int multiplicacion (int a, int b) {
        
        //Operacion
        int c = a * b;
        return c;
    }
    
    public static int division (int a, int b) {
        
        //Operacion
        int c = a / b;
        return c;
    }
}
