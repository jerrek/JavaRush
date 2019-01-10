package com.javarush.task.task14.task1421;

public class Singleton {
    private static Singleton instance;
    private static boolean lock = false;

    private Singleton() {
        if (!lock) {
            lock = true;
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        if (!lock) {
            lock = true;
            instance = new Singleton();
            return instance;
        } else return instance;
    }
}
