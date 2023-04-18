/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej3.Entidades;

/**
 *
 * @author AusA
 */
public class Entidades {
    
    /* Orden:
    1.- Atributos
    2.- Constructores
    3.- Setter
    4.- Getter
    5.- Metodos funcionales o Funciones
    6.- ToStrings
    
    */
    
    //Guia 8 ejercicio 3
    
    //Atributos
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;
    private boolean esMayor;
    
    //Constructores
    
    public Entidades(){
        
    }
    
    public Entidades(String nombre, int edad, String sexo, double altura){
        
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEsMayor(boolean esMayor) {
        this.esMayor = esMayor;
    }
    
        
    //Getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isEsMayor() {
        return esMayor;
    }
           
     //Metodos
    
    // To Strings

    @Override
    public String toString() {
        return "Entidades{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", esMayor=" + esMayor + '}';
    }
    
    

    
    
    
}
