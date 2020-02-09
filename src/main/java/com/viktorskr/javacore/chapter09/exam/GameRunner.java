package com.viktorskr.javacore.chapter09.exam;

//главный класс приложения, содержащий метод main

class GameRunner {
    public static void main(String args[]){

        GamesLogic gameslogic = new GamesLogic();
        gameslogic.start();
    }

}
