package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?
*/
public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
    }

    public static class Person {
        String name = "Marvin";
        int age = 42;
        int weight = 42;
        int money = 42;
    }
}
