package com.viktorskr.javacore.chapter05;

// Применение операторя break в качестве цивилизационной
// формы оператора goto

class Break {
    public static void main(String args[]){
        boolean t = true;
        first: {
            second: {
                third:{
                    System.out.println("Предшествует оператору break.");
                    if (t) break second; //выход из блока second
                    System.out.println("Этот оператор не будет выполнятся");
                }
                System.out.println("Этот оператор не будет выполнятся");
            }
            System.out.println("Этот оператор следует за блоком second.");
        }
    }
}
