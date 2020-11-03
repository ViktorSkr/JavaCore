package com.viktorskr.javacore.chapter07;

class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1;

        System.out.println("Длина строки  StrOb1 = " + strOb1.length());
        System.out.println("Символ по индексу 3 = " + strOb1.charAt(3));

        if (strOb1.equals(strOb2))
            System.out.println("strOb1 = StrOb2");
        else
            System.out.println("strOb1 != StrOb2");

        if (strOb1.equals(strOb3))
            System.out.println("strOb1 = StrOb3");
        else
            System.out.println("strOb1 != StrOb3");
        int a=3;
    }
}
