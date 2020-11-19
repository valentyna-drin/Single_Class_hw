package com.company;

public class Newspaper {
    private String name;
    private int year;
    private int month;
    private int dayOfMonth;
    private boolean isFinnish;

    Newspaper(String name, int year, int month, int dayOfMonth, boolean isFinnish){
        this.name = name;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.isFinnish = isFinnish;
    }
    public String getName(){
        return name;
    }
    public void setDate(int year,int month, int dayOfMonth){
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public boolean getIsFinnish() {
        return isFinnish;
    }

    public String toString(){
        return this.name  + ", is Finnish: " + this.isFinnish + "; (" +  this.dayOfMonth + "/" + this.month + "/" + this.year +  ")";

    }
}
