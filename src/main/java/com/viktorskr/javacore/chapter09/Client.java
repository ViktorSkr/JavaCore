package com.viktorskr.javacore.chapter09;

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Мктод Callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В класах реализующих интерфейсы, " +
                "могут определятся и другие члены.");
    }
}
