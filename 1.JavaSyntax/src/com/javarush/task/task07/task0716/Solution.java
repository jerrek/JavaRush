package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("л") && !list.get(i).contains("р")) {
                arrayList.add(0, list.get(i));
                arrayList.add(0, list.get(i));
            } else if (!list.get(i).contains("л") && list.get(i).contains("р")) {

            } else if (list.get(i).contains("л") && list.get(i).contains("р")) {
                arrayList.add(0, list.get(i));
            } else arrayList.add(0, list.get(i));
        }
        return arrayList;
    }
}