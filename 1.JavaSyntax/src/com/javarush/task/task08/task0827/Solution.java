package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args)throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Date date1 = new Date(date);
        SimpleDateFormat ff = new SimpleDateFormat("D");
        int x = Integer.parseInt(ff.format(date1));
        return x%2 != 0;
    }
}
