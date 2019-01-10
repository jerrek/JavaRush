package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(bufferedReader.readLine());
        double time = t % 5;
        if (time >= 0 && time < 3) {
            System.out.println("зелёный");
        } else if (time >= 3 && time<4) {
            System.out.println("жёлтый");
        } else System.out.println("красный");

    }
}