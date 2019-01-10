package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a >= b && a >= c) {
            System.out.print(a + " ");
            if (b >= c) {
                System.out.print(b + " ");
                System.out.print(c);
            } else {
                System.out.print(c + " ");
                System.out.print(b);
            }
        } else if (b >= a && b >= c) {
            System.out.println(b + " ");
            if (a >= c) {
                System.out.print(a + " ");
                System.out.print(c);
            } else {
                System.out.print(c + " ");
                System.out.print(a);
            }
        } else if (c >= a && c >= b) {
            System.out.print(c + " ");
            if (a >= b) {
                System.out.print(a + " ");
                System.out.print(b);
            } else {
                System.out.print(b + " ");
                System.out.print(a);
            }
        }

    }
}
