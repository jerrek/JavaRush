package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

import java.util.Observer;

public class Restaurant {
    public static void main(String[] args) {

        Tablet tablet = new Tablet(5);
            Cook firstCook = new Cook("Amigo");
            Waiter firstWaiter = new Waiter();
            tablet.addObserver((Observer) firstCook);
            firstCook.addObserver(firstWaiter);
            tablet.createOrder();
    }

}
