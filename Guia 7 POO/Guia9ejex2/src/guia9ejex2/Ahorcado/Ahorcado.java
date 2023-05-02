/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejex2.Ahorcado;

/**
 *
 * @author AusA
 */
public class Ahorcado {
/**
 * atributos, un vector con la palabra a buscar, la cantidad
 * de letras encontradas y la cantidad jugadas máximas que puede realizar el
 * usuario.
 */
    
    private char[] palabra; 
    private char letra; // cantidad de letras
    private int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, char letra, int cantJugadas) {
        this.palabra = palabra;
        this.letra = letra;
        this.cantJugadas = cantJugadas;
    }

    public Ahorcado(char[] palabra, int cantJugadas) {
        this.palabra = palabra;
        this.cantJugadas = cantJugadas;
    }
        
    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra.toString() + ", letra=" + letra + ", cantJugadas=" + cantJugadas + '}';
    }    
}
