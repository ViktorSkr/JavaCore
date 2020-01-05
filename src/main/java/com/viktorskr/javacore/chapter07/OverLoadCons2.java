package com.viktorskr.javacore.chapter07;

public class OverLoadCons2 {

    private static class Box {
        double width;
        double height;
        double depth;

        Box(Box ob) {
            width = ob.width;
            height = ob.height;
            depth = ob.depth;
        }
        Box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }

        Box() {
            width = -1;
            height = -1;
            depth = -1;
        }

        Box(double len) {
            width = height = depth = len;
        }

        double volume() {
            return width * height * depth;
        }

    }

    public static void main(String  args[]) {

        // Создать параллелепипеды, используя
        // разные понструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);

        double vol;

        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("объем mybox1 равен " + vol);

        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("объем mybox2 равен " + vol);

        //получить объем куба
        vol = mycube.volume();
        System.out.println("объем куба равен " + vol);

        //получить объем клона
        vol = myclone.volume();
        System.out.println("объем клона равен " + vol);

    }
}