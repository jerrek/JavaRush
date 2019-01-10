package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat f = new SimpleDateFormat("MMM d, yyyy",Locale.ENGLISH);
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        Date d = s.parse(br.readLine());
        System.out.println(f.format(d).toUpperCase());
    }
}
