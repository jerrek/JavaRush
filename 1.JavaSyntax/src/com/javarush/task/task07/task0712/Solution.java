package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        int a = 1000000000;
        int aa = 0;
        int shorI = 0;
        int longI = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(bufferedReader.readLine());
            if (strings.get(i).length() < a) {
                a = strings.get(i).length();
                shorI = i;
            }
            if (strings.get(i).length() > aa) {
                aa = strings.get(i).length();
                longI = i;
            }
        }
        if (shorI < longI) System.out.println(strings.get(shorI));
        else System.out.println(strings.get(longI));
    }
}
