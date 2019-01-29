package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Util;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Observable implements Runnable {
    private String name;
    private volatile boolean busy;
    private LinkedBlockingQueue<Order> queue;

    public Cook(String name) {
        this.name = name;
    }

    private synchronized void startCookingOrder(Order order) {
        busy = true;
        ConsoleHelper.writeMessage(String.format("Start cooking - %s, cooking time %dmin", order, order.getTotalCookingTime()));
        StatisticManager.getInstance().register(new CookedOrderEventDataRow(order.getTablet().toString(), name, order.getTotalCookingTime() * 60, order.getDishes()));

        Util.sleep(order.getTotalCookingTime() * 10);

        setChanged();
        notifyObservers(order);
        busy = false;
    }

    private boolean isBusy() {
        return busy;
    }

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted() && queue.peek() != null) {
            if (!isBusy()) {
                Order poll = queue.poll();
                if (poll != null)
                    startCookingOrder(poll);
            }
            Util.sleep(10);
        }
    }
}
