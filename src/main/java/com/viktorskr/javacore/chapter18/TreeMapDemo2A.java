package com.viktorskr.javacore.chapter18;
//Использовать метод thenComparing() для сортировки
//счетов вкладчиков сначала по фамилии а затем имени

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//компаратор сравнивающий фамилии вкладчиков
class CompLastName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        //Найти индекс символа с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

//Отсортировать счета вкладчиков по Ф.И.О., если фамилии одинаковы
class CompThenByFirsName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A {
    public static void main(String[] args) {
        //Использовать метод thenComparing() для создания
        //компаратора, сравнивающего сначала фамилии а затем
        //Ф.И.О. вкладчиков, если фамилии одинаковы
        CompLastName compLN = new CompLastName();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirsName());

        //Создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);
        //Ввести элементы в древовидное множество
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джуйн Бейкер", 1378.00);
        tm.put("Тод Халл", 99.22);
        tm.put("Ральф Смит", -19.08);

        //Получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //Вывести элементы из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue() + ": ");
        }
        System.out.println();

        //Внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остатк на счете Джон Доу: " + tm.get("Джон Доу"));
    }
}
