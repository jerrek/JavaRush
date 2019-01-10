package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        int plus =0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(bufferedReader.readLine());
            if(a[i]>0) plus++;
        }
        System.out.println(plus);



    }
}
