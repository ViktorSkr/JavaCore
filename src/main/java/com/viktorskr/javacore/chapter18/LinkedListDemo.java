package com.viktorskr.javacore.chapter18;

import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String args[]){
        //Создать связный список
        LinkedList<String> ll = new LinkedList<String>();

        //ввести элемент в связный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

           System.out.println("Исходное содержимое связного Списка ll " + ll);

           //Удалить элементы из списка
        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое списка после удаления элементов " + ll );

        //Удалить первый и последний элемент
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Содержимое после удаления первого " +
                "и последнего элементов " + ll );

        //Получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");
        System.out.println("Содержимое списка после изменения " + ll);
    }
}
