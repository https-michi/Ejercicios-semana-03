/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.semana03.ejercicio06;

/**
 *
 * @author Mileny
 */
public class Libro {
    
    private String titulo;
    private String autor;
    
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }    
   
    class Pagina {
        
        private int nroPagina;
        private String contenido;
        
        public Pagina(int nroPagina, String contenido) {
            this.nroPagina = nroPagina;
            this.contenido = contenido;
        }     
        
        public void mostrarContenido() {
            System.out.println("Pagina " + nroPagina + " del libro " + titulo + ":");
            System.out.println(contenido);
        } 
        
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }             
    }

    public void mostrarPag(int numero, String contenido) {
        Pagina pag = new Pagina(numero, contenido);
        pag.mostrarContenido();
    }
}
