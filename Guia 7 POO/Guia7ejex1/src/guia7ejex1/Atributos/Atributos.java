/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejex1.Atributos;

import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class Atributos {
    
    /* Orden:
    1.- Atributos
    2.- Constructores
    3.- Setter
    4.- Getter
    5.- Metodos funcionales o Funciones
    6.- ToStrings
    
    */
    
    //Guia 7 ejercicio extra 1
    
    //Atributos 
    private String titulo;
    private String autor;
    
    // Constructores
    
    public Atributos(){
        
    }
    
    public Atributos(String titulo, String autor){
        
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    //Metodos
    public void crearCancion(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del Titulo ");
        titulo = leer.next();
        
        System.out.println("Ingrese el nombre del Autor ");
        autor = leer.next();
    }
    
    
}
