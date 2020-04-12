package com.viktorskr.javacore.chapter18;

import java.util.EmptyStackException;
import java.util.Stack;

class StackDemo {
    static void showpush(Stack<Integer> st, int a){
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("Стек: " + st);
    }
    static void shpwpop(Stack<Integer> st){
        System.out.print("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("Стек: " + st);
    }
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();

        System.out.println("Стек: " + st);

        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        shpwpop(st);
        shpwpop(st);
        shpwpop(st);

        try {
            shpwpop(st);
        } catch (EmptyStackException e){
            System.out.println("Стек пуст.");
        }
    }
}
