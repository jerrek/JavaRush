package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean exit = true;
        int summ = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (exit){
            int a = Integer.parseInt(bufferedReader.readLine());
            if(a == -1) {
                summ += a;
                break;
            }
            summ += a;
        }
        System.out.println(summ);
    }
}
