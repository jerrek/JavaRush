package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> flora = new HashMap<>();
        flora.put("арбуз", "ягода");
        flora.put("банан", "трава");
        flora.put("вишня", "ягода");
        flora.put("груша", "фрукт");
        flora.put("дыня", "овощ");
        flora.put("ежевика", "куст");
        flora.put("жень-шень", "корень");
        flora.put("земляника", "ягода");
        flora.put("ирис", "цветок");
        flora.put("картофель", "клубень");
        System.out.println();
        for (HashMap.Entry<String, String> pair : flora.entrySet()) {
            System.out.println((pair.getKey() + " - " + pair.getValue()));
        }

    }
}
