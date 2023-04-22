/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej4;

import guia9ej4.FechaService.FechaService;
import java.util.Date;
/**
 *
 * @author AusA
 */
public class MainDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FechaService fecha = new FechaService();
        
        Date fechaNacimiento = fecha.fechaNacimiento();
        
        System.out.println(fechaNacimiento.getDate() + "-" + fechaNacimiento.getMonth() + "-" + fechaNacimiento.getYear());
        System.out.println("La fecha actual es " + fecha.fechaActual());
        
        System.out.println("Tu edad es " + fecha.diferencia(fechaNacimiento));
        
        
    }
    
}
