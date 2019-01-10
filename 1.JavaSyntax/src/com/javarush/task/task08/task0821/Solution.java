package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Щеголев","Кирилл");
        hashMap.put("Коновалов","Дмитрий");
        hashMap.put("Вещиков","Кирилл");
        hashMap.put("Емельянов","Леонид");
        hashMap.put("Демешко","Владимир");
        hashMap.put("Щеголев","Дмитрий");
        hashMap.put("Кретов","Евгений");
        hashMap.put("Первоушин","Роман");
        hashMap.put("Комаров","Сергей");
        hashMap.put("Убогов","Сергей");
        return  hashMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
