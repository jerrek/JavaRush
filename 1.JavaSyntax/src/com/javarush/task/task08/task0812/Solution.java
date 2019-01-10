package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int same = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            same = arrayList.get(i);
            for (int j = i; j < arrayList.size(); j++) {
                if (same == arrayList.get(j)) {
                    count1++;
                } else break;
            }
            if (count2 <= count1) {
                count2 = count1;
            }
            count1 = 0;
        }
        System.out.println(count2);
    }
}