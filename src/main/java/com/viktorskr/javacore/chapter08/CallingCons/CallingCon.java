package com.viktorskr.javacore.chapter08.CallingCons;

// Продемонстрировать порядок вызова конструкторов

import java.util.stream.Stream;

class A {
    A() {
        System.out.println("В конструкторе А");
    }
}

class B extends A {
    B() {
        System.out.println("В конструкторе В");
    }
}

class C extends B {
    C() {
        System.out.println("В конструкторе С");
    }
}

class CallingCon {
    public static void main(String args[]) {
        C c = new C();
    }
}
