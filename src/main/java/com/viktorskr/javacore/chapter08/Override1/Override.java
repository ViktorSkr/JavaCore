package com.viktorskr.javacore.chapter08.Override1;

// Метод с отличающимися сигнатурами называется перегружаемым
// а не переопредиляемым

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i & j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Перегрузить метод show
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override {
    public static void main(String args[]) {
       B subOb = new B(1, 2, 3);
        subOb.show("Это к: ");
        subOb.show();
    }
}
