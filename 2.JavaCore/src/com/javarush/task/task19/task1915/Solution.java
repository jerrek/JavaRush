package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        PrintStream realStream = System.out;

        ByteArrayOutputStream fakeText = new ByteArrayOutputStream();

        PrintStream fakeStream = new PrintStream(fakeText);
        System.setOut(fakeStream);

        testString.printSomething();

        FileOutputStream fileInputStream = new FileOutputStream(rd.readLine());
        String fake = fakeText.toString();

        fileInputStream.write(fake.getBytes());


        System.setOut(realStream);
        System.out.println(fake);
        rd.close();
        fileInputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
