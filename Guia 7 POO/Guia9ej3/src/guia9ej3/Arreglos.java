/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej3;

import guia9ej3.ArreglosServicios.ArreglosServicios;

/**
 *
 * @author AusA
 */
public class Arreglos {
    
    public static void main(String[] args) {
        
        ArreglosServicios serv = new ArreglosServicios();        
         
        double[] a = new double[50];
        double[] b = new double[20];
        serv.inicializarA(a);
        serv.inicializarA(b);
        
        serv.mostrar(a);
        
        serv.inicializarB(a, b);
       
        serv.mostrar(a);
        serv.mostrar(b);
        System.out.println(" ");
        
    }
}
