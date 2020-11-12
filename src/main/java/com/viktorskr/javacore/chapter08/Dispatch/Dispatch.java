package com.viktorskr.javacore.chapter08.Dispatch;

// Динамтческая диспетчеризация методов

class A {
    void callme () {
        System.out.println("В методе callme() из класса А");
    }
}

class B extends A{
    // преопределить метод callme
    void callme() {
        System.out.println("В метеде callme() из класса B");
    }
}

class C extends A {
    // переопределить метод callme
    void callme() {
        System.out.println("В методе callme() из класса C");
    }
}


class Dispatch {
    public static void main(String args[]) {
        A a = new A(); // объект класса А
        B b = new B(); // объект класса В
        C c = new C(); // объект класса С

        A r;            // получить ссылку на объект типа А

        r = a;          // переменная r ссылается на объект типа А
        r.callme();     // вызвать вариант метода callme(),
        // определенный в класе А
        r = b;          // переменная r ссылается на объект типа В
        r.callme();     // вызвать вариант метода callme(),
        // определенный в классе В
        r = c;          // переменная r ссылается на объект типа С
        r.callme();     // вызвать вариант метода    callme(),
        // определенный в классе С
    }
}
