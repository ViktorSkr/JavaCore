package com.viktorskr.javacore.chapter09.p2;

class Protection2 extends com.viktorskr.javacore.chapter09.p1.Protection {
    Protection2() {
        System.out.println("Конструцктор унаследован из другого пакета");
        // доступно только для данного класса или пакета
        //System.out.println("n = " + n);

        // Доступно только для данного класса
        // System.out.println("n_pri = " + n_pri):

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
