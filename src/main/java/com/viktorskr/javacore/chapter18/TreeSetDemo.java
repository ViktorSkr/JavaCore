package com.viktorskr.javacore.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]){
        //Создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<>();

        //Ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);

        System.out.println(ts.subSet("C", "F"));
    }
}
