package com.javarush.task.task22.task2202;

/*
Найти подстроку
*/
public class Solution {

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        int firstSpaceIndex = string.indexOf(" ") + 1;
        char[] chars = string.toCharArray();
        int countSpace = 0;
        int lastSpaceIndex = 0; //
        for (int i = 0; i < string.length(); i++) {
            if (chars[i] == ' ') {
                countSpace++;
                if (countSpace == 4) {
                    lastSpaceIndex = string.length();
                } else if (countSpace == 5) {
                    lastSpaceIndex = i;
                    break;
                }
            }
        }
        if (countSpace < 4) {
            throw new TooShortStringException();
        }
        return string.substring(firstSpaceIndex, lastSpaceIndex);
    }

    public static class TooShortStringException extends RuntimeException {

    }
}
