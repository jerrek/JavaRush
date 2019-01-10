package com.javarush.task.task04.task0430;

/* 
От 1 до 10
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean exit = true;
        int i = 0;
        while (exit) {
            System.out.println(++i);
            if (i == 10)
                exit = false;
        }

    }
}