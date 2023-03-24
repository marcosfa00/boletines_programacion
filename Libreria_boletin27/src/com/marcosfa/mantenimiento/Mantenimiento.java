/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marcosfa.mantenimiento;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import com.marcos.libros.Libro;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author marcosfa
 */
public class Mantenimiento {
   private static FileWriter fw = null;
   private  static  PrintWriter pw = null;
   private static Scanner sc = null;
   
   /**
    * Con este metodo anhadimos una linea al final del fichero, en este caso un libro, para añadir el libro correctamente editamos el toString
    * de la clase libros
    * @param fichero indicaos el fichero en el cual vamos a escribir
    * @param l1 indicamos el libroe que queremos añadir al final del ficherp
    */
    public static void add(File fichero,Libro l1){
        try{
            fw = new FileWriter(fichero,true);//añado el True al final para indicar que si el fichero no está creado lo cree
            pw = new PrintWriter(fw);//esto es lo que nos permite escribir en el fichero
            pw.println(l1.toString());//con println añadimos \n al final de la linea
        }catch(IOException e){
            System.out.println("Error al escribir en el fichero" + e.getMessage());
        }
        finally{
            pw.close();
        }
        
        
    }
    
    
    /**
     * En este metodo se consulta el precio de un libro en un fichero
     * @param fichero indicamso el fichero en el cual vamos a buscar
     * @param l1 indicamso el libro del cual vamos a buscar el precio
     */
    public static void consultar(File fichero,Libro l1){
        try{
            Boolean encontrado = false;
            sc = new Scanner(fichero);
            while(sc.hasNextLine()){//Leemos el fichero linea a linea
                String libro = sc.nextLine();//leemos la primera linea del archivo
                String[] partes = libro.split(",");//la guardamos en una matriz por campos
                if(partes[0].equals(l1.getNombre())){//si el libro coincide mostramos titulo y precio
                    System.out.println("El precio del libro: " + partes[0] + " es: " + partes[3]);
                    encontrado = true;
                }
                
                
            }
            
            if(!encontrado){
                System.out.println("No se ha encontrado el libro");
            }
        }catch(IOException ex){
            System.out.println("Error al buscar el libro");
        }
        finally{
            sc.close();
        }
       
    }
    
    
    /**
     * Metodo que muestra todo el fichero
     * @param fichero indicamso el fichero que vamso a mostrar
     */
    public static void mostrar(File fichero){
        int i = 0;
        try{
            sc = new Scanner(fichero);
            while(sc.hasNextLine()){//Leemos linea a linea el fichero
                i ++;
                String libros = sc.nextLine();//Guardamos en Libros la primera linea
                System.out.println("Libro "+ i +": " + libros);//Mostramos esa linea
            }
        }catch(IOException ex){
            System.out.println("error al mosrar los libros");
        }
        finally{
            sc.close();
        }
    }
    /**
     * Existen varias opciones de hacer esto, la primera sería leer el fihcero y grabar los datos en otro fichero diferente,
     * La segunda sería guardar todo en un ArrayList, trabajar en el arrayList y después sobreescribir todo el fichero yna vez ya se han vlcado y modificado todos lso datos
     * @param fichero 
     */
    public static void borrar(File fichero){ //aun no funciona
       //Lo primero que debemso hacer es leer el fichero linea a linea y comprobar el numero de unidades
       ArrayList <Libro> lista = new ArrayList<>();
       try{
           
           sc = new Scanner(fichero);//inicializamos Scanner e indicamso el fichero que va a leer
           
           while(sc.hasNextLine()){//indicamos que va a leer linea a linea
               String libro = sc.nextLine();//Guardamos en este String una libea del fichero (que contine un libro)
               String [] partes = libro.split(",");//nos quedamos con cada una de las partes del libro, la parte 2 son las unidades
               Libro l3 = new Libro(partes[0],partes[1],Integer.parseInt(partes[2]),Float.parseFloat(partes[3]));
               if(l3.getUnidades() !=0){
                   lista.add(l3);
               }
                 
           }
           
           //una vez guardado todos los libros correctamente en el ArrayList procedemso a sobreescribir el fichero
           fw = new FileWriter(fichero);
           pw = new PrintWriter(fw);
           for (int i = 0; i < lista.size(); i++) {
               pw.println(lista.get(i).toString());
               
           }

           
       }catch(IOException ex){
           System.out.println(ex.getMessage());
       }
       finally{
          
           sc.close();
           pw.close();
       }
    }
    
    
    public static void modificarPrecio(File fichero,String titulo,int precio){
        String precio_modificado = String.valueOf(precio);
        Libro l1 = new Libro();
        try{
            Boolean encontrado = false;
            
            sc = new Scanner(fichero);
            while(sc.hasNextLine()){//Leemos el fichero linea a linea
                String libro = sc.nextLine();
               // ArrayList <String> partes = new ArrayList<>();
                String []partes = libro.split(",");
                
                if(partes[0].equals(titulo)){
                   partes[3] = precio_modificado;
                   l1.setNombre(partes[0]);
                   l1.setAutor(partes[1]);
                   l1.setUnidades(Integer.parseInt(partes[2]));
                   l1.setPrecio(Integer.parseInt(partes[3]));
                  Mantenimiento.add(fichero,l1);
                    encontrado = true;
                    break;
                }
                
                
            }
            
            if(!encontrado){
                System.out.println("No se ha encontrado el libro");
            }
        }catch(IOException ex){
            System.out.println("Error al buscar el libro");
        }
        finally{
             sc.close();
               
           
        }
    }
    
    
    public void leerBuffer(File fichero){
        
    }
    
    
    
    
    
}
