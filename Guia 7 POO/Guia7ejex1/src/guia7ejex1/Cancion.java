/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejex1;

import guia7ejex1.Atributos.Atributos;

/**
 *
 * @author AusA
 */
public class Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Atributos Cancion = new Atributos();
        
        Cancion.crearCancion();
        
        System.out.println("La cancion se guardo con el nombre " + Cancion.getTitulo() + " y el Autor es " + Cancion.getAutor());
    }
    
}
