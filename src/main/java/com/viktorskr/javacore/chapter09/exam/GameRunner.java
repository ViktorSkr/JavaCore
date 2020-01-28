package com.viktorskr.javacore.chapter09.exam;

//главный класс приложения, содержащий метод main

class GameRunner {
    public static void main(String args[])
    throws java.io.IOException {

        GamesLogic gl = new GamesLogic();
        Field field = new Field();


         char step;
         char pcstep ='0';

         boolean user = false;
         boolean comp = false;


         field.prn();

         do {

             boolean PcVal;

             System.out.println("Сделайте свой ход");

            do {
               step = (char) System.in.read();
            } while (step < '1' || step > '9');


            field.push(step);
            field.prn();

            user = gl.winner('X');

             if (user) {
                 System.out.println("Вы выиграли ");
                 break;
             }

             System.out.println("Ход компъютера");

             for (PcVal = false ;PcVal == false;) {
                 pcstep = gl.PCStep();
                 PcVal = gl.PCValidate(pcstep);
             }

            field.pushpc(pcstep);
            field.prn();
            comp = gl.winner('O');

             if (comp) {
                 System.out.println("Выиграл компъютер ");
                 break;
             }

        } while (user == false & comp == false);


    }
}