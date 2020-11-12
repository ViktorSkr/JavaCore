package com.viktorskr.javacore.chapter08;

class  RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox рамен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume(); //Верно так как метод volume() определен в класе Box
        System.out.println("Объем plainbox равен " + vol);

        /* Следующий оператор ошибочен, поскольку член plainbox не определяет член weight.
        System.out.println("Вес plainbox равен " + plainbox.weight);
         */
    }
}