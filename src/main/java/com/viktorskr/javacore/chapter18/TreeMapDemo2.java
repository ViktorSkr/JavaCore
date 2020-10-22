package com.viktorskr.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;
        //Найти индекс символа с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0)
            return aStr.compareTo(bStr);
        else
            return k;
    }
}

class TreeMapDemo2 {
    public static void main(String[] args){
        //Создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        //Ввести елементы в древовидное множество
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джуйн Бейкер", 1378.00);
        tm.put("Тод Халл", 99.22);
        tm.put("Ральф Смит", -19.08);

        //Получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //Вывести элементы из множества
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + " ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //Ввести суму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}
