package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] =  Integer.parseInt(reader.readLine());
        }

        Arrays.sort(a);

        System.out.println(a[a.length-1]);
    }
}
