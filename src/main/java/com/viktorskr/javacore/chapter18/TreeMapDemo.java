package com.viktorskr.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapDemo {
    public static void main(String args[]){

        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        //ввести элемент в древовидное отображение
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Тод холл", 99.22);
        tm.put("Ральф Смит", -19.88);

        //получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести множество ззаписей
        for (Map.Entry<String, Double> me:set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //ввести сумму 1000 на счет Джон Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джон Доу: " + tm.get("Джон Доу"));

    }
}
