package com.viktorskr.javacore.chapter08;

// В этом примере наследование применяется
// для расширения класса Box


import jdk.internal.platform.cgroupv1.SubSystem;

class Box {
        double width;
        double height;
        double depth;

        // Сконструировать клон объекта
        Box (Box ob) {
            width = ob.width;
            height = ob.height;
            depth = ob.depth;
        }

        //Конструктор применяемый при указании всех объектов
        Box (double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }

        //Конструктор применяемый в отсутствии размеров
        Box() {
            width = -1;
            height = -1;
            depth = -1;
        }

        //Конструктор применяемый при создании куба
        Box(double len) {
            width = height = depth = len;
        }

        //Расчитать и возвратить объем
        double volume() {
            return  width * height * depth;
        }
}
// Расширить класс Box включив в него поле веса
class BoxWeight extends Box {
    double weight;

    //Конструктор BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

//Етот класс расширяет класс Box, включая в него свойство цвета
class ColorBox extends Box{
    int color;

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();
    }
}


