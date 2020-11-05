package com.viktorskr.javacore.chapter08;

class A1 {
    int i, j;

    void showij() {
        System.out.println("i & j: " + i + " " + j);
    }
}

class B1 extends A1 {

    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }
}

class SimpleInheritance {
    public static void main(String args[]) {
        A1 superOb = new A1();
        B1 subOb = new B1();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Сумма объекта subOb i, j, k: ");
        subOb.sum();
    }
}
