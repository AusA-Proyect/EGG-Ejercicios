/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej5;

import guia9ej5.PersonaEntidades.PersonaEntidades;
import guia9ej5.PersonaServicios.PersonaServicios;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        PersonaServicios per = new PersonaServicios();        
        PersonaEntidades p1 = per.crearPersona();        
        Date edad = p1.getFechaNacimiento();
        
        System.out.println(p1.toString());
        
        System.out.println("Su edad es " + per.calcularEdad(edad) + " años.");
        
        System.out.println(per.menorQue(edad));
        
        
        // Menu
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        
        while(!salir){
            
            System.out.println(" ");
            System.out.println("Bienvenido");
            System.out.println("1. Crear persona");
            System.out.println("2. Contar cuantas vocales tiene la frase");
            System.out.println("3. Invertir frase");
            System.out.println("4. Contar la cantidad de veces que se repite una vocal en la frase");
            System.out.println("5. Comparar la longitude de la frase guardada con otra a ingresar");
            System.out.println("6. Unir la frase guardada con otra a ingresar");
            System.out.println("7. Reemplazar la letra 'a' de la frase guardada con otra letra a ingresar");
            System.out.println("8. Comprobar si la frase contiene una letra a ingresar, Verdarero o Falso");
            System.out.println("9. Salir");
            
            System.out.println("Escribe una de las opciones");
            opcion = read.nextInt();
            
            switch(opcion){
                case 1:
                    per.crearPersona();
                    break;
//                case 2:
//                    cafe1.AgregarCafe(cafetera1);  
//                    break;
//                case 3:
//                    cafe1.VaciarCafetera(cafetera1);
//                    break;
//                case 4:
//                    cafe1.CuandoCafeQueda(cafetera1);
//                    break;
//                case 5: 
//                    salir=true;
//                    break;
                default:
                    System.out.println("Solo números entre 1 y 9");
            }
        }
    }
}
