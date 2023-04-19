/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej3;

import guia8ej3.Entidades.Entidades;
import guia8ej3.Servicios.PersonaServicios;

/**
 *
 * @author AusA
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar una clase llamada Persona en el paquete de entidades que tengan 
        los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer,
        ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo.
        Agregar constructores, getters y setters.
        En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
        
        Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
        Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
        al usuario y después se le asignan a sus respectivos atributos para llenar
        el objeto Persona.Además, comprueba que el sexo introducido sea correcto,
        es decir, H, M o O.Si no es correcto se deberá mostrar un mensaje
        Método calcularIMC(): calculara si la persona está en su peso ideal 
        (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20
        , significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
        Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
        está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula 
        es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
        A continuación, en la clase main hacer lo siguiente:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
        llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
        tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
        para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, 
        cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad 
        y cuantos menores. Para esto, podemos crear unos métodos adicionales. */
        
        PersonaServicios p1 = new PersonaServicios();
        
        Entidades personas[] = new Entidades[4];
        
        int imc[] = new int[4]; // IMC
        boolean esMayor[] = new boolean[4]; // si es mayor?
        
        
        for (int i=0; i<personas.length; i++) {
            personas[i] = new Entidades();
            personas[i] = p1.CrearPersona(personas[i]);
            imc[i] = p1.CalcularIMC(personas[i]);
            esMayor[i] = p1.EsMayorDeEdad(personas[i]);            
        }
        
        
        
        for(int i=0; i<personas.length; i++){
                System.out.println(personas[i]);
        }
        
        for(int i=0; i<imc.length; i++){
                System.out.print(imc[i]);
                System.out.print(" ");
        }
        
        System.out.println(" ");
        
        for(int i=0; i<esMayor.length; i++){
                System.out.print(esMayor[i]);
                System.out.print(" ");
        }
        
        System.out.println(" ");
        
        // Calculando el porcentaje de los arrays        
        int BajoPeso = 0;
        int PesoIdeal = 0;
        int Sobrepeso = 0;
        int cuantosMayoresDeEdad = 0;

        for (int i=0; i<4; i++) {
            
            if (imc[i] == -1) {
                BajoPeso++;
            }
            else if (imc[i] == 0) {
                PesoIdeal++;
            }
            else {
                Sobrepeso++;
            }

            if (esMayor[i]) {
                cuantosMayoresDeEdad++;
            }
        }

        System.out.println("El porcentaje de personas por debajo del peso ideal: " + (BajoPeso / 4) * 100 + "%");
        System.out.println("El porcentaje de personas en su peso ideal: " + (PesoIdeal / 4) * 100 + "%");
        System.out.println("El porcentaje de personas con sobrepeso: " + (Sobrepeso / 4) * 100 + "%");
        System.out.println("El porcentaje de mayores de edad: " + (int)((cuantosMayoresDeEdad / 4.0) * 100) + "%");
        System.out.println("El porcentaje de menores de edad: " + (int)(((4 - cuantosMayoresDeEdad) / 4.0) * 100) + "%");
        
//        Entidades persona1 = new Entidades();
//        Entidades persona2 = new Entidades();
//        Entidades persona3 = new Entidades();
//        Entidades persona4 = new Entidades();
//        
//        
//        //Persona 1
//        p1.CrearPersona(persona1);        
//        p1.EsMayorDeEdad(persona1);
//        p1.CalcularIMC(persona1);   
//        
//        
//        //Persona 2
//        p1.CrearPersona(persona2);        
//        p1.EsMayorDeEdad(persona2);
//        p1.CalcularIMC(persona2);
//        
//        
//        //Persona 3
//        p1.CrearPersona(persona3);        
//        p1.EsMayorDeEdad(persona3);
//        p1.CalcularIMC(persona3);
//        
//        
//        //Persona 4
//        p1.CrearPersona(persona4);        
//        p1.EsMayorDeEdad(persona4);
//        p1.CalcularIMC(persona4);
//        
//        System.out.println(persona1.toString());
//        System.out.println(persona2.toString());
//        System.out.println(persona3.toString());
//        System.out.println(persona4.toString());
        
//        for (int i=0; i<array1.length; i++) {
//            array1[i] = persona1.getImc();
//        }
//        
//        for(int i=0; i<array1.length; i++){
//                System.out.println(array1[i]);
//        }     
        

        
    }
    
}
