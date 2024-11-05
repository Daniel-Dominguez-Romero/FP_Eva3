/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva3_3_CAPTURA {

    public static void main(String[] args) {
        
        String nombre = capturarTexto("Introducir tu nombre: "); 
        String apellido = capturarTexto("Introduce tu apellido: "); 
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
         System.out.println();
        int edad = capturarEdad("Introduce tu edad: "); 
        double salario = capturarDouble("Introduce tu salario: ");
        
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        
        
    }
    
    //CAPTURA DE TEXTO
    public static String capturarTexto(String mensaje) { 
        Scanner captu = new Scanner(System.in);        
        System.out.println(mensaje);
        String texto = captu.nextLine(); 
        return texto; 
        
    }
    //METODO PARA CAPTURAR ENTEROS (LO USAREMOS PARA LA EDAD) 
    public static int capturarEdad(String mensaje){
        Scanner captu = new Scanner(System.in);   
        System.out.println(mensaje);
        int edad = captu.nextInt(); 
        captu.nextLine(); 
        return edad; 
          
    }
    //METODO PARA CAPTURAR 
    public static double capturarDouble(String mensaje) { 
        Scanner captu = new Scanner(System.in);        
        System.out.println(mensaje);
        double salario = captu.nextDouble(); 
        captu.nextLine(); 
        return salario; 
    }
    
}
