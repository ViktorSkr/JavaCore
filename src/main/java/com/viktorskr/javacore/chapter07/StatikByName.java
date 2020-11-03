package com.viktorskr.javacore.chapter07;

class StatikDemo {
    static int a = 42;
    static int b = 99;

    static void calime() {
        System.out.println("a = " + a);
    }
}
class StatikByName {
    public static void main(String[] args) {
        StatikDemo.calime();
        System.out.println("b - " + StatikDemo.b);
    }
}
