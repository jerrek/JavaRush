package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] k = new int[10];
        String[] a = new String[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <a.length ; i++) {
            a[i] = bufferedReader.readLine();
        }
        for (int i = 0; i < a.length; i++) {
            k[i] = a[i].length();
            System.out.println(k[i]);
        }
    }
}
