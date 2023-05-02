/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejex2.Ahorcado.AhorcadoService;

import guia9ejex2.Ahorcado.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class AhorcadoService {
    
    private Scanner read = new Scanner(System.in);
    
    public Ahorcado crearJuego(){        
                
        System.out.println("Ingrese la palabra a guardar"); 
        String palabraABuscar = read.next();
        // invoco el metodo longitud()
        // char[] palabra = new char[longitud(palabraABuscar)];
        char[] palabra = new char[palabraABuscar.length()];
        
        for (int i = 0; i < palabra.length; i++) {
            // guardo letra x letra en cada lugar de 'i' del vector
            palabra[i] = palabraABuscar.charAt(i);
        }
        
        System.out.println("Ingrese la cantidad de jugadas");        
        int cantJugadas = read.nextInt();
        
        return new Ahorcado(palabra, cantJugadas);
    }
    
    public void longitud(Ahorcado palabra) {
        
        System.out.println("La longitud de la palabra a buscar es de " + palabra.getPalabra().length + " espacios" );
//        return palabra.length();
    }
    
    public char buscar(Ahorcado a){
        
        boolean encontrado = false;
        char letra;
        
        System.out.println("Ingrese la letra que quiere saber si esta o no en la palabra");
        letra = read.next().charAt(0);
        
        for (int i = 0; i < a.getPalabra().length; i++) {
            
            if (a.getPalabra()[i] == letra) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("La letra pertenece a la palabra");
            a.setLetra(letra);
            return letra;
        }
        else {
            System.out.println("La letra no pertenece a la palabra");
            return letra;
        }
        
    }
    
    public boolean encontradas(Ahorcado a) {
        
        boolean encontrado = false;
        int cont = 0;
        char letra;
//        
//        System.out.println("Ingrese la letra a buscar");
//        letra = read.next().charAt(0);
        
        AhorcadoService retorno = new AhorcadoService();
        
        letra = retorno.buscar(a);
        
        for (int i = 0; i < a.getPalabra().length; i++) {
            
            // Invoco el metodo buscar con this.buscar
            if (a.getPalabra()[i] == letra) {
                encontrado = true;
                cont++;
            }
        }
        if (encontrado) {
            System.out.println("¿Se encontro la letra? " + encontrado);
            System.out.println("La letra ingresada fue encontrada " + cont + " vez(ces)");
            System.out.println("Te quedan " + (a.getPalabra().length - cont) + " letras a adivinar");
            return encontrado;
        }
        else {
            System.out.println("¿Se encontro la letra? " + encontrado);
            a.setCantJugadas(a.getCantJugadas()-1);
            System.out.println("Te quedan " + (a.getPalabra().length) + " letras a adivinar");
            return encontrado;
//            System.out.println("Restan " + a.getCantJugadas() +  " intentos");
//            System.out.println("Restan " + this.intentos(a)); // invocamos metodo con this.intentos() 
        }
    }
    
    public int intentos (Ahorcado a) {
        
        System.out.println("Te quedan " + a.getCantJugadas() + " intentos");
        
        return a.getCantJugadas();
    }
    
}
