package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        return (double) i + (((double) i / 100) * 10);
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
