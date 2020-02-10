package com.viktorskr.javacore.chapter09.exam;


//сущность, описывающая игровое поле

class Field {

      char a[][] = {
             {'1', '|', '2', '|', '3'},
             {'-', '-', '-', '-', '-'},
             {'4', '|', '5', '|', '6'},
             {'-', '-', '-', '-', '-'},
             {'7', '|', '8', '|', '9'}
     };

     //Ресуем игровое поле

     void print() {
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++)
                 System.out.print(a[i][j]);
             System.out.println(" ");
         }
         System.out.println();
     }

     // Ставим символ в указанную позицию
     public void push(char p, char s) {
         for (int i = 0; i < 5; i++)
             for (int j = 0; j < 5; j++)
                 if (p == a[i][j])
                     a[i][j] = s;
          }


 }
