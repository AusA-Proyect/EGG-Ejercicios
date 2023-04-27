/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej4;

import guia9ej4.FechaService.FechaService;
import java.util.Calendar;
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
//        
        Calendar fechaNacimiento = fecha.fechaNacimiento();

        int anio = fechaNacimiento.get(Calendar.YEAR);
        int mes = fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        System.out.println(dia + "-" + (mes+1) + "-" + anio);        

        System.out.println("La fecha actual es " + fecha.fechaActual().getTime());
        
        System.out.println("Tu edad es " + fecha.diferencia());
        
        int diaSemana = fechaNacimiento.get(Calendar.DAY_OF_WEEK);
        
        System.out.println(diaSemana);
    }
    
}
