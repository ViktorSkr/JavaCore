package com.viktorskr.javacore.chapter09.exam;

//содержит бизнес-логику игры

class GamesLogic {

    boolean winner(char str){
        if (str == Field.a[0][0] & str == Field.a[0][2] & str == Field.a[0][4])
            return true;
        else;
        if (str == Field.a[2][0] & str == Field.a[2][2] & str == Field.a[2][4])
            return true;
        else;
        if (str == Field.a[4][0] & str == Field.a[4][2] & str == Field.a[4][4])
            return true;
        else;
        if (str == Field.a[0][0] & str == Field.a[2][0] & str == Field.a[4][0])
            return true;
        else;
        if (str == Field.a[0][2] & str == Field.a[2][2] & str == Field.a[4][2])
            return true;
        else;
        if (str == Field.a[0][4] & str == Field.a[2][4] & str == Field.a[4][4])
            return true;
        else;
        if (str == Field.a[0][0] & str == Field.a[2][2] & str == Field.a[4][4])
            return true;
        else;
        if (str == Field.a[4][0] & str == Field.a[2][2] & str == Field.a[0][4])
            return true;
        else;
        return false;
    }


    boolean PCValidate(char vl) {

        boolean val = false;

            for (char x[] : Field.a) {
                for (char y : x) {
                    if (y == vl) {
                        val = true;
                    }
                }
            }return val;
    }



    char PCStep(){
        char test[] = {'1','2','3','4','5','6','7','8','9'};
        int PC;
        PC = (int) (Math.random() * 9);
        return test[PC];

    }

}