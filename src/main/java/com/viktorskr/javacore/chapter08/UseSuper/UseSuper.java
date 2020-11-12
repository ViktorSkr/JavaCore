package com.viktorskr.javacore.chapter08.UseSuper;

class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a; //член i из класса А
        i = b; //член i из класса В
    }

    void show() {
        System.out.println("Член i в суперклассе " + super.i);
        System.out.println("Член i в подклассе " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1, 2);
        subOb.show();
    }

}
