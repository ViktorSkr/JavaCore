package com.viktorskr.javacore.chapter18;

import java.util.ArrayDeque;

class ArrayDequeDemo {
    public static void main(String args[]){
        //Создать двухстороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();

        //Использовать клас для организации стека
        adq.add("A");
        adq.add("B");
        adq.add("D");
        adq.add("E");
        adq.add("F");

        System.out.println("Размер стека " + adq.size());
        System.out.println("Содержимое масива " + adq);

        System.out.println("Извлкчение из стека");
        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");
        System.out.println();

        System.out.println("Размер стека " + adq.size());
        System.out.println("Содержимое масива " + adq);

    }
}
