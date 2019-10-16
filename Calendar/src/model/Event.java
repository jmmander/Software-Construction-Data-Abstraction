package model;

public class Event extends Entry {

    private Reminder reminder;

    public Event(Date date, Time time, String label){
        super(date, time, label);
    }

    //getter
    public Reminder getReminder() {return reminder;}
    //setter
    public void setReminder(Reminder reminder) {this.reminder = reminder;}
}
