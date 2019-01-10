package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> longest = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        int a = 1000000000;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
            if (strings.get(i).length() < a) {
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
