package com.viktorskr.javacore.chapter07;

//Усовершенствованный класс Stack, в котором
//использован член длины масива
class Stack1 {
    private int stck[];
    private  int tos;

    //выделить память под стек и инициализировать его
    Stack1(int size) {
        stck = new  int[size];
        tos = -1;
    }

    //разместить элемент в стеке
    void push(int item) {
        if (tos == stck.length-1) //Использовать член длины масива
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    //Извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }

}

class TestStack2 {
    public static void main(String args[]) {
        Stack1 mystack1 = new Stack1(5);
        Stack1 mystack2 = new Stack1(8);

        //Разместить числа в стеке
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        // Извлечь числа из стека
        System.out.println("Стек в mystack1:");
        for (int i=0; i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for (int i=0; i<8; i++)
            System.out.println(mystack2.pop());

    }
}