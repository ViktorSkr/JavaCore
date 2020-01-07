package com.viktorskr.javacore.chapter09.p2;

import javax.annotation.processing.SupportedSourceVersion;

public class OtherPackage {
    OtherPackage() {
        com.viktorskr.javacore.chapter09.p1.Protection p = new com.viktorskr.javacore.chapter09.p1.Protection();
        System.out.println(" Конструктор из другого пакета");

        // доступен только для данного класса или пакета
        // System.out.println("n = " + p.n);

        // доступен только для данного класса
        // System.out.println("n_pri = " + p.n_pri);

        // доступно только данного класса, подкласса или пакета
        // System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}