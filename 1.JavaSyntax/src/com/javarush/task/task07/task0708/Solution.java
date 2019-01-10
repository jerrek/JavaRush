package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        ArrayList<String> longest = new ArrayList<>();
        int a = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
            if (strings.get(i).length() > a) {
                a = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == a) {
                longest.add(strings.get(i));
            }
        }

        for (int i = 0; i < longest.size(); i++) {
            System.out.println(longest.get(i));
        }
    }
}
