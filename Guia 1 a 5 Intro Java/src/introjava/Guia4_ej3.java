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
public class Guia4_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una cantidad
        de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
        yenes o libras. La función tendrá como parámetros, la cantidad de euros y la 
        moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará 
        un mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
        */
        
        Scanner leer = new Scanner (System.in);
        
        int cantidad, operacion;
        
        System.out.println("Ingrese la cantidad de Euros a cambiar");
        cantidad = leer.nextInt();
        System.out.println("");
        
        System.out.println("Ahora seleccione la operacion a realizar");
        System.out.println("1. Cambio a Libras");
        System.out.println("2. Cambio a Dolar");
        System.out.println("3. Cambio a Yenes");
        operacion = leer.nextInt();
        
        switch (operacion) {
            
        case 1:
        conversor_libras(cantidad, "Libras");
        break;
        case 2:
        conversor_dolares(cantidad, "Dolares");
        break;
        case 3:
        conversor_yenes(cantidad, "Yenes");
        break;
        }
    }
    
    public static void conversor_libras (int cantidad, String moneda) {
        
        double cambio = cantidad * 0.86;
        
        System.out.println("El cambio de los " + cantidad + " Euros es de " + (double)Math.round(cambio * 100d) / 100 + " " + moneda);
        System.out.println("Gracias por elegirnos!");
        System.out.println("");
        
    }
    
    public static void conversor_dolares (int cantidad, String moneda) {
        
        double cambio = cantidad * 1.28611;
        
        System.out.println("El cambio de los " + cantidad + " Euros es de " + (double)Math.round(cambio * 100d) / 100 + " " + moneda);
        System.out.println("Gracias por elegirnos!");
        System.out.println("");
    }
    
    public static void conversor_yenes (int cantidad, String moneda) {
        
        double cambio = cantidad * 0.86;
        
        System.out.println("El cambio de los " + cantidad + " Euros es de " + (double)Math.round(cambio * 100d) / 100 + " " + moneda);
        System.out.println("Gracias por elegirnos!");
        System.out.println("");
    }
    
}
