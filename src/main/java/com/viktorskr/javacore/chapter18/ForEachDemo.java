package com.viktorskr.javacore.chapter18;
import java.util.ArrayList;

//Применение цикла for в стиле for each
//для перебора элементов колекции

class ForEachDemo {
    public static void main(String args[]) {
        //Создать списочный масив для целых чисел

        ArrayList<Integer> vals = new ArrayList<>();

        //Ввести числовые значения в списочный массив
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        //ганизовать цикл для вывода числовых значений
        System.out.print("Исходное содержима списочногомасива vals; ");
        for (int v : vals)
            System.out.print(v + " ");
        System.out.println();

        // Сумировать числовые значения в цикле for
        int sum = 0;
        for (int v : vals)
            sum += v;

        System.out.println("Сумма числовых значений " + sum);
    }
}
