/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1.Entidades;

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
    
    //Guia 8 ejercicio 1
    
    //Atributos
    private String nombreCompleto;
    private int numeroCuenta;
    private int dniCliente;
    private double saldoActual;
    
    //Constructores
    public Entidades(){
        
    }
    
    public Entidades(String nombreCompleto,int numeroCuenta, int dniCliente, double saldoActual){
        
        this.nombreCompleto = nombreCompleto;
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    public Entidades(double saldoActual){
        
        this.saldoActual = saldoActual;
        
    }
        
    //setter

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
        
    //Getters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    //Metodos
    
    //ToStrings

    @Override
    public String toString() {
        return "Entidades{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + ", nombreCompleto=" + nombreCompleto + '}';
    }
    
    
}
