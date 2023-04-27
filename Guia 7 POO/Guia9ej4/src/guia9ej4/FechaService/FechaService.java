/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej4.FechaService;


import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class FechaService {
        
    // guarda "dato" creado por usuario
    Calendar dato = Calendar.getInstance();
    
    //se declara la fecha actual.
    Calendar fechaActual = Calendar.getInstance();  
    
    public Calendar fechaNacimiento(){
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");        
        
        int dia;
        int mescorregido = 0;
        int mes;
        int anio;
        
        System.out.println("Ingrese el dia");
        dia = read.nextInt();
        System.out.println("Ingrese el mes");
        mes = read.nextInt();
        System.out.println("Ingrese el año");        
        anio = read.nextInt();        
        
        if (mes>=1 && mes<=12) {
            
            mescorregido = (mes -1);
                                
        } else {
            System.out.println("EL mes es incorrecto");
        }
        
        dato.set(anio, mescorregido, dia);
        
        return dato;
    }
    
    public Calendar fechaActual(){               
        
        return fechaActual;
    }
    
    public int diferencia(){
        
        long anio = 31557600000L;
        
        // devuelve la diferencia del año actual en milisegundos
        long aniosMilisegundos = fechaActual.getTimeInMillis() - dato.getTimeInMillis();
        
        //  Formula para convertir los milisegundos en años
        int diferenciaAnios = (int)(aniosMilisegundos/anio);     
        
        return diferenciaAnios;
        
    }
    
}
