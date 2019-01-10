package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divisionByZero();
        }catch (ArithmeticException e){
           e.printStackTrace();
        }
    }

    public static void divisionByZero() throws ArithmeticException {
            int a = 42 / 0;
            System.out.println(a);


    }
}
