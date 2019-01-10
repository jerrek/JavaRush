package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int a = Integer.parseInt(bufferedReader.readLine());
        boolean exit = true;
        int i = 0;
        while (exit) {
            System.out.println(s);
            i++;
            if (a == i) exit = false;

        }
    }
}
