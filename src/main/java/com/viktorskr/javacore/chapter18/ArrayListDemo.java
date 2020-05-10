package com.viktorskr.javacore.chapter18;

import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String args[]){

        //Создать Списочьный масив

        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальтный размер Списочного масива al " + al.size());

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add("G");
        al.add(1, "A2");
        al.add(3, "B2");

        System.out.println("Размер масива после ввода елементов " + al + " размер " + al.size());

        al.remove("F");
        al.remove(2);


        System.out.println("Вывод месива после удаления элементов " + al + " размер " + al.size());

    }
 }