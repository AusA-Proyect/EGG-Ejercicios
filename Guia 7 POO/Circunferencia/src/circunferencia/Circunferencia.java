/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import circunferencia.atributos.Atributos;

/**
 *
 * @author AusA
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Atributos Circunferencia1 = new Atributos();
                
        Circunferencia1.crearCircunferencia();
        Circunferencia1.area();
        Circunferencia1.perimetro();
        
        System.out.println(Circunferencia1);
    }
    
}
