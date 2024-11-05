/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_valor_retorno;

/**
 *
 * @author danie
 */
public class Eva3_2_Valor_Retorno {

    
    public static void main(String[] args) {
    
    //NECESITAMOS RECUPERAR EL VALOR, PARA HACER ALGO CON EL 
    int resu; 
    resu = sumarDosNumeros(5, 10); 
        System.out.println("Resultado = " + resu);
    //segunda alternativa, solo lo necesitas una vez 
        System.out.println("Resultado = " + sumarDosNumeros(5, 10));
   
        
//NO LES INTERESA EL RESULTADO 
    sumarDosNumeros(5, 10);//EL RESULTADO SE PIERDE 
    }
    
    public static int sumarDosNumeros(int num1, int num2) {
        
        int suma; 
        suma = num1 + num2; 
        return suma; 
    }
}
