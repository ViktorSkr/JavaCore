package com.viktorskr.javacore.chapter09.exam;
import java.io.IOException;
import java.util.Random;

//содержит бизнес-логику игры

class GamesLogic {

    Field field = new Field();
    Random random = new Random();

    char ustep;
    char pstep;

    boolean winner(char str){

        if (str == field.playingf[0][0] & str == field.playingf[0][1] & str == field.playingf[0][2])
            return true;
        if (str == field.playingf[1][0] & str == field.playingf[1][1] & str == field.playingf[1][2])
            return true;
        if (str == field.playingf[2][0] & str == field.playingf[2][1] & str == field.playingf[2][2])
            return true;
        if (str == field.playingf[0][0] & str == field.playingf[1][0] & str == field.playingf[2][0])
            return true;
        if (str == field.playingf[0][1] & str == field.playingf[1][1] & str == field.playingf[2][1])
            return true;
        if (str == field.playingf[0][2] & str == field.playingf[1][2] & str == field.playingf[2][2])
            return true;
        if (str == field.playingf[0][0] & str == field.playingf[1][1] & str == field.playingf[2][2])
            return true;
        if (str == field.playingf[2][0] & str == field.playingf[1][1] & str == field.playingf[0][2])
            return true;
        return false;
    }

    char pcstep() {

        char pc;
        int test=0;

        do {

            pc = (char) (49 + random.nextInt(9));

            for (char x[] : field.playingf) {
                for (char y : x) {
                    if (y >= '1' & y <= '9')
                        ++test;

                    if (y == pc)
                        return pc;
                }
            }
        } while (test != 0) ;

        System.out.println(draw);
        return 0;
        }


    char userstep() throws IOException {

        char step;

        System.out.println(stuser);

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
                System.out.println(winuser);
                break;
            }

            pstep = pcstep();
            field.push(pstep, 'O');
            field.print();
            computer = winner('O');

            if (computer) {
                System.out.println(winpc);
                break;
            }

        } while (pstep != 0);
    }

    String stuser = "Сделайте свой ход";
    String winuser = "Вы выиграли";
    String winpc = "Выиграл компъютер";
    String draw = "Ничья";
}

