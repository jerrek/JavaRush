package com.javarush.task.task04.task0431;

/* 
От 10 до 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean exit = true;
        int i = 10;
        while (exit) {
            System.out.println(i--);
            if (i <= 0)
                exit = false;
        }
    }
}
