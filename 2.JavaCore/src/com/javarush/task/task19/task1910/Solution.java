package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = console.readLine();
        String fileName2 = console.readLine();
        console.close();
        BufferedReader fReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fWriter = new BufferedWriter(new FileWriter(fileName2));

        String line;
        while ((line = fReader.readLine()) != null) {
            fWriter.write(line.replaceAll("[\\p{P}]", ""));
            fWriter.newLine();
        }
        fReader.close();
        fWriter.close();
    }
}