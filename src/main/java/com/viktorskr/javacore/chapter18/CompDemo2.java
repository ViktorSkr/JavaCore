package com.viktorskr.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

class CompDemo2 {
    public static void main(String[] args){

        //Передать компаратор с обратным упорядочением
        //древовидному множеству типа TreeSet
        TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());

        //Ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //Вывести элементы из древовидного множества
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
