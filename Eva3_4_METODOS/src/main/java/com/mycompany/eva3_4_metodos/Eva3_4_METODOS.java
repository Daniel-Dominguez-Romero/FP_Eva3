/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos;

/**
 *
 * @author danie
 */
public class Eva3_4_METODOS {

    public static void main(String[] args) {
        System.out.println(encontrarMayor(10,14));
        System.out.println(encontrarDia(910));
    }
    
    //VALOR MAS GRANDE ENTRE DOS NUMEROS ENTEROS
    public static int encontrarMayor(int num1, int num2){
        /*int resu; 
        if (num1 > num2)
            resu = num1;
        else 
            resu = num2; 
        return resu;*/
        if (num1 > num2){
            return num1; 
        }else { 
            return num2; 
        }
        
    }
    
    
    
    
    //METODO QUE REGRESE EL DIA DE LA SEMANA EN TEXTO. PIDE UN NUMERO 
    //(1 A 7) Y REGRESA: LUNES, MARTES, ETC 
    
    public static String encontrarDia(int day) {
    String semana; 
    
            if(day == 1){
            semana = ("Domingo");
            return semana;
        } else if (day == 2){ 
            semana = ("Lunes");
            return semana; 
        } else if (day == 3){ 
            semana = ("Martes");
            return semana; 
        } else if (day == 4){ 
            semana = ("Miercoles");
            return semana; 
        } else if (day == 5){ 
            semana = ("Jueves");
            return semana; 
        } else if (day == 6){ 
            semana = ("Viernes");
            return semana;
        } else if (day == 7){ 
            semana = ("Sabado"); 
            return semana;
        
        } else 
            return "Apoco si mi ingeniero";
    
    
        }          
    }
    




