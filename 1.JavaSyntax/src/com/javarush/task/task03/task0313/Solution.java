package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String part1 = "Мама";
        String part2 = "Мыла";
        String part3 = "Раму";

        System.out.println(part1 + part2 + part3);
        System.out.println(part2 + part1 + part3);
        System.out.println(part2 + part3 + part1);
        System.out.println(part3 + part1 + part2);
        System.out.println(part1 + part3 + part2);
        System.out.println(part3 + part2 + part1);
    }
}
