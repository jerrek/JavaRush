package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("FUCK");
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}