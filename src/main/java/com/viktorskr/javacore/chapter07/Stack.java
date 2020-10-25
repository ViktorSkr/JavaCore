package com.viktorskr.javacore.chapter07;

//В этом классе определяется целочисленный стек,
//содержащий 10 значений.

class Stack {
    /*
    Теперь переменные Stack и tos являются закрытыми.
    Это означает, что они не могут быть случайно или
    намеренно изменены таким образом, чтобы нарушить стек
     */
    private int stck[] = new int[10];
    private int tos;

    //инициализировать вершину стека
    Stack(){
        tos = -1;
    }
    //Разместить элемент в стеке
    void push(int item){
        if (tos==9)
            System.out.println("Стек заполнен. ");
        else
            stck[++tos] = item;
    }
}
