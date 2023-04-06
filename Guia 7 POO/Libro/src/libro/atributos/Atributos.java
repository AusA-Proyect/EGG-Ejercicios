/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.atributos;

/**
 *
 * @author AusA
 */
public class Atributos {
    
    
    /* Orden:
    1.- Atributos
    2.- Constructores
    3.- Geter
    4.- Setter
    5.- Metodos funcionales o Funciones
    6.- ToStrings
    
    */
    
    //Guia 7 ejercicio 1
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int paginas;
    
    public Atributos () {
         
    }

    public Atributos(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        if (paginas > 2) {
            this.paginas = paginas;
        }
    }
    
    // Seters    
    public void setISBN(int ISBN){        
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Getters    
    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    // ToStrings
    @Override
    public String toString() {
        return "Atributos{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }   
    
}
