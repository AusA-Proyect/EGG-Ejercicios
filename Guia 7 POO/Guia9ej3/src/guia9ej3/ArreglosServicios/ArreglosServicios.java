/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej3.ArreglosServicios;

import guia9ej3.Arreglos;
import java.util.Arrays;

/**
 *
 * @author AusA
 */
public class ArreglosServicios {

    public ArreglosServicios() {
    }

    public void inicializarA(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (Math.random() * 10) + 1;
        }
    }

    public void mostrar(double[] a) {
        System.out.println(" ");
        System.out.println(" ARREGLO: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(Math.round(a[i]*100)/100d + ", ");
        }
    }

    public void oredenar(double[] a) {
        Arrays.sort(a);
    }

    public void inicializarB(double[] a, double[] b) {
        
        // arraycopy copia un array - System.arraycopy(ARRAYORIGEN, DESDE-POSICION-ARRAYORIGEN, ARRAY-DESTINO, DESDE-ARRAY-DESTINO, HASTA);        
        System.arraycopy(a, 0, b, 0, 10);
        
        Arrays.fill(b, 10, 20, 0.5);
    }
}
