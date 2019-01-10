package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        String s = "Л";
        for (int i = 0; i < 20; i++) {
            set.add(s);
            s += s;
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
