package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1;
        int j = 1;

        boolean exit = true;
        boolean exit1 = true;
        while (exit) {
            while (exit1) {
                System.out.print(i*j +" ");
                i++;
                if (i >= 11) exit1 = false;
            }
            System.out.println();
            j++;
            if (j >= 11) exit = false;
            else {
                exit1 = true;
                i = 1;
            }
        }

    }
}
