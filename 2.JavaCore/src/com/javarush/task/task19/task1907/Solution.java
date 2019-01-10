package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader inFile = new FileReader(reader.readLine());
        int count = 0;
        String str = "";

        while (inFile.ready()){
            char symbol = (char) inFile.read();
            str += String.valueOf(symbol).toLowerCase();
        }

        str = str.replaceAll("\\p{Punct}", " ");
        str = str.replaceAll("\n", " ");
        //System.out.println(str);

        String[] mas = str.split(" ");
        for(String s: mas){
            s = s.trim();
            if (s.equals("world"))
                count++;
        }

        System.out.println(count);
        reader.close();
        inFile.close();
    }
}
