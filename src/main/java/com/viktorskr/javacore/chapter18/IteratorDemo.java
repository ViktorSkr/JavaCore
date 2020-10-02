package com.viktorskr.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class IteratorDemo {
    public static void main(String args[]){
        //Создать списочный масив
        ArrayList<String> al = new ArrayList<String>();

        // Ввести элементы в массив

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        //Использовать итератор для вывода содержимого
        //списочного массива al

        System.out.print("Исодное содержимое списочного масива al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Видоизменить перебираемые объекты
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }

        System.out.print("Измененное содержимое списочного масива al: ");
        itr = al.iterator();
        while (itr.hasNext())
        {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Отобразить список в обратном порядке

        System.out.print("Измененный список в обратном порядке; ");
        while (litr.hasPrevious())
        {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
