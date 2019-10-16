package model;

public class Date {
    private String numdate;
    private String strdate;
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;

    }

    //getters
    public int getMonth() {return month;}
    public int getDay() {return day;}
    public int getYear() {return year;}
    public String getNumDate(Date date) {
        numdate = month + "/" + day + "/" + year;
        return numdate;}
    public String getStrDate(Date date) {
        if (month == 1){strdate = day + " January " + year;}
        else if (month == 2){strdate = day + " February " + year;}
        else if (month == 3){strdate = day + " March " + year;}
        else if (month == 4){strdate = day + " April " + year;}
        else if (month == 5){strdate = day + " May " + year;}
        else if (month == 6){strdate = day + " June " + year;}
        else if (month == 7){strdate = day + " July " + year;}
        else if (month == 8){strdate = day + " August " + year;}
        else if (month == 9){strdate = day + " September " + year;}
        else if (month == 10){strdate = day + " October " + year;}
        else if (month == 11){strdate = day + " November " + year;}
        else {strdate = day + " December " + year;}
        return strdate;
    }
    }

