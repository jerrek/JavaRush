package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(reader.readLine());
        FileWriter fw = new FileWriter(reader.readLine());
        reader.close();
        int i = 0;
        while(fr.ready()){
            i++;
            int data = fr.read();
            if(i%2 == 0)
                fw.write(data);
        }
        fr.close();
        fw.close();
    }
}
