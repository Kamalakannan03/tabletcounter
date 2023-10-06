package com.example.tablet.calculator.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Request {
    private String startDate;
    private String endDate;
    private List<Integer> intervals;
    private int days;

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Request(String startDate, String endDate, List<Integer> intervals, int days) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.intervals = intervals;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Request{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", intervals=" + intervals +
                ", days=" + days +
                '}';
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }



    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

      public List<Integer> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<Integer> intervals) {
        this.intervals = intervals;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
