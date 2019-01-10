package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int hundred = number / 100;
        int tenth = (number - hundred*100) / 10;
        int one = (number - hundred*100 - tenth*10);
        int summ = hundred + tenth + one;
        return summ;
    }
}