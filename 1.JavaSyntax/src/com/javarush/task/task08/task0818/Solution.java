package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Щеголев", 555);
        hashMap.put("Коновалов", 666);
        hashMap.put("Вещиков", 777);
        hashMap.put("Емельянов", 888);
        hashMap.put("Демешко", 999);
        hashMap.put("Савин", 111);
        hashMap.put("Кретов", 222);
        hashMap.put("Первоушин", 333);
        hashMap.put("Комаров", 444);
        hashMap.put("Убогов", 555);
        return hashMap;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map1.putAll(map);
        for (HashMap.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 500)
                map1.remove(pair.getKey());
        }
        map.clear();
        map.putAll(map1);
    }

    public static void main(String[] args) {

    }
}