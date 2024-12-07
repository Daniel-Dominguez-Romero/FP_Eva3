/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fp_exa_practico_2da_evaluacion;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class FP_EXA_PRACTICO_2da_EVALUACION {
    
  

    public static void main(String[] args) {
        
        Scanner captu = new Scanner(System.in);   
        
        double calificacion; 
        int numEstudiantes; 
        
        
        double promedio;
        int califasMayores;
        double califasAlta;
        double califasBaja;
        
        System.out.print("Ingrese la cantidad de estudiantes: ");
        
        numEstudiantes = captu.nextInt(); 
        captu.nextLine(); 
        
        double[] calificaciones = new double[numEstudiantes];

        
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la calificación del estudiante #" + (i + 1) + " de entre 0 a 100" + ": ");
            calificacion = captu.nextDouble();
            captu.nextLine(); 
            
            if (calificacion < 0 || calificacion > 100) {
                System.out.println("La calificación debe estar entre 0 y 100.");
                i--; 
            } else {
                calificaciones[i] = calificacion;
            }
        }
    
       
        promedio = califaProm(calificaciones);
        califasMayores = contarCalifasMayores(calificaciones, promedio);
        califasAlta = getHigherGrade(calificaciones);
        califasBaja = getLowerGrade(calificaciones);

        
        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Número de calificaciones mayores o iguales al promedio: " + califasMayores);
        System.out.println("Calificación más alta: " + califasAlta);
        System.out.println("Calificación más baja: " + califasBaja);
        
    }
    
    public static double califaProm(double[] calificaciones) {
        
        double suma = 0;
        
        for (double calificacion : calificaciones) {
            suma = suma + calificacion;
        }
        return suma / calificaciones.length;
    }
    
    
    

    public static int contarCalifasMayores(double[] calificaciones, double promedio) {
        
        int contador = 0;
        
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador = contador + 1;
            }
        }
        return contador;
    }
 
    
    
    
    
    public static double getHigherGrade(double[] calificaciones) {
        
        double maxima = calificaciones[0];
        
        for (double calificacion : calificaciones) {
            if (calificacion > maxima) {
                maxima = calificacion;
            }
        }
        return maxima;
    }
    
    
    

    public static double getLowerGrade(double[] calificaciones) {
        
        double minima = calificaciones[0];
        
        for (double calificacion : calificaciones) {
            if (calificacion < minima) {
                minima = calificacion;
            }
        }
        return minima;
    }
}
