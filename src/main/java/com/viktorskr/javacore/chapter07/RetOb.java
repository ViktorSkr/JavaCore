package com.viktorskr.javacore.chapter07;

public class RetOb {

    private static class Tets {
        int a;

        Tets(int i) {
            a = i;
        }
        Tets incrByTen() {
            Tets temp = new Tets(a + 10);
            return temp;
        }
    }

    public static void main(String args[]) {
        Tets ob1 = new Tets(2);
        Tets ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2 после второго увеличения значения: " + ob2.a);
    }
}