package com.viktorskr.javacore.chapter05;

// Использовать символьные строки для управления оператором switch

class StringSwitch {
    public static void main(String args[]){
        String str = "три";
        switch (str){
            case "один":
                System.out.println("Один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("не совпало");
                break;
        }
    }
}
