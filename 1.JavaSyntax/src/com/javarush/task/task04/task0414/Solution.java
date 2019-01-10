package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        if (((a % 4) == 0) && ((a % 100) != 0)) {
            System.out.println("количество дней в году: 366");
        } else if (((a % 100) == 0)) {
            if (a % 400 == 0) {
                System.out.println("количество дней в году: 366");
            } else System.out.println("количество дней в году: 365");
        } else System.out.println("количество дней в году: 365");
    }
}