package com.viktorskr.javacore.chapter09.exam;
import java.io.IOException;
import java.util.Random;

//содержит бизнес-логику игры

class GamesLogic {

    Field field = new Field();

    char ustep;
    char pstep;

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
        boolean ver;

        Random random = new Random();

        for (int i=0; i<20; i++) {

            pc = (char) (49 + random.nextInt(9));
            ver = verificationsteppc(pc);

            if (ver)
                return pc;

            } System.out.println("Ходов больше нет");
        return 0;
    }

    boolean verificationsteppc(char ver){
        char pc = ver;
        for (char x[] : field.a) {
            for (char y : x) {
                if (y == pc) {
                    return true;
                }
            }
        }return false;
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
            ustep = userstep();
            field.push(ustep, 'X');
            field.print();
            user = winner('X');

            if (user) {
                System.out.println("Вы выиграли ");
                break;
            }

            pstep = pcstep();
            field.push(pstep, 'O');
            field.print();
            computer = winner('O');

            if (computer) {
                System.out.println("Выиграл компъютер ");
                break;
            }

        } while (pstep != 0);
    }



}