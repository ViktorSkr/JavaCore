package com.viktorskr.javacore.chapter09.exam;


//сущность, описывающая игровое поле

class Field {

      char playingf[][] = {
             {'1', '2', '3'},
             {'4', '5', '6'},
             {'7', '8', '9'}
     };

     //Ресуем игровое поле

     void print() {
         System.out.println("-------");
         for (int i = 0; i < 3; i++) {
             System.out.print( "|");
             for (int j = 0; j < 3; j++) {
                 System.out.print(playingf[i][j] + "|");
             }
             System.out.println("\n-------");
         }
         System.out.println();
     }

     // Ставим символ в указанную позицию
     public void push(char p, char s) {
         for (int i = 0; i < 3; i++)
             for (int j = 0; j < 3; j++)
                 if (p == playingf[i][j])
                     playingf[i][j] = s;
          }


 }
