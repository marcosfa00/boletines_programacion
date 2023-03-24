/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import java.util.Comparator;

/**
 *
 * @author marcosfa
 */
public class Operaciones <T> {
    
    private T dato;
    
    public Operaciones (){
        
    }
    
    public Operaciones(T dato){
        this.dato =dato;
    }
    
    public static <T> void addElement(ArrayList<T> lista,T element){
        lista.add(element);
    }
    
    public static <T> void minElement(ArrayList <T> lista){
        lista.sort((Comparator <? super T>) Comparator.naturalOrder());
        
        System.out.println("El elemento minimo de la lista es: " + lista.get(0) );
    }
    public static <T> void elementoMinimo(ArrayList <T> lista){
       
        System.out.println("Elemento Minimo: "+ Collections.max(lista, null));
        
        
    }
    public static <T> void maxElement(ArrayList <T> lista){
        lista.sort((Comparator <? super T>) Comparator.naturalOrder());
        
        System.out.println("El elemento minimo de la lista es: " + lista.get(lista.size()-1) );
    }
    
    public static <T> int search(ArrayList <T> lista, T o){
        int contador =0;
        int posicion = 0;
        boolean find = false;
        for (int i = 0; i < lista.size(); i++) {
            
            if (lista.get(i).equals(o)) {
                find = true;
                posicion = contador;
                break;
            }
            contador ++;
            
        }
        if (find) {
             System.out.println("El objeto esta en la posición: " + (contador ));
        }else{
            contador = -1;
            posicion = -1;
            System.out.println("El objeto esta en la posición: " + contador);
        }
        return posicion;
       
        
        
    }
    
    public static <T> void showList(ArrayList <T> lista){
        for (T element : lista) {
            System.out.println(" "+ element);
        }
    }
    
    public static <T> void eliminar(ArrayList <T> lista, T o){
        int pos = search(lista,o);
        if (pos >= 0) {
            lista.remove(pos);
        }else{
            System.out.println("No se encontró nada en la lista");
        }
        showList(lista);
        
    }
}
