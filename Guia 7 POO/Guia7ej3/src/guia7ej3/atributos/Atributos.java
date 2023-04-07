/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej3.atributos;

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
    
    //Guia 7 ejercicio 3
    
    //Atributos    
    private int numero1;
    private int numero2;
    private int suma;
    private int resta;
    private int multiplicacion;
    private double division;
    
    //Constructores
    
    public Atributos(){
        
    }
    public Atributos(int numero1, int numero2){
        
    }
    
    //Setter
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //Getter
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    
    //Metodos
    public void crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del primer numero ");
        numero1 = leer.nextInt();
        
        System.out.println("Ingrese el valor del segundo numero ");
        numero2 = leer.nextInt();
    }
    
    public int sumar(){        
        suma = numero1 + numero2;                
        return suma;
    }
    
    public int restar(){
        resta = numero1 - numero2;
        return resta;
    }
    
    public int multiplicar(){
        
        if (numero1==0 || numero2==0){
            multiplicacion = 0;
        }
        else {
            multiplicacion = numero1*numero2;
        }
        
        return multiplicacion;
    }
    
    public double dividir(){
        
        if (numero1==0 || numero2==0){
            division = 0;
        }
        else {
            //Convierto a double los numero a dividir asi puede mostrar resultado con decimales.
            division = (double)numero1/numero2;
        }
        
        return division;
    }
    
}
