package model;

import model.Date;

public abstract class Entry {

    private String label;
    private Date date;
    private Time time;
    private int interval;
    private boolean reapeating;

    public Entry(){}

    public Entry(Date date, Time time, String label) {
        this.label = label;
        this.date = date;
        this.time = time;

        }
        //getters
    public String getLabel() {return label;}
    public Time getTime(){return time;}
    public Date getDate() {return date;}

    public boolean isRepeating(){return reapeating = true;}

    public int getIntervalOfRepetition(){return this.interval;}

    public void setInterval(int interval){this.interval = interval;}

}
