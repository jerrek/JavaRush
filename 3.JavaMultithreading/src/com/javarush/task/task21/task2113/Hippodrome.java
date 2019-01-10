package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Runtime.getRuntime;

public class Hippodrome {

    public static Hippodrome game;

    private List<Horse> horses;

    Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Плотва", 3, 0));
        horses.add(new Horse("Зорька", 3, 0));
        horses.add(new Horse("Буцифал", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(30);
        }
    }

    public void move() {
        for (Horse h : horses) {
            h.move();
        }
    }

    public void print() { ;
        for (Horse h : horses) {
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double distanceWinner = 0;
        Horse winnerHorse = null;
        for (Horse h : horses) {
            if (distanceWinner < h.getDistance()) {
                distanceWinner = h.getDistance();
                winnerHorse = h;
            }
        }
        return winnerHorse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
