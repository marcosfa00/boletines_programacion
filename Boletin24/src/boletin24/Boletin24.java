/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin24;

import com.boletin24.Metodos.Methods;
import com.boletin24.Metodos.MyException;

/**
 *
 * @author marcosfa
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
       Methods.addLibro();
       Methods.addLibro();
       try{
  
       Methods.showLista();
       Methods.showLibros();
       Methods.venderLibros();
       Methods.showLibros();
       Methods.darDeBaja();
       Methods.consultarLibro();
     
       }catch(MyException x){
           System.out.println(x.getMessage());
       }
      
       
       
    }
    
}
