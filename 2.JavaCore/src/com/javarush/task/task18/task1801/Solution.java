package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        FileInputStream stream = new FileInputStream(name);
        int a = stream.read();
        while (stream.available()>0){
            int b = stream.read();
            if(b>a){
                a=b;
            }
        }
        stream.close();
        System.out.println(a);
    }
}
