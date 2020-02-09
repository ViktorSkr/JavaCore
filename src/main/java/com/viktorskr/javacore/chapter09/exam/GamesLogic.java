package com.viktorskr.javacore.chapter09.exam;

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

        pc = (char) (1 + Math.random() * 10);

        for (char x[] : field.a) {
            for (char y : x) {
                if (y == pc) {
                    return pc;
                }
            }
        }return 0;
    }

    char userstep(){

        char step;

        do {
            System.out.println("Сделайте свой ход");
            step = (char) System.in.read();
        } while (step < '1' || step > '9');

        return step;
    }


    void start() {

        boolean user;
        boolean comp;

        do {
            boolean pcval;

            field.print();

            userstep = userstep();
            field.push(userstep, 'X');
            field.print();

            user = winner('X');

            if (user) {
                System.out.println("Вы выиграли ");
                break;
            }

            System.out.println("Ход компъютера");

            pcstep = pcstep();
            field.push(pcstep, 'O');
            field.print();
            comp = winner('O');

            if (comp) {
                System.out.println("Выиграл компъютер ");
                break;
            }

        } while (user == false & comp == false);
    }



}