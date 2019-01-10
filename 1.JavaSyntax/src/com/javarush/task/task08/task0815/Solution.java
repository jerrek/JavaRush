package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Щеголев","Кирилл");
        hashMap.put("Коновалов","Дмитрий");
        hashMap.put("Вещиков","Кирилл");
        hashMap.put("Емельянов","Леонид");
        hashMap.put("Демешко","Владимир");
        hashMap.put("Савин","Дмитрий");
        hashMap.put("Кретов","Евгений");
        hashMap.put("Первоушин","Роман");
        hashMap.put("Комаров","Сергей");
        hashMap.put("Убогов","Сергей");
        return  hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (HashMap.Entry<String,String> pair:map.entrySet()) {
            if(pair.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (HashMap.Entry<String,String> pair:map.entrySet()) {
            if(pair.getKey().equals(lastName)) count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
