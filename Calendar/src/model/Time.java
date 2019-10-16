package model;

public class Time {

    private int hour;
    private int min;

    public Time(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }

        //getters
        public int getHour() {return hour;}
        public int getMin() {return min;}
        public String getTime() {return hour + ":" + min;}
}

