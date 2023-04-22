/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej4.FechaService;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class FechaService {
    
    public Date fechaNacimiento(){
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        int dia;
        int mes;
        int anio;
        
        System.out.println("Ingrese dia de nacimiento");
        dia = read.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento");
        mes = read.nextInt();
        
        System.out.println("Ingrese el año de nacimiento");
        anio = read.nextInt();          
        
        return new Date(anio, mes, dia);
    }
    
    public Date fechaActual(){
        
        Date fechaActual = new  Date();        
        
        return fechaActual;
    }
    
    public int diferencia(Date fechaNacimiento){
        
        Date dato = new Date();
        
        int diferencia;
        
        diferencia = dato.getYear() - (fechaNacimiento.getYear()-1900);
        
        return diferencia;
        
    }
    
}
