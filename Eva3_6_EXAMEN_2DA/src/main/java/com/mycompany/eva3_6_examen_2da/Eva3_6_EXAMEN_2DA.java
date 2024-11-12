/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva3_6_EXAMEN_2DA {

    public static void main(String[] args) {
        int jugadaUsu; 
        int jugadaComp; 
        do { 
        
        jugadaUsu = capturarJugada("Introduce tu jugada (1.PIEDRA 2.PAPEL 3. TIJERA 4.SALIR):"); 
        }while (jugadaUsu != 0); //mientras no quiera salir (opcion 0) 
        
    }
    //PEDIR DATOS AL USUARIO 
    public static int capturarJugada (String mensaje){ 
        Scanner captu = new Scanner(System.in);        
        System.out.println(mensaje);
        int resu = captu.nextInt(); 
        return resu; 
    }
    //GENERAR LA JUGADA DE LA COMPUTADORA 
    public static int generarJugadaComp() { 
        int resu; 
        double valor = Math.random(); 
        if ((valor >= 0) && (valor <0.3))
            resu = 1; //PIEDRA 
        else if ((valor >= .3)&&(valor < .6))
            resu = 2; //PAPEL 
        else
            resu = 3; //TIJERA 
        return resu; 
    }
    //EVALUAR JUGADA o-EMPATE 1-GANO 2-PERDIO 
    public static int evaluarJugadas(int jugadaU, int jugadaC){ 
        //9 POSIBLES CONVINACIONES 
        if ((jugadaU == 1) && (jugadaC == 1))
            
        
        
        
    }
            
            
}
