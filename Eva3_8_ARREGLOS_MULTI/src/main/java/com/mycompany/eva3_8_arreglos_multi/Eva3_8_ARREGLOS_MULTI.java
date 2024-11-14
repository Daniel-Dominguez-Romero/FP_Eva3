/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_arreglos_multi;

/**
 *
 * @author danie
 */
public class Eva3_8_ARREGLOS_MULTI {

    public static void main(String[] args) {

     int[][][] cubo = new int [10][10][10]; 
     
        //LENADO
        System.out.println(cubo.length);
        System.out.println(cubo[1].length);
        System.out.println(cubo[0][0].length);

        for (int i = 0; i < cubo.length; i++) {//1ER DIMENCION
            for (int j = 0; j < cubo[i].length; j++) {//2DA DIMENACION
                for (int k = 0; k < cubo[i][j].length; k++) { //3RA DIMENCION 
                    cubo[i][j][k] = (int)(Math.random() * 100); 
                }
                
            }
            
        }//IMPRIMIR VALORES 
        for (int i = 0; i < cubo.length; i++) {//1ER DIMENCION
            for (int j = 0; j < cubo[i].length; j++) {//2DA DIMENACION
                for (int k = 0; k < cubo[i][j].length; k++) { //3RA DIMENCION 
                    System.out.print("[" + cubo[i][j][k]+ "]"); 
                }
                
            }
            
        }
       
    }
}
