package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        if (a > 0) {
            System.out.println(a * 2);
        } else if (a < 0) {
            System.out.println(++a);
        } else {
            System.out.println(0);
        }

    }

}