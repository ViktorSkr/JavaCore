package com.viktorskr.javacore.chapter09.IfTest;

class IfTest2 {
    public static void main(String args[]) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        // В этих стеках увеличеваются размеры кождого стека
        for (int i=0; i<12; i++)
            mystack1.push(i);
        for (int i=0; i<20; i++)
            mystack2.push(i);

        System.out.println("Стек в mystack1:");
        for (int i=0; i<12; i++)
            System.out.print(mystack1.pop() + " ");

        System.out.println("\n"  + "Стек в mystack2:");
        for (int i=0; i<20; i++)
            System.out.print(mystack2.pop() + " ");
    }
}