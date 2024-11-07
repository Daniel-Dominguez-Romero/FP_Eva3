/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_metodos_arreglados;

/**
 *
 * @author danie
 */
public class Eva3_5_METODOS_ARREGLADOS {

    public static void main(String[] args) {
    String diasSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    imprimirArreglo(diasSemana); 
    String meses [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("");
    imprimirArreglo(meses); 
        System.out.println("");
    int billetes[] = {20, 50, 100, 200, 500}; 
    imprimirArreglo(billetes); 
      }

    public static void imprimirArreglo(String[] arreglo){
        for(int i = 0; i < arreglo.length; i++)
           System.out.println(arreglo[i]);
            
    }
    public static void imprimirArreglo(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++)
           System.out.println(arreglo[i]);
    }
}
