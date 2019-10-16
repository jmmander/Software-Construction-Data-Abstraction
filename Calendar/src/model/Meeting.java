package model;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Meeting extends Event {

    private ArrayList<String> Attendees;

    public Meeting(Date date, Time time, String label, ArrayList attendees) {
        super(date, time, label);
        this.Attendees = attendees;
    }

    //getter
    public ArrayList<String> getAttendees(){return this.Attendees;}


    //MODIFIES: THIS
    //EFFECTS: adds an new attendee
    public void addAttendee(String attendee){this.Attendees.add(attendee);}

    //MODIFIES: THIS
    //EFFECTS: remove an new attendee
    public void removeAttendee(String attendee){this.Attendees.remove(attendee);}

    public String sendInvite() {
        String emails = Attendees.stream().collect(Collectors.joining(", "));
        System.out.println("inviting " + emails);
        return ("inviting " + emails);
    }
}

