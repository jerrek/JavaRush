package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream streamInpute = new FileInputStream(name);
        byte[] buf = new byte[streamInpute.available()];
        int count = 0;
        if (streamInpute.available() > 0) {
            streamInpute.read(buf);
        }
        streamInpute.close();
        for (int i = 0; i < buf.length; i++) {
            if (buf[i] == ',') {
                count++;
            }
        }

        System.out.println(count);
    }
}
