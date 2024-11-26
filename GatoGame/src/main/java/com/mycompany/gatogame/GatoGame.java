/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gatogame;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class GatoGame {

    public static void main(String[] args) {
        //FALTA
        //VERIFICAR CUANDO ES EMPATE 
        
        
        int FilaUsu; 
        int ColumnaUsu; 
        int FilaBot;
        int ColumnaBot; 
        int end = 0; 
        int again;  
        String mensaje = " "; 
        int acumUsu = 0; 
        int acumBot = 0; 
        int acumGames = 0; 
        int casillasOcupadas = 0;
    do {          
    char [][] Cuadro = new char [3][3];
    
    do {
    end = 0; 
    mensaje = " "; 
    acumGames = 0; 
    Matriz(Cuadro); 
    
    do{
    acumGames = acumGames + 2;
    FilaUsu = capturarJugada("Captura la fila (0-2):"); //ESCANEAR POSICION 
    ColumnaUsu = capturarJugada("Capturar la columna (0-2):");        
    
    if(Cuadro[FilaUsu][ColumnaUsu] == 'X' || Cuadro [FilaUsu][ColumnaUsu] == 'O'){ //VERIFICA SI LA POSICION ESTA OCUPADA 
        
        System.out.println("Esa posicion ya esta ocupada, intenta de nuevo");
        continue;
    }break;
    }while(true);
    
    Cuadro[FilaUsu][ColumnaUsu] = 'X'; 
    
    
    if (acumGames >= 9 ) { 
          
          mensaje = "EMPATE";
          end = 1; 
       }
    do {
    FilaBot = jugadaBot();
    ColumnaBot = jugadaBot(); 
    
     if(Cuadro [FilaBot][ColumnaBot] == 'O' || Cuadro[FilaBot][ColumnaBot] == 'X'){ //COMPRUEBA SI LAS CASILLAS ESTAN OCUPADAS 
        continue;
    } break;
    }while (true); 
    
     Cuadro [FilaBot][ColumnaBot] = 'O';
     
      
     
        for (int i = 0; i < 3; i++) { //VERIFICANDO SI EL USUARIO GANO
         for (int j = 0; j < 3; j++) {
             if ((Cuadro [i][0] == 'X') && (Cuadro[i][1] == 'X') && (Cuadro[i][2] == 'X')||
                (Cuadro[0][j] == 'X') && (Cuadro[1][j] == 'X') && (Cuadro[2][j] == 'X') ||
                (Cuadro[0][0] == 'X') && (Cuadro[1][1] == 'X') && (Cuadro [2][2] == 'X') ||
                (Cuadro[0][2] == 'X') && (Cuadro [1][1] == 'X') && (Cuadro [2][0] == 'X')){
                 end = 1; 
                 mensaje = "GANASTE"; 
             break; 
             }
          }  
        } 
        
        
        
        for (int i = 0; i < 3; i++) { //VERIFICANDO SI EL BOT GANO 
         for (int j = 0; j < 3; j++) {
             if ((Cuadro [i][0] == 'O')&& (Cuadro[i][1] == 'O') && (Cuadro[i][2] == 'O')||
                (Cuadro[0][j] == 'O') && (Cuadro[1][j] == 'O') && (Cuadro[2][j] == 'O') ||
                (Cuadro[0][0] == 'O') && (Cuadro[1][1] == 'O') && (Cuadro [2][2] == 'O') ||
                (Cuadro[0][2] == 'O') && (Cuadro [1][1] == 'O') && (Cuadro [2][0] == 'O')) {
                 end = 1; 
                 mensaje = "PERDISTE";
              break; 
             } 
          }         
        }
        
        
        for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            if (Cuadro[i][j] ==  'X' || Cuadro[i][j] == 'O') {
            casillasOcupadas++; // Incrementa el contador si la casilla está ocupada
            }
          }
       }

        
        
       if (mensaje == "PERDISTE"){ //CONTADOR 
                     acumBot = acumBot + 1;}
       else if(mensaje == "GANASTE"){
           acumUsu = acumUsu + 1;}
        
       
       
       System.out.println(mensaje);
       
      
       
               
    } while(end != 1);
    
    Matriz(Cuadro); 
        
        Scanner captu = new Scanner(System.in);        
        System.out.println("¿Quieres jugar otra vez?");
        System.out.println("ESCRIBE 1 SI QUIERES SEGUIR JUGANDO: ");
        System.out.println("ESCRIBE 2 SI QUIERES TERMINAR LA PARTIDA: ");
        again = captu.nextInt(); 
        captu.nextLine();
          
    }while (again == 1);
    
        System.out.println("JUEGOS GANADOS: " + acumUsu);
        System.out.println("JUEGOS PERDIDOS: " + acumBot);
        
    
  
    }
    public static int capturarJugada (String mensaje){ //AQUI CAPTURA EL USUARIO 
        Scanner captu = new Scanner(System.in); 
        int resu; 
        System.out.println(mensaje);
        resu = captu.nextInt(); 
        captu.nextLine(); 
        return resu; 
         
    }
    public static int jugadaBot (){ //AQUI EL BOT HACE SU JUGADA 
     
     int robot = 0; 
     int f =(int) (Math.random() * 10); 
     if (f <=3) { 
         robot = 0;
     }else if (f>3 && f<=6) {
         robot = 1;
     }else if (f >6) {
         robot = 2; }
     return robot;    
    
    }
    public static void Matriz (char LOL [][]){
      for (int i = 0; i < 3; i++) {//FILAS --> 1ER DIMENCION
                for (int j = 0; j < 3; j++) {//COLUMNAS --> 2DA DIMENCION 
                System.out.print("[ " + LOL[i][j] + " ]");
            }
            System.out.println("");

         }
     }
  
}