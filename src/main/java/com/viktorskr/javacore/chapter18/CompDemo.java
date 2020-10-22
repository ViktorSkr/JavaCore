package com.viktorskr.javacore.chapter18;

// Использовать специальный компаратор

import java.util.Comparator;
import java.util.TreeSet;

// Компаратор для сравнения символьных строк в обратном порядке

class MyComp implements Comparator<String>{
    public int compare(String a, String b){
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return bStr.compareTo(aStr);
    }
}

class CompDemo {
    public static void main(String[] args) {

        // создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<>(new MyComp());

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
