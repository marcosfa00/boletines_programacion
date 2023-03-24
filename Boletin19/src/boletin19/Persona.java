/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin19;

/**
 *
 * @author marcosfa
 */
public class Persona  implements IPodeCantar{

    @Override
    public void cantar() {
       String notas = "DO,RE,MI,FA,SOL,LA,SI";
        String[] notas_separadas = notas.split(",");
        for (int i = 0; i < notas_separadas.length; i++) {
            System.out.print(notas_separadas[i] + " ");
            
        }
        System.out.println("");
       
    }
   
    
}
