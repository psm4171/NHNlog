package com.nhnacademy.java.pocker;

public enum DaysInWeek {
    MON("Monday"),
    TUE("Tuesday"),
    WED("Wendesday"),

    THU("Thursday"),
    FRI("Friday"),
    SAT("Saturday"),
    SUN("Sunday");

    public final String dayName;

    DaysInWeek(String dayName){
        this.dayName = dayName;
    }

    public String toString(){
        return this.dayName;
    }

}
