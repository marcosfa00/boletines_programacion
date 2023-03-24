/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import com.marcos.libros.Libro;
import com.marcosfa.mantenimiento.Mantenimiento;
import java.io.File;

/**
 *
 * @author marcosfa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro l1 = new Libro("Un paso por delante de Wall Street","Marcos F. Avendanho",3,15.5f);
        Libro l2 = new Libro("Interpretacion de estados financieros","Warren Buffet",4,98f);
        Libro l3 = new Libro("La caperucita roja","Marcos F. Avendanho",0,15.5f);
        Libro l4 = new Libro("cuentos de adas","Warren Buffet",4,98f);
        Libro l5 = new Libro("el principito","Marcos F. Avendanho",0,15.5f);
        Libro l6 = new Libro("Amelie","Warren Buffet",4,98f);
        File fichero1 = new File("Libreria.txt");
         Mantenimiento.add(fichero1, l1);
          Mantenimiento.add(fichero1, l2);
         Mantenimiento.add(fichero1, l3);
        Mantenimiento.add(fichero1, l4);
        Mantenimiento.add(fichero1, l5);
        Mantenimiento.add(fichero1, l6);
       Mantenimiento.consultar(fichero1,l1 );
        System.out.println("-------------------------------------------------------------------");
        Mantenimiento.mostrar(fichero1);
          System.out.println("-----------------------Ahora se  Borra y se muestra otra vez--------------------------------------------");
        Mantenimiento.borrar(fichero1);
        Mantenimiento.mostrar(fichero1);
       // Mantenimiento.modificarPrecio(fichero1,"Un paso por delante de Wall Street" , 69);
        
    }
    
}
