/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1.servicios;

import guia8ej1.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author AusA
 */
public class CuentaBancariaServicio {
    
    // Uso .useDelimiter("\n") para pdoer ingresar String con espacios
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Entidades DatosUsuario(){
        
        System.out.println("Ingrese su nombre y apellido.");
        String nombreCompleto = leer.next();
        System.out.println("Ingrese su numero de cuenta.");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su numero de DNI");
        int dniCliente = leer.nextInt();
        System.out.println("Ingrese el saldo inicial");
        double saldoActual = leer.nextDouble();
        
        return new Entidades(nombreCompleto, numeroCuenta, dniCliente, saldoActual);
        
    }
    
    public void IngresarDinero(Entidades cuenta, double cantidad) {
        System.out.println("Ingrese la cantidad de dinero a depositar");
        cantidad = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
    }   
   
    
    public void RetirarDinero(Entidades cuenta, double cantidad){
        System.out.println("Ingrese la cantidad de dinero a retirar");
        cantidad = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
    }
    
    public void ExtraccionRapida(Entidades cuenta){
        System.out.println("Tu extraccion rapida retiras el 20 % de tu saldo actual");
        cuenta.setSaldoActual(cuenta.getSaldoActual() - (cuenta.getSaldoActual() * 0.20));
        System.out.println("Tu saldo restante es igual a " + cuenta.getSaldoActual());
        
    }
    
    public void ConsultarSaldo(Entidades cuenta){
        System.out.println("Tu saldo es de " + cuenta.getSaldoActual());
    }
    
    public void ConsultarDatos(Entidades cuenta){
        System.out.println("Nombre: " + cuenta.getNombreCompleto());
        System.out.println("DNI: " + cuenta.getDniCliente());
        System.out.println("Nro de cuenta: " + cuenta.getNumeroCuenta());
    }
    
}
