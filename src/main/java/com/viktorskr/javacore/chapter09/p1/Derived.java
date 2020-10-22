package com.viktorskr.javacore.chapter09.p1;

class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор подкласа");
        System.out.println("n = " + n);

        //доступен только для класса
        //System.out.println("n_зкш = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
