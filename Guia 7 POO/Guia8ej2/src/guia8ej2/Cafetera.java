/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej2;

import guia8ej2.entidades.Entidades;
import guia8ej2.servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades 
        con los atributos capacidadMáxima (la cantidad máxima de café que puede 
        contener la cafetera) y cantidadActual (la cantidad actual de café que hay 
        en la cafetera). Agregar constructor vacío y con parámetros así como setters 
        y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
        Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
        Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
        Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
        El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
        Método vaciarCafetera(): pone la cantidad de café actual en cero. 
        Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
        recibe y se añade a la cafetera la cantidad de café indicada.
        */
        
        
        Scanner leer = new Scanner(System.in);
        
        CafeteraServicio cafe1 = new CafeteraServicio();        
        
        Entidades cafetera1 = new Entidades();        
        
        cafe1.LlenarCafetera(cafetera1);
        
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        
        while(!salir){
            
            System.out.println(" ");
            System.out.println("Bienvenido a cafeteras ACME");
            System.out.println("1. Servir cafe");
            System.out.println("2. Agregar cafe a la maquina");
            System.out.println("3. Vaciar la cafetera");
            System.out.println("4. Consultar cuanto cafe queda en la maquina");
            System.out.println("5. Salir");
            
            System.out.println("Escribe una de las opciones");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    cafe1.ServirTaza(cafetera1);  
                    break;
                case 2:
                    cafe1.AgregarCafe(cafetera1);  
                    break;
                case 3:
                    cafe1.VaciarCafetera(cafetera1);
                    break;
                case 4:
                    cafe1.CuandoCafeQueda(cafetera1);
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
           }
            
       }   
        
    }
    
}
