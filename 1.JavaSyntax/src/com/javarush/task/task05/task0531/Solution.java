package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        System.out.println("Minimum = " + min(a,b,c,d,e));
    }


    public static int min(int a, int b, int c, int d, int e){
        int [] arrray = new int[5];
        arrray[0] = a;
        arrray[1] = b;
        arrray[2] = c;
        arrray[3] = d;
        arrray[4] = e;
        Arrays.sort(arrray);
        return arrray[0];
    }
}
