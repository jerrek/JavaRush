package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(bufferedReader.readLine());
        int a2 = Integer.parseInt(bufferedReader.readLine());
        int a3 = Integer.parseInt(bufferedReader.readLine());

        if (a1 == a2) {
            System.out.println(3);
        } else if (a1 == a3) {
            System.out.println(2);
        } else if (a2 == a3) {
            System.out.println(1);
        }
    }
}
