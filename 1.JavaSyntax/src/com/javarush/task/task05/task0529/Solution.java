package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean exit = true;
        int summ = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (exit) {
            try {
                int a = Integer.parseInt(bufferedReader.readLine());
                summ += a;
            } catch (Exception e) {
                exit = false;
            }

        }
        System.out.println(summ);
    }
}
