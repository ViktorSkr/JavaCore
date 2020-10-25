package com.viktorskr.javacore.chapter07;

/*
В этой программе демонстрируется отличие
модификаторов public и private
 */

class AccessTest {

    private static class Test {
        int a;              //доступ, определяемый по умолчанию
        public int b;       //открытый доступ
        private int c;      //закрытый доступ

        //методы доступа к члену с данного класа
        void setc(int i) { //установить знаение члена с данного класса
            c = i;
        }
        int getc() {        //получить значение члена с данного класса
            return  c;
        }
    }


    public static void main(String[] args) {
        Test ob = new Test();

        //Эти операторы правильны, поэтому члены a и b
        //данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        //Этот оператор не верен и может высвать ошибку
        ob.c = 100;  // ОШИБКА

        //Доступ к члену с данного класса должен осуществлятся
        //с помощью методов ее класса

        ob.setc(100);  //ВЕРНО
        System.out.println("a, b, и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}