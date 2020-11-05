package com.viktorskr.javacore.chapter07;

class VarArgs {
    static void VaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        VaTest(10);
        VaTest(1, 2, 3);
        VaTest();
    }
}
