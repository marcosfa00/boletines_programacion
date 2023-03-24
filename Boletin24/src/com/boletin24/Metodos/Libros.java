/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boletin24.Metodos;

/**
 *
 * @author marcosfa
 */
public class Libros implements Comparable{
    
    private String titulo;
    private String autor;
    private String ISBN;
    private float precio;
    private int n_unidades;

    public Libros() {
    }

    public Libros(String titulo, String autor, String ISBN, float precio, int n_unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.n_unidades = n_unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getN_unidades() {
        return n_unidades;
    }

    public void setN_unidades(int n_unidades) {
        this.n_unidades = n_unidades;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + precio + ", n_unidades=" + n_unidades + '}';
    }

    @Override
    public int compareTo(Object o) {
       Libros x = (Libros) o;//creamos el objeto libros y los igualamos al objeto o, primero debemos castearlo para indicar que es de tipo libros
        if (this.titulo.compareToIgnoreCase(x.titulo)==0) {
            return 0;
        }else if (this.titulo.compareToIgnoreCase(x.titulo)<1){
            return -1;
        }else{
            return 1;
        }
    }
    
    
    
}
