package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {
        if (abs(10-a)<abs(10-b)){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}