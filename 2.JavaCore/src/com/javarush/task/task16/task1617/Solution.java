package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;
    public static final int seconds = countSeconds;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (!(countSeconds < 1)) {
                System.out.print(countSeconds + " ");
                countSeconds--;
                try {
                    Thread.sleep(1000);
                    if (countSeconds == 0)
                        System.out.print("Марш!");
                } catch (InterruptedException e) {
                    System.out.print("Прервано!");
                }


            }
        }
    }
}
