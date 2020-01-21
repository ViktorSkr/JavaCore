package com.viktorskr.javacore.chapter09.exam;

//главный класс приложения, содержащий метод main

public class GameRunner {
    public static void main(String args[])
    throws java.io.IOException {
        Field field = new Field();
        int i=0;
        while (i<10) {
            char choice;
            do {
                field.prn();
                System.out.println("Сделайте свой ход");
                System.out.println("Вы ходите Крестиком");
                choice = (char) System.in.read();
            } while (choice < '1' || choice > '9');
            field.push(choice);
            i++;
        }

    }
}