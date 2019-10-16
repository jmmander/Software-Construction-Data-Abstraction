package model;

import java.util.ArrayList;
import java.util.Collection;

public class Calendar {

    private Date currentDate;
    private String email;
    private ArrayList<Entry> entries;

    public Calendar(Date date, String email){
        this.currentDate = date;
        this.email = email;
        this.entries = new ArrayList<>();
    }
    //getters
    public Date getCurrentDate() {return currentDate;}
    public String getEmail() {return email;}

    //modifies: this
    //effects: adds entry
    public void addEntry(Entry entry){
        entries.add(entry);
    }

    public ArrayList<Entry> getEntries(){
        return entries;
    }
    //modifies: this
    //effects: removes entry
    public void removeEntry(Entry entry){
        entries.remove(entry);
    }
}
