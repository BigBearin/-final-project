package com.example.br161.finalproject;

import android.text.format.Time;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by My Laptop on 5/4/2015.
 */
public class Workout {

    private String title;
    private String date;
    private String time;

    public Workout(String t, String d, String i)
    {
        title = t;
        date = d;
        time = i;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
