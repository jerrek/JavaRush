package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
*/
class Solution implements Serializable, Runnable {

    @SuppressWarnings("FieldCanBeLocal")
    private final int speed;
    transient private Thread runner;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        runner = new Thread(this);
        runner.start();
    }
}
