/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej3.Servicios;

import guia8ej3.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class PersonaServicios {
    
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    String sexo;
    int imc;
    
    public Entidades CrearPersona(Entidades persona){
        
        System.out.println("Ingrese su nombre");
        persona.setNombre(read.next());
        System.out.println("Ingrese su edad");
        persona.setEdad(read.nextInt());       
        
        System.out.println("Ingrese su sexo - H para hombre - M para mujer - O para otro. ");
        sexo = read.next().toUpperCase();
        
        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            
            System.out.println("Has introducido una respuesta incorrecta. Ingrese una respuesta correcta.");
            sexo = read.next().toUpperCase();
            
        }
        
        if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")){
            persona.setSexo(sexo);
        }
        
        System.out.println("Ingrese su peso");
        persona.setPeso(read.nextInt());
        System.out.println("Ingrese su altura");
        persona.setAltura(read.nextDouble());
        
        return persona;
        
    }    
    
    public boolean EsMayorDeEdad(Entidades persona){
        
        if (persona.getEdad() >= 18){
            persona.setEsMayor(true);
        }
        return persona.isEsMayor();
    }
    
    public int CalcularIMC(Entidades persona){
        
        imc = persona.getPeso() / (int) Math.pow(persona.getAltura(), 2);
        
        if (imc<20){
            persona.setImc(-1);
        }
        else if (imc<=20 && imc>=25) {
            persona.setImc(0);
        }
        else if(imc>25) {
            persona.setImc(1);
        }
        return persona.getImc();
    }
    
}
