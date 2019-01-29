package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StatisticManager {
    private static StatisticManager ourInstance = new StatisticManager();
    private StatisticStorage statisticStorage = new StatisticStorage();
    private SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");

    public static StatisticManager getInstance() {
        return ourInstance;
    }

    private StatisticManager() {
    }

    public void register(EventDataRow data) {
        statisticStorage.put(data);
    }

    public Map<DateHolder, Long> getAdvertisementProfit() {
        List<EventDataRow> videoSelectedEvents = statisticStorage.getEventsOfType(EventType.SELECTED_VIDEOS);
        Map<DateHolder, Long> profitPerDayMap = new HashMap<>();

        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");

        for (EventDataRow videoSelectedEvent : videoSelectedEvents) {
            VideoSelectedEventDataRow v = (VideoSelectedEventDataRow) videoSelectedEvent;

            DateHolder date = truncateDate(v.getDate());

            Long dailyProfit = profitPerDayMap.get(date);

            profitPerDayMap.put(date,
                    dailyProfit == null ? v.getAmount() : dailyProfit + v.getAmount());
        }

        return profitPerDayMap;
    }

    public Map<DateHolder, Map<String, Integer>> getWorkload() {
        List<EventDataRow> cookedOrderEvents = statisticStorage.getEventsOfType(EventType.COOKED_ORDER);
        Map<DateHolder, Map<String, Integer>> workloadMap = new HashMap<>();

        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");

        for (EventDataRow cookedOrderEvent : cookedOrderEvents) {
            CookedOrderEventDataRow c = (CookedOrderEventDataRow) cookedOrderEvent;

            DateHolder date = truncateDate(c.getDate());

            Map<String, Integer> dailyCookLoad = workloadMap.computeIfAbsent(date, k -> new HashMap<>());

            String cookName = c.getCookName();
            int cookingTime = c.getTime();
            Integer dailyCookingTime = dailyCookLoad.get(cookName);

            dailyCookLoad.put(cookName,
                    dailyCookingTime == null ? cookingTime : dailyCookingTime + cookingTime);
        }

        return workloadMap;
    }

    private DateHolder truncateDate(Date date) {
        try {
            String formattedDate = df.format(date);
            Date truncatedDate = df.parse(formattedDate);
            DateHolder holder = new DateHolder(truncatedDate, formattedDate);
            return holder;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private class StatisticStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        private StatisticStorage() {
            for (EventType eventType : EventType.values()) {
                storage.put(eventType, new ArrayList<EventDataRow>());
            }
        }

        private void put(EventDataRow data) {
            storage.get(data.getType()).add(data);
        }

        public List<EventDataRow> getEventsOfType(EventType eventType) {
            return storage.get(eventType);
        }
    }
}