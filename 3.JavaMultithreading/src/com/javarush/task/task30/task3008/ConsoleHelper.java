package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String buf = "";
        boolean fail = true;
        while (fail) {
            try {
                buf = bufferedReader.readLine();
                fail = false;
            } catch (IOException e) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
        return buf;
    }

    public static int readInt() {
        Integer buf = 0;
        boolean fail = true;
        while (fail) {
            try {
                buf = Integer.parseInt(readString());
                fail = false;
            } catch (NumberFormatException e) {

                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            }
        }
        return buf;
    }
}
