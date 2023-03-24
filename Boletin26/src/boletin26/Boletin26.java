/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin26;

import java.util.ArrayList;

/**
 *
 * @author marcosfa
 */
public class Boletin26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creo 6 jugadores
        Jugador j1 = new Jugador("Luis",22);
        Jugador j2 = new Jugador("Juan",18);
        Jugador j3 = new Jugador("andres",22);
        Jugador j4 = new Jugador("Julian",24);
        Jugador j5 = new Jugador("Marcos",28);
        Jugador j6 = new Jugador("Marcos",12);
        
        //creo una lista de jugadores
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        //añado solo 5 jugadores a la lista
         Operaciones.addElement(listaJugadores, j1);
         Operaciones.addElement(listaJugadores, j2);
         Operaciones.addElement(listaJugadores, j3);
         Operaciones.addElement(listaJugadores, j4);
         Operaciones.addElement(listaJugadores, j5);
       
         //busco un jugador
        Operaciones.search(listaJugadores, j3);
        //muestro el elemento minimo y el máximo
         Operaciones.minElement(listaJugadores);
        Operaciones.maxElement(listaJugadores);
        
        //busco elemento con funciones .min y .max
        Operaciones.elementoMinimo(listaJugadores);
        
        Operaciones.showList(listaJugadores);
        
        ArrayList<Integer> lista1 = new ArrayList<>();
        Operaciones.addElement(lista1, 4);
        Operaciones.addElement(lista1, 6);
        Operaciones.addElement(lista1, 3);
        Operaciones.addElement(lista1, 1);
        
        Operaciones.minElement(lista1);
        Operaciones.maxElement(lista1);
        
        Operaciones.search(lista1, new Integer (3)  );
        
        Operaciones.showList(lista1);
        
        Operaciones.eliminar(listaJugadores, j5);
        
    }
    
}
