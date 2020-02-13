package com.viktorskr.javacore.chapter18;

import java.util.ArrayList;

class ArrayLisToArray {
    public static void main(String args[]){

        //Создать списочный масив
        ArrayList<Integer> al = new ArrayList<>();

        // Ввести элементы в масив
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println("Содержимое масива al " + al);

        // Получить обычный масив
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;
        for (int i: ia) sum += i;

        System.out.println("Сумма равна " + sum);
    }
}

