/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej5.PersonaServicios;

import guia9ej5.PersonaEntidades.PersonaEntidades;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class PersonaServicios {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public PersonaEntidades crearPersona(){
        
        PersonaEntidades p1 = new PersonaEntidades();
        
        int dia;
        int mes;
        int anio;
        
        System.out.println("Ingrese su nombre");
        p1.setNombre(read.next());
        
        System.out.println("Ingrese su fecha de nacimiento");
        
        System.out.println("Ingrese dia");
        dia = read.nextInt();        
        System.out.println("Ingrese el mes");
        mes = read.nextInt();        
        System.out.println("Ingrese el año");
        anio = read.nextInt();          
        
        Date nacimiento = new Date(anio-1900, mes-1, dia);
        p1.setFechaNacimiento(nacimiento);
        
        return p1; 
    }
    
    public int calcularEdad(Date nacimiento){
        
        Date dif = new Date();
        
        int edad = dif.getYear() - nacimiento.getYear();
        
        return edad;
    }
    
    public boolean menorQue(Date persona){
        
        Date dif = new Date();
        
        int edad = dif.getYear() - persona.getYear();
        
        
        if (edad > 18){
            
            System.out.print("¿Es mayor de edad? ");
            return true;
        }
        else {
            System.out.print("¿Es mayor de edad? ");
            return false;
        }
    }
    
    public void mostrarPersona(){
                
        
        
    }
    
}
