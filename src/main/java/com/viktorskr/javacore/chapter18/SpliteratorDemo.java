package com.viktorskr.javacore.chapter18;

//Применение интерфейса Spliterator

import java.util.ArrayList;
import java.util.Spliterator;

class SpliteratorDemo {
    public static void main(String args[]){
        //Создать списочный массив типа double
        ArrayList<Double> vals = new ArrayList<>();

        //ввести значение в списочьный массив
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        //Вызвать метод tryAdvance() для вывода содержимого
        //списочного массива vals
        System.out.print("Содержимое списочного масива vals:\n");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        //создать новый списочный массив, содержащий квадратные
        //корни числовых значений из списочного масива vals
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));


        //вызвать метод forEachRemaining() для вывода содержимого
        //списочного массива sqrs
        System.out.println("Содержимое списочного массива sqrs: \n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println(vals);
    }
}
