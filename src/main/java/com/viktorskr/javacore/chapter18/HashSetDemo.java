package com.viktorskr.javacore.chapter18;

import java.util.HashSet;
import java.util.LinkedHashSet;

class HashSetDemo {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<String>();
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println("HashSet " + hs);

        LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
        hs1.add("Бета");
        hs1.add("Альфа");
        hs1.add("Эта");
        hs1.add("Гамма");
        hs1.add("Эпсилон");
        hs1.add("Омега");

        System.out.println("LinkedHashSet " + hs1);
    }
}
