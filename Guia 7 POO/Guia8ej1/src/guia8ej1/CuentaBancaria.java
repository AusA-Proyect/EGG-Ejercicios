/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

import guia8ej1.Entidades.Entidades;
import guia8ej1.servicios.CuentaBancariaServicio;

/**
 *
 * @author AusA
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
        numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
        Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
        Método para crear cuenta pidiéndole los datos al usuario.
        Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
        Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
        Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
        Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
        Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
        Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
         */
        
        //Guarda en un espacio llamado dato1
        CuentaBancariaServicio dato1 = new CuentaBancariaServicio();
        
        
        Entidades m1 = dato1.DatosUsuario();
        
        System.out.println(m1.toString());
        
        dato1.IngresarDinero(m1, 0);
        System.out.println(m1.toString());
        
        dato1.RetirarDinero(m1, 0);
        System.out.println(m1.toString());
        
        dato1.ExtraccionRapida(m1);
        System.out.println(m1.toString());
        
        dato1.ConsultarDatos(m1);
        
    }
    
}
