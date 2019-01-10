package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] a = new String[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <a.length-2 ; i++) {
            a[i] = bufferedReader.readLine();
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[(a.length - 1) - i]);
        }

    }
}