/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_arreglos_multi3;

/**
 *
 * @author danie
 */
public class Eva3_10_ARREGLOS_MULTI3 {

    public static void main(String[] args) {
        
        int[][][][][] cubo = new int [2][2][2][2][2]; 
     
        //LENADO
        System.out.println(cubo.length);
        System.out.println(cubo[1].length);
        System.out.println(cubo[0][0].length);

        for (int i = 0; i < cubo.length; i++) {//1ER DIMENCION
            for (int j = 0; j < cubo[i].length; j++) {//2DA DIMENACION
                for (int k = 0; k < cubo[i][j].length; k++) { //3RA DIMENCION 
                    for (int l = 0; l < cubo[i][j][k].length; l++) {
                        for (int m = 0; m < cubo[i][j][k][l].length; m++) {
                            cubo[i][j][k][l][m] = (int)(Math.random() * 100); 
                        }
                    }
                   
                }
                
            }
            
        }//IMPRIMIR VALORES 
        for (int i = 0; i < cubo.length; i++) {//1ER DIMENCION
            for (int j = 0; j < cubo[i].length; j++) {//2DA DIMENACION
                for (int k = 0; k < cubo[i][j].length; k++) { //3RA DIMENCION 
                    for (int l = 0; l < cubo[i][j][k].length; l++) {//4TA DIMENCION
                        for (int m = 0; m < cubo[i][j][k][l].length; m++){
                    System.out.print("[" + cubo[i][j][k][l][m]+ "]"); 
                        }
                
                    }
                }
            }
            
        }
        
    }
    
}
