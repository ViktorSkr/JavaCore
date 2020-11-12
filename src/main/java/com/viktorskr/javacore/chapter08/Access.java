package com.viktorskr.javacore.chapter08;

class A3 {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

class B3 extends A3 {
    int total;

    /* void sum() {
        total = i + j;
    } */
}

class Access {
    public static void main(String args[]) {
        B3 subOb = new B3();
        subOb.setij(10, 12);
        // subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
