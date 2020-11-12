package com.viktorskr.javacore.chapter08;

// В этом примере наследование применяется
// для расширения класса Box


class Box {
        private double width;
        private double height;
        private double depth;

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
    //Конструировать клон объекта
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    //Конструктор, применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    //Конструктор, применяемый по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }
    //Конструктор применяемый при создании куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

// Клас добавляющий стоимость доставки
class Shipment extends BoxWeight{
    double cost;


}


//Етот класс расширяет класс Box, включая в него свойство цвета
class ColorBox extends Box{
    int color;

    ColorBox(double w, double h, double d, int c) {
        super(w, h, d);
        color = c;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        ColorBox mycolor = new ColorBox(3, 7, 6, 5);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();

        vol = mycolor.volume();
        System.out.println("Объем mycolor равен " + vol);
        System.out.println("Цвет mycolor равен " + mycolor.color);
        System.out.println();
    }
}


