package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if(a>=(b+c)){
            System.out.println("Треугольник не существует.");
        }else if (b>=(a+c)){
            System.out.println("Треугольник не существует.");
        }else if (c>=(a+b)){
            System.out.println("Треугольник не существует.");
        }else System.out.println("Треугольник существует.");
    }
}