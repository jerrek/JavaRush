package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/
class Solution {

    public static void processThreads(Thread... threads) {
        for (Thread currentThread : threads) {
            switch (currentThread.getState()) {
                case NEW:
                    currentThread.start();
                    break;
                case RUNNABLE:
                    currentThread.isInterrupted();
                    break;
                case BLOCKED:
                    currentThread.interrupt();
                    break;
                case WAITING:
                    currentThread.interrupt();
                    break;
                case TIMED_WAITING:
                    currentThread.interrupt();
                    break;
                case TERMINATED:
                    System.out.println(currentThread.getPriority());
                    break;
            }
        }
    }
}