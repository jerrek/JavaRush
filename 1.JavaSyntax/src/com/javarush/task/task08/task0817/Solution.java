package com.javarush.task.task08.task0817;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Щеголев", "Кирилл");
        hashMap.put("Коновалов", "Дмитрий");
        hashMap.put("Вещиков", "Кирилл");
        hashMap.put("Емельянов", "Леонид");
        hashMap.put("Демешко", "Владимир");
        hashMap.put("Савин", "Дмитрий");
        hashMap.put("Кретов", "Евгений");
        hashMap.put("Первоушин", "Роман");
        hashMap.put("Комаров", "Сергей");
        hashMap.put("Убогов", "Сергей");
        return hashMap;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.putAll(map);
        int count = 0;
        for (HashMap.Entry<String, String> pair1 : map.entrySet()) {
            for (HashMap.Entry<String, String> pair : map.entrySet()) {
                if (pair1.getValue().equals(pair.getValue())) {
                    if (count > 0)
                        removeItemFromMapByValue(map1, pair.getValue());
                    count++;
                }
            }
            count=0;
        }
        map.clear();
        map.putAll(map1);

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> map1 = createMap();
//        removeTheFirstNameDuplicates(map1);
//        System.out.println(map1);
    }
}
