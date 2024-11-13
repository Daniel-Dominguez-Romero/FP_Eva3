/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_matrices;

/**
 *
 * @author danie
 */
public class Eva3_7_MATRICES {

    public static void main(String[] args) {
     int[] arreglo = new int [5];//arreglop unidimencional 
     int[][] matriz = new int [3][3]; //HOJA DE EXCEL 
     matriz [0][0]= 100; //PRIMER POSICION 
     matriz [0][1]= 200;
     matriz [0][2]= 300; 
     matriz [1][0]= 400; 
     matriz [1][1]= 500;
     matriz [1][2]= 600; 
     matriz [2][0]= 700;
     matriz [2][1]= 700;
     matriz [2][2]= 900;//ULTIMA POSICION 
     
        for (int i = 0; i < 3; i++) {//FILES --> 1ER DIMENCION
            for (int j = 0; j < 3; j++) {//COLUMNAS --> 2DA DIMENCION 
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
            
        }
     


    }
}
