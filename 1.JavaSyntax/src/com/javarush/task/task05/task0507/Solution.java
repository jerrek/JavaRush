package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean exit = true;
        int summ = 0;
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (exit) {
            int a = Integer.parseInt(bufferedReader.readLine());
            if (a == -1) {
                exit = false;
            } else {
                count++;
                summ += a;
            }

        }
        System.out.println( ((double)summ / count));
    }
}

