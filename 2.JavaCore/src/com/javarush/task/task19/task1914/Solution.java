package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream myByteOut = new ByteArrayOutputStream();
        PrintStream myOut = new PrintStream(myByteOut);
        System.setOut(myOut);
        testString.printSomething();
        System.setOut(out);
        String[] params =  myByteOut.toString().split(" ");
        Integer n1 = Integer.parseInt(params[0]), n2 = Integer.parseInt(params[2]);
        Integer result = 0;
        switch (params[1]) { //switching operand
            case "*": result = n1 * n2; break;
            case "+": result = n1 + n2; break;
            case "-": result = n1 - n2; break;
        }
        System.out.println(myByteOut.toString().trim() + " " + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
