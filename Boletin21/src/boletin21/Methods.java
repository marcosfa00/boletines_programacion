/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin21;

import java.lang.reflect.Array;//esto sirve para poder mhacer un short del array
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author marcosfa
 */
public class Methods {
    
    public static void visualizarArray(){
         int[] numeros = new int[6];
        System.out.println("Ejercicio 1:\n\nAl derecho:");
         for (int i = 0; i < numeros.length; i++) {
              int random =(int)( Math.round(1 + Math.random() * 50)); 
            numeros[i] = random;
             System.out.print(numeros[i] +" ");
            
        }
        System.out.println("\nAl reves:");
        for (int i = numeros.length-1 ; i >= 0; i--) {
            System.out.print(numeros[i]+" ");
            
        }
    }
    public static void espacio(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    
    public static int [] notasAlumn(){
        System.out.println("Ejercicio 2:\n");
        
         int[] notas = new int[30];
        int contarAprobados=0;
        int notaMasAlta = 0;
        int suma=0;
        int media =0;
        //le doy valores aleatorios al array notas y las muestro
        for (int i = 0; i < notas.length; i++) {
            int random =(int)( Math.round( Math.random() * 10));
            notas[i]=random;
            System.out.println("notas = "+ notas[i]);
          
        }
        //cuento el numero de aprobados y hago la suma de todas las notas
         for (int i = 0; i < notas.length; i++) {
            if (notas[i]>=5) {
                contarAprobados ++;
            }
            suma+=notas[i];
           
            
        }
         //calculo la media
          media=suma/notas.length;
        //ordeno las notas
         int[] notas_ordenadas= new int[notas.length]; 
         for (int i = 0; i < notas_ordenadas.length; i++) {
            notas_ordenadas[i]=notas[i];
            
        }
          Arrays.sort(notas_ordenadas);
          notaMasAlta = notas_ordenadas[notas.length-1];
        
        System.out.println("nota mas alta "+ notaMasAlta+ " media = "+ media + " numero de aprobados = " + contarAprobados + " el numero de suspensos es: "+ (30-19));
        //devuelvo el aray para usarlo más adelante
        return notas;
        
    }
    
    public static String[] notasYalumnos(int [] notas, String [] alumnos){
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = "Marcos" + i;
            
        }
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("La nota del alumno: " + alumnos[i] + " es: " + notas[i]);
            
        }
        
       return alumnos;
    }
  
    public static void mostrarNotaAlumno(int[] notas,String[]alumnos){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿de que alumno quiere saber la nota?");
        String alumno = sc.next();
        for (int i = 0; i < alumnos.length; i++) {
            if(alumno.equalsIgnoreCase(alumnos[i])){
             System.out.println("la nota del alumno: "+alumnos[i]+" es : "+notas[i]);
            }
            
        }
        
    }
    
   //calcular cualquier numero de DNI
     public static void numeroDNI(){
         String DNI="";
         System.out.println("Introduce tu nº de DNI para comprobar si es correcto");
         Scanner sc = new Scanner(System.in);
         DNI=sc.next();
        String[] div_dni = DNI.split("");
        String letra =div_dni[div_dni.length-1];//aquí se guarda la letra del DNI
        String numeros = "";
        for (int i = 0; i < div_dni.length -1; i++) {
            numeros += div_dni[i];   
        }
        int numero = Integer.parseInt(numeros)  ; //aquí se guardan los numeros del DNI
        System.out.println("numero="+numero);
        int resto = numero % 23;
        System.out.println("Resto= "+resto);
        String[]letras= new String[]{"T","R","W","A","G","M", "Y", "F","P", "D", "X", "B" ,"N" ,"J", "Z", "S","O","V","H", "L","C","K","E"};
        
        System.out.println("los numeros del DNI son " + numeros + " la letra del dni es " + letra);
        if(letra.equalsIgnoreCase(letras[resto])){
            System.out.println("las letras son iguales");
            System.out.println("los numeros del DNI son " + numeros + " la letra del dni es " + letra);
        }else{
             System.out.println("las letras son distintas");
            System.out.println("los numeros del DNI son " + numeros + " la letra del dni debería ser " + letras[resto]);
        }
            
    }
    //apuntes: no tiene que ver con los ejercicios:
    
    public static void ordenar(){
        int [] ordenar=new int[5];
        for (int i = 0; i < ordenar.length; i++) {
            int random =(int)( Math.round( Math.random() * 10));
            ordenar[i]=random;
            System.out.println("numeros = "+ ordenar[i]);
          
        }
        System.out.println("");
        int aux;
        for (int i = 0; i < ordenar.length; i++) {
            for (int j = i+1; j < ordenar.length; j++) {
                if (ordenar[i]>ordenar[j]) {
                    aux=ordenar[i];
                    ordenar[i]=ordenar[j];
                    ordenar[j]=aux;
                }
                
            }
            
        }
        for (int i = 0; i < ordenar.length; i++) {
            System.out.println(ordenar[i]);
            
        }
    }
    
    static int tamanho =0;

    public static float[] crearArray(){
        Scanner sc = new Scanner(System.in);
        float[] temp = new float[10];
        for (int i = 0; i < temp.length; i++) {
           temp[i] = sc.nextFloat();
            
        }
       
        return temp;
        
    }
    
    public static void borrar(float[] array){
        int encontrado = 0;//no está
        for (int i = 0; i < tamanho;i++){
            
        }
    }
    public static void programa(int[] notas){
       
       
        String [] nombres = new String[notas.length-1];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "alumnno" +i;
            
        }
       
        for (int i = 0; i < notas.length; i++) {
            notas[i]= (int)Math.round(Math.random() *10);
            
        }
        
        System.out.println("");
        
       Arrays.sort(notas);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
            
        }
        
        
        
        
         
         
    }
}
    
    
   
