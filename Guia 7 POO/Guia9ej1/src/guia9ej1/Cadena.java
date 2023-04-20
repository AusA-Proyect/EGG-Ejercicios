/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej1;

import guia9ej1.CadenaEntidades.CadenaEntidades;
import guia9ej1.CadenaServicios.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CadenaServicios ej1 = new CadenaServicios();
        
        CadenaEntidades G9 = new CadenaEntidades ("casa blanca");
        
        System.out.println(ej1.mostrarVocales(G9));  
        System.out.println(ej1.invertirFrase(G9));
        
        System.out.println("Ingrese el caracter a buscar en la frase");
        System.out.println("La letra ingresada se repite " + ej1.vecesRepetido(G9) + " veces en la frase.");
        
        System.out.println("La primersa frase contiene " + G9.getLongitud() + " digitos, y la segunda frase contiene " + ej1.compararLongitud(G9));
        
        System.out.println(ej1.unirFrases(G9));
        
        System.out.println(ej1.reemplazar(G9));
        
        System.out.println(ej1.contiene(G9));
        
        
        
        
        
        
//        // TODO code application logic here
//        
//        Scanner read = new Scanner(System.in);
//        
//        CadenaServicios frase1 = new CadenaServicios();
//        
//        //Creo un array de CadenaEntidades
//        CadenaEntidades f1[] = new CadenaEntidades[2];
//                
//        //Llenando datos del array f1
//        for (int i=0; i<1; i++) {
//            f1[i] = new CadenaEntidades();
//            System.out.println("Ingrese la frase a guardar");
//            f1[i] = frase1.guardarFrase(f1[i]);
////            imc[i] = frase1.CalcularIMC(f1[i]);
////            esMayor[i] = frase1.EsMayorDeEdad(f1[i]);            
//        }
//        
//        //Mostrando datos del array f1
//        for(int i=0; i<f1.length; i++){
//                System.out.println(f1[i]);
//        }
//        
//        
//        boolean salir = false;
//        int opcion; //Guardaremos la opcion del usuario
//        
//        while(!salir){
//            
//            System.out.println(" ");
//            System.out.println("Bienvenido al cuentacambiafrases");
//            System.out.println("1. Ingresar la 2da frase");
//            System.out.println("2. Contar cuantas vocales tiene la frase");
//            System.out.println("3. Invertir frase");
//            System.out.println("4. Contar la cantidad de veces que se repite una vocal en la frase");
//            System.out.println("5. Comparar la longitude de la frase guardada con otra a ingresar");
//            System.out.println("6. Unir la frase guardada con otra a ingresar");
//            System.out.println("7. Reemplazar la letra 'a' de la frase guardada con otra letra a ingresar");
//            System.out.println("8. Comprobar si la frase contiene una letra a ingresar, Verdarero o Falso");
//            System.out.println("9. Salir");
//            
//            System.out.println("Escribe una de las opciones");
//            opcion = read.nextInt();
//            
//            switch(opcion){
//                case 1:
//                    for (int i=1; i<f1.length; i++) {
//                        f1[i] = new CadenaEntidades();
//                        System.out.println("Ingrese la 2da frase a guardar");
//                        f1[i] = frase1.guardarFrase(f1[i]);
//                    }
//                    break;
////                case 2:
////                    cafe1.AgregarCafe(cafetera1);  
////                    break;
////                case 3:
////                    cafe1.VaciarCafetera(cafetera1);
////                    break;
////                case 4:
////                    cafe1.CuandoCafeQueda(cafetera1);
////                    break;
////                case 5:
////                    salir=true;
////                    break;
//                default:
//                    System.out.println("Solo números entre 1 y 9");
//           }
//            
//            for(int i=0; i<f1.length; i++){
//                System.out.println(f1[i]);
//        }
//            
//       }   
    }
    
}
