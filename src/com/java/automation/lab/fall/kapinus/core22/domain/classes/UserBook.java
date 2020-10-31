package com.java.automation.lab.fall.kapinus.core22.domain.classes;

public class UserBook {
    int day;
    int hour;

    public UserBook(int day, int hour){
        this.day = day;
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public boolean bookingTraining(Reception reception, Trainer trainer, UserBook userBook){
        return (reception.booking(trainer, userBook));
    }


}
