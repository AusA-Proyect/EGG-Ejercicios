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
    
    public void ServirTaza(){
        
    }
    
    public void VaciarCafetera(){
        
    }
    
    public void AgregarCafe(){

    }
}
