package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        byte[] b = Integer.toString(a).getBytes();
        if (a >= 1 && a <= 999) {
            if (a % 2 == 0 && b.length == 1) System.out.println("четное однозначное число");
            if (a % 2 == 0 && b.length == 2) System.out.println("четное двузначное число");
            if (a % 2 == 0 && b.length == 3) System.out.println("четное трехзначное число");
            if (a % 2 != 0 && b.length == 1) System.out.println("нечетное однозначное число");
            if (a % 2 != 0 && b.length == 2) System.out.println("нечетное двузначное число");
            if (a % 2 != 0 && b.length == 3) System.out.println("нечетное трехзначное число");
        }

    }
}
