/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej4.Atributos;

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
    
    //Guia 7 ejercicio 4
    
    //Atributos    
    private int base;
    private int altura;
    private int rectangulo;
    private int superficie;
    private int perimetro;
    
    //Constructores
    
    public Atributos(){
        
    }
    
    //Setter
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Getter
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    //metodos
    public void datosRectangulo(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la base");
        base = leer.nextInt();
        
        System.out.println("Ingrese el valor de la altura");
        altura = leer.nextInt();
    }
    
    public void crearRectangulo(){
        
        System.out.println(" ");
        for(int i=0 ; i <= altura-1; i++){
            if(i==0 || i==altura-1){
                for(int j=0 ; j < base; j++){
                System.out.print("*");
                }
                System.out.println(" ");
            }
            else{
                for(int k=0 ; k <= base; k++){
                    if(k==0 || k == base-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
        
    }
    
    public int superficie(){
        
        superficie = base*altura;
        
        return superficie;
    }
    
    public int perimetro(){
        
        perimetro = (base + altura) * 2;
        
        return perimetro;
    }
    
}
