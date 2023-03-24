/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin21;

/**
 *
 * @author marcosfa
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio 1 mostrar array al revés:
        Methods.visualizarArray();
        Methods.espacio();
        int []notas = new int [30];
        String [] alumnos = new String[30];
        
        notas = Methods.notasAlumn();
        Methods.espacio();
        alumnos = Methods.notasYalumnos(notas, alumnos);
        Methods.espacio();
        Methods.mostrarNotaAlumno(notas, alumnos);
        Methods.numeroDNI();
      
        
    }
    
}
