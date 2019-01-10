package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 0;
        int j = 0;

        boolean exit = true;
        boolean exit1 = true;
        while (exit) {
            while (exit1) {
                System.out.print("S");
                i++;
                if (i >= 10) exit1 = false;
            }
            System.out.println();
            j++;
            if (j >= 10) exit = false;
            else {
                exit1 = true;
                i = 0;
            }
        }

    }
}
