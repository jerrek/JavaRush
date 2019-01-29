package com.javarush.task.task27.task2712.statistic;

import java.util.Date;
import java.util.Objects;

public class DateHolder implements Comparable<DateHolder> {
    private Date date;
    private String dateAsString;

    public DateHolder(Date date, String dateAsString) {
        this.date = date;
        this.dateAsString = dateAsString;
    }

    public Date getDate() {
        return date;
    }

    public String getDateAsString() {
        return dateAsString;
    }

    @Override
    public int compareTo(DateHolder o) {
        return date.compareTo(o.getDate());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateHolder that = (DateHolder) o;
        return Objects.equals(date, that.date) &&
                Objects.equals(dateAsString, that.dateAsString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, dateAsString);
    }
}
