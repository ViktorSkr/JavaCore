package com.viktorskr.javacore.chapter09.exam;
import java.io.IOException;

//главный класс приложения, содержащий метод main

class GameRunner {
    public static void main(String args[]) throws IOException {

        GamesLogic gameslogic = new GamesLogic();
        gameslogic.start();
    }

}
