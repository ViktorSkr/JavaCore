package com.viktorskr.javacore.chapter09.exam;
import java.io.IOException;
import java.util.Random;

//содержит бизнес-логику игры

class GamesLogic {

    Field field = new Field();

    char userstep;
    char pcstep;

    boolean winner(char str){

        if (str == field.a[0][0] & str == field.a[0][2] & str == field.a[0][4])
            return true;
        else;
        if (str == field.a[2][0] & str == field.a[2][2] & str == field.a[2][4])
            return true;
        else;
        if (str == field.a[4][0] & str == field.a[4][2] & str == field.a[4][4])
            return true;
        else;
        if (str == field.a[0][0] & str == field.a[2][0] & str == field.a[4][0])
            return true;
        else;
        if (str == field.a[0][2] & str == field.a[2][2] & str == field.a[4][2])
            return true;
        else;
        if (str == field.a[0][4] & str == field.a[2][4] & str == field.a[4][4])
            return true;
        else;
        if (str == field.a[0][0] & str == field.a[2][2] & str == field.a[4][4])
            return true;
        else;
        if (str == field.a[4][0] & str == field.a[2][2] & str == field.a[0][4])
            return true;
        else;
        return false;
    }

    char pcstep(){

        char pc;

        Random random = new Random();
        pc = (char) (49 + random.nextInt(9));

        for (char x[] : field.a) {
            for (char y : x) {
                if (y == pc) {
                    return pc;
                }
            }
        }return 0;
    }

    char userstep() throws IOException {

        char step;

        System.out.println("Сделайте свой ход");

        do {
            step = (char) System.in.read();
        } while (step < '1' | step > '9');

        return step;
    }


    void start() throws IOException {

        boolean user;
        boolean computer;

        field.print();

        do {
            userstep = userstep();
            field.push(userstep, 'X');
            field.print();
            user = winner('X');

            if (user) {
                System.out.println("Вы выиграли ");
                break;
            }

            pcstep = pcstep();
            field.push(pcstep, 'O');
            field.print();
            computer = winner('O');

            if (computer) {
                System.out.println("Выиграл компъютер ");
                break;
            }

        } while (user == false & computer == false);
    }



}