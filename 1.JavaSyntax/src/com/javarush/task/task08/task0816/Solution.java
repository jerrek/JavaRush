package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Shvarcneger", df.parse("JUNE 1 1980"));
        map.put("Turman", df.parse("AUGUST 1 1980"));
        map.put("Kaiba", df.parse("NOVEMBER 1 1980"));
        map.put("Parker", df.parse("SEPTEMBER 1 1980"));
        map.put("Fisk", df.parse("SEPTEMBER 2 1980"));
        map.put("Kraiven", df.parse("NOVEMBER 3 1980"));
        map.put("Kasl", df.parse("NOVEMBER 4 1980"));
        map.put("Rodgers", df.parse("NOVEMBER 5 1980"));
        map.put("Prat", df.parse("NOVEMBER 6 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> map1 = new HashMap<String, Date>();
        map1.putAll(map);
        for (HashMap.Entry<String,Date> pair:map.entrySet()) {
            if(pair.getValue().toString().contains("Jun") || pair.getValue().toString().contains("Jul") ||pair.getValue().toString().contains("Aug") )
                map1.remove(pair.getKey());
        }
        map.clear();
        map.putAll(map1);
    }

    public static void main(String[] args) throws ParseException  {

    }
}
