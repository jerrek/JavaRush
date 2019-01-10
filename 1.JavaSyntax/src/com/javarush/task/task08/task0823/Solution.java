package com.javarush.task.task08.task0823;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] words = s.split(" +");
        for (String ss : words){
            if (ss.length() != 0 ) { // проверка, чтоб строка не начиналась на пробел
                System.out.print(ss.substring(0, 1).toUpperCase() + ss.substring(1) + " ");
            }
        }
    }
}