package com.viktorskr.javacore.chapter09;

// Пример вложенного интерфейса

// Этот класс содержит интерфейс как свой член

class A {
    // Это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// Класс В реализует вложенный интерфейс
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String args[]) {
        // использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 не отрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не будет видно");
    }
}