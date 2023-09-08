package com.nhnacademy.java.pocker;

public class Date {
    private int year;
    private int month;
    private int day;
    private DaysInWeek daysInweek;

    public Date(int year, int month, int day, DaysInWeek daysInweek){
        this.year = year;
        this.month = month;
        this.day = day;
        this.daysInweek = daysInweek;
    }

    public Date(){
        this(1998,5,4, DaysInWeek.FRI);
    }
    public int getYear(){
        return this.month;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public DaysInWeek getDaysInweek(){
        return this.daysInweek;
    }


    public String toString(){
        return this.year + "-" + this.month + "-" + this.day +", "+ this.daysInweek;
    }


}
