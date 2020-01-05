package com.viktorskr.javacore.chapter07;

class Outer1 {
    int outer_x = 100;

    void  test() {
        Inner1 inner = new Inner1();
        inner.display();
    }

    class Inner1 {
        int y = 10; // y - локальная переменная класса Inner

        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
    void showy() {
        // System.out.println(y);//ошибка здесь переменная y не доступна
    }
}

class InnerClassDemo1 {
    public static void main(String args[]) {
        Outer1 outer = new Outer1();
        outer.test();

    }
}
