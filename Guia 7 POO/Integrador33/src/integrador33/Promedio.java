/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador33;

import integrador33.Estudiante.Estudiante;
import integrador33.EstudianteServices.EstudianteServices;

/**
 *
 * @author AusA
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante e1 = new Estudiante();
        EstudianteServices es1 = new EstudianteServices();
        
        Estudiante estudiantes[] = new Estudiante[3];
        double promedio = 0;
        String aprobados[] = new String[estudiantes.length];
        
        //Cargamos el array con los alumnos y sus notas
        for( int i=0; i<estudiantes.length ;i++){
            estudiantes[i]= new Estudiante();
            estudiantes[i]= es1.alumno(estudiantes[i]);
        }
        
        // muestro array con los datos
        for ( int i=0; i<estudiantes.length; i++){
            System.out.println(estudiantes[i]);
        }
        
        //Mostramos el promedio de las notas        
        for (int i=0; i<estudiantes.length;i++){
            promedio = promedio + estudiantes[i].getNota();
        }
        
        //cambio el promedio?
        promedio = promedio /estudiantes.length;
        
        System.out.println("El promedio es " + promedio);
        
        //guardo a los aprobados en otro array
        int j=0;
        for( int i=0 ; i<estudiantes.length ; i++){            
            
            if(estudiantes[i].getNota() > promedio){
                aprobados[j] = estudiantes[i].getNombre();
                j++;
            }            
        }
        
        // muestro el nuevo array con los nombres aprobados
        System.out.println("Los aprobados son: ");
        for ( int i=0; i<aprobados.length; i++){
            
            if(aprobados[i] != null){
                System.out.print(aprobados[i] + ", ");
            }
        }
        
    }
    
}
