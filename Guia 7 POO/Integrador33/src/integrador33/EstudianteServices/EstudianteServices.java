/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador33.EstudianteServices;

import integrador33.Estudiante.Estudiante;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class EstudianteServices {
    
    private Scanner read = new Scanner(System.in);
    
    public Estudiante alumno(Estudiante persona){        
                
        System.out.println("Ingrese el nombre del alumno");
        persona.setNombre(read.next());
        System.out.println("Ingrese la nota");
        persona.setNota(Math.floor(Math.random()*(10-0+1)+ 0));
//        persona.setNota(read.nextDouble());
        
        return persona;        
    }    
}
