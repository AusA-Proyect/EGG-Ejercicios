/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej3;

import guia7ej3.atributos.Atributos;

/**
 *
 * @author AusA
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Atributos Operacion = new Atributos();
        
        Operacion.crearOperacion();
        
        System.out.println("La suma del primer numero y el segundo es " + Operacion.sumar());
        System.out.println("La resta del primer numero y el segundo es " + Operacion.restar());
        
        if (Operacion.multiplicar()==0){
            System.out.println("Uno de los numero ingresados es 0 y el resultado es " + Operacion.multiplicar());
        }
        else {
            System.out.println("La multiplicacion de los numero ingresados es " + Operacion.multiplicar());
        }
        
        if (Operacion.dividir()<0){
            System.out.println("Uno de los numero ingresados es 0 y el resultado es " + Operacion.dividir());
        }
        else {
            System.out.println("La Division del primer numero con el segundo es " + Operacion.dividir());
        }
        
    }
    
}
