package com.viktorskr.javacore.chapter09.p2;


class OtherPackage {
    OtherPackage() {
        com.viktorskr.javacore.chapter09.p1.Protection p = new com.viktorskr.javacore.chapter09.p1.Protection();

        System.out.println("Конструктор из другого пакета");
        System.out.println("n_pub = " + p.n_pub);
    }
}
