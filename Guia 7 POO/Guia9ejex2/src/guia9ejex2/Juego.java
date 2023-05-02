/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejex2;

import guia9ejex2.Ahorcado.Ahorcado;
import guia9ejex2.Ahorcado.AhorcadoService.AhorcadoService;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class Juego {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        AhorcadoService serv = new AhorcadoService();
        Ahorcado a = serv.crearJuego();
        int iguales = 0;
        
        System.out.println("INICIO DEL JUEGO:");
        
        // Creo un array vacio
        char[] temp = new char[a.getPalabra().length];
        Arrays.fill(temp, '_'); // Inicializo el array con guiones para representar la palabra oculta

        
        do{
            System.out.println("-------------------------------");
            serv.longitud(a);
            serv.encontradas(a);
            
            // for para comparar el vector con la letra ingresada x el usuario
            for (int i = 0; i < a.getPalabra().length; i++) {
                if (a.getPalabra()[i] == a.getLetra()) {
                    temp[i] = a.getLetra();
                }
            }
            for (int i = 0;i < temp.length; i++) {
                System.out.print(temp[i]);
            }
            //enter
            System.out.println(" ");
            
            if(Arrays.equals(temp, a.getPalabra())){
                System.out.println("ADIVINASTE ¡FELICIDADES!");
                break;
            }
            
            // comparando los 2 arrays
//            for (int i=0; i<a.getPalabra().length; i++) {
//
//                for (int j=0; j<temp.length; j++) {
//
//                    if (a.getPalabra()[j] == temp[i]) {
//                        iguales++;
//                    }
//                }
//            }
            
        } while (serv.intentos(a)!=0);
        
        System.out.println("------------FIN DEL JUEGO------------");
        
//        if (serv.encontradas(a)) {
//            for (int i = 0; i < a.getPalabra().length; i++) {
//                if (a.getPalabra()[i] == letra.charAt(0)) {
//                    temp[i] = letra.charAt(0);
//                }
//            }
//        }
//        for (int i = 0;i < temp.length; i++) {
//            System.out.print(temp[i]);
//        }
    }
}
