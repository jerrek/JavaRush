package com.javarush.task.task25.task2505;

/* 
Без дураков
*/
class Solution {

    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
    }

    class MyThread extends Thread {

        private final String secretKey;

        MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }

        private class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.currentThread();
                    sleep(500);
                    System.out.println(String.format("%s, %s, %s", secretKey, t.getName(), e.getMessage()));
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

}

