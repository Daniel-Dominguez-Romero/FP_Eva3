/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_arreglos_multi2;

/**
 *
 * @author danie
 */
public class Eva3_9_ARREGLOS_MULTI2 {

    public static void main(String[] args) {
        
        int[] billetes = {20, 50, 100, 200, 500, 1000};
        
        System.out.println(billetes.length);
    
        String[][] ciudades = {{"Aguascalientes","Calvillo","Jesus Maria"},
                               {"Ensenada","Mexicali","Tecate", "Tijuana"},
                               {"La Paz", "Cabo San Lucas","San Jose del Cabo"}};
        
        
        
  
        for (int i = 0; i < ciudades.length; i ++) {
            for (int j = 0; j <ciudades[i].length; j++) {
                        System.out.println(ciudades[i][j]);

            }
        }
        
    }
    }
                
