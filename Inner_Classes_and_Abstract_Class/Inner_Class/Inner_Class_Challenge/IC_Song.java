package com.Inner_Classes_and_Abstract_Class.Inner_Class.Inner_Class_Challenge;

public class IC_Song {
    private String title;
    private double duration;

    public IC_Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + " : " + this.duration;
    }
}
