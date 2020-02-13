package com.viktorskr.javacore.chapter18;

import javax.swing.*;
import java.util.PriorityQueue;

class Test {
       public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(3);
        pq.add(3);
        pq.add(1);
        pq.add(2);
        pq.add(4);
        pq.add(6);
        pq.add(5);
        System.out.println("Содержимое Comparator " + pq.comparator());
        System.out.println("Содержимое pq " + pq +" Размер pq " + pq.size());
    }
}
