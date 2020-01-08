package com.viktorskr.javacore.chapter09.exam;

//главный класс приложения, содержащий метод main

public class GameRunner {
    public static void main(String args[]){
        Field fi = new Field();
        fi.prn();

        fi.push('1');
        fi.prn();

        fi.push('2');
        fi.prn();

        fi.push('5');
        fi.prn();

        fi.push('9');
        fi.prn();

    }
}
