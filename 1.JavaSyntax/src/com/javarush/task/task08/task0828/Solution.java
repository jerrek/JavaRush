package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        LinkedList<String> months = new LinkedList<>();
        months.add(0, "HELL");
        months.add(1, "January");
        months.add(2, "February");
        months.add(3, "March");
        months.add(4, "April");
        months.add(5, "May");
        months.add(6, "June");
        months.add(7, "July");
        months.add(8, "August");
        months.add(9, "September");
        months.add(10, "October");
        months.add(11, "November");
        months.add(12, "December");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        for (String month : months) {
            if (month.equals(s)) {
                System.out.println(s + " is the " + months.indexOf(month) + " month");
            }
        }
    }
}
