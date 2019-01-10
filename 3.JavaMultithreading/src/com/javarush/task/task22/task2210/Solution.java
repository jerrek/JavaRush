package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static String [] getTokens(String query, String delimiter) {

        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        ArrayList<String> tokensList = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()){
            tokensList.add(stringTokenizer.nextToken());
        }
        String[] result = tokensList.toArray(new String[tokensList.size()]);

        return result;
    }

    public static void main(String[] args) {

        System.out.println(getTokens("level22.lesson13.task01", ".")[2]);
    }
}
