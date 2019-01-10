package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet();
        String s = "Л";
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer setElement = iterator.next();
            if(setElement>10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
