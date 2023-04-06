/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.Scanner;
import libro.atributos.Atributos;

/**
 *
 * @author AusA
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);  
        
        Atributos libro1 = new Atributos();
        
        System.out.println("Ingrese el numero de ISBN ");
        libro1.setISBN(leer.nextInt());
        System.out.println("Ingrese el titulo del libro ");
        libro1.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor ");
        libro1.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de paginas del libro ");
        libro1.setPaginas(leer.nextInt());
        
        System.out.println(libro1);
        
    }
    
}
