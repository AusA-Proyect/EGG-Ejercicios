/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej2.servicios;

import guia8ej2.entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class CafeteraServicio {
    
    // Uso .useDelimiter("\n") para pdoer ingresar palabras con espacios hasta que presionene un Enter
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");        
    
    public void LlenarCafetera(Entidades cafe){
        
        System.out.println("Llenando la cafetera a su maxima capacidad");
        if (cafe.getCantidadActual() < cafe.getCapacidadMaxima()) {
            cafe.setCantidadActual(cafe.getCapacidadMaxima());            
        }
        else {
            System.out.println("La cafetera se encuentra llena");
        }
    }
    
    public void ServirTaza(Entidades cafe){
        
        System.out.println("Ingrese el tamaño de la taza a servir");
        int taza = leer.nextInt();
        
        if (cafe.getCantidadActual()< taza){
            System.out.println("Solo queda " + cafe.getCantidadActual() + "ml de cafe a servir. Sirviendolo en su taza.");
            cafe.setCantidadActual(cafe.getCantidadActual() - cafe.getCantidadActual());
        }
        else if (cafe.getCantidadActual() >= taza) {
            System.out.println("Sirviendo la cantidad solicitada.");
            cafe.setCantidadActual(cafe.getCantidadActual() - taza);
            
        }       
    }
    
    public void VaciarCafetera(Entidades cafe){
        
        System.out.println("Vaciando la cafetera");
        
        cafe.setCantidadActual(0);
        
    }
    
    public void AgregarCafe(Entidades cafe){

        System.out.println("Ingrese la cantidad de cafe a recargar.");
        int recarga = leer.nextInt();
        
        if (cafe.getCantidadActual() + recarga > cafe.getCapacidadMaxima()){
            
            System.out.println("La cantidad ingresada sobrepasa el limite de la cafetera. Solo queda espacio para " + (cafe.getCapacidadMaxima() -  cafe.getCantidadActual()) + "ml de capacidad de llenado.");
            
        }
        else {
            cafe.setCantidadActual(cafe.getCantidadActual() + recarga);
        }
    }
    
    public void CuandoCafeQueda(Entidades cafe){
        
        System.out.println("Queda " + cafe.getCantidadActual() + "ml de cafe en la maquina.");
    }
}
