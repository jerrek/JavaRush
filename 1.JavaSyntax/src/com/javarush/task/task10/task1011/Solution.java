package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        String buff = s;
        for (int i = 0; i < s.replace("зарплату","").length()+1; i++) {
            char[] c = buff.toCharArray();
            for (int j = i; j <c.length ; j++) {
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }

}

