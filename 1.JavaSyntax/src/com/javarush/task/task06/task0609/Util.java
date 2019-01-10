package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(Double.parseDouble(String.valueOf(x2-x1)),2)+(Math.pow(Double.parseDouble(String.valueOf(y2-y1)),2)));
    }

    public static void main(String[] args) {

    }
}
