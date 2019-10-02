package model;

import java.util.ArrayList;
import java.util.List;

public class MyProfile {

    private String name;
    private int age;
    private String currentLocation;
    private String workPlace;
    private List<MyProfile> friendsList = new ArrayList<>();
    private List<Event> upcomingEvents = new ArrayList<>();;

    public MyProfile(String nm, int age, String locn, String work) {
        name = nm;
        this.age = age;
        currentLocation = locn;
        workPlace = work;
    }

    // getters
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return age;
    }
    public String getCurrentLocation() {
        return this.currentLocation;
    }
    public String getWorkPlace() {
        return this.workPlace;

    }
    public int upcomingEventNum() {
        return this.upcomingEvents.size();

    }
    public List<MyProfile> getFriendsList() {
        return this.friendsList;
    }
    public List<Event> getEventList() {
        return this.upcomingEvents;
    }

    // REQUIRES: f is not already in friendsList
    // MODIFIES: this
    // EFFECTS: consumes a MyProfile object, a friend f, and adds it to the friendsList
    public void addFriend(MyProfile f) {
        if (!this.friendsList.contains(f)){
            this.friendsList.add(f);
        }
    }

    // MODIFIES: this
    // EFFECTS: removes a friend with the given name from this. If removal is successful, return true, else
    //          return false
    public boolean unFriend(String nm) {
        for (MyProfile friend : friendsList) {
            if (friend.getName().equalsIgnoreCase(nm)) {
                friendsList.remove(friend);
                return true;
            }
            continue;
        }
        return false;
    }

    // REQUIRES: ev is not in upcomingEvents
    // MODIFIES: this
    // EFFECTS: adds the given event to the list of upcoming events
    public void addEvent(Event ev) {
        if (!upcomingEvents.contains(ev)){
            upcomingEvents.add(ev);
        }
    }

    // MODIFIES: this
    // EFFECTS: removes an event with the given name. If removal is successful, return true, else return false
    public boolean removeEvent(String nm) {
        for (Event ev : upcomingEvents){
            String ename = (ev.getName());
            if (ename.equalsIgnoreCase(nm)){
                upcomingEvents.remove(ev);
                return true;
            }
            continue;
        }
        return false;
    }

    // EFFECTS: returns the number of events that are at the current location of this person
    public int eventNumNearMe() {
        int x = 0;
        for (Event ev: upcomingEvents){
            if (this.currentLocation == ev.getLocation()){
                System.out.println("myloco = " + this.currentLocation);
                System.out.println("ev loco = " + ev.getLocation());
                x = x + 1;
                System.out.println(x);
            } else {
                continue;
            }
        }
            return x;
    }

    // EFFECTS: returns the number of events of the given type et
    public int specificEventType(EventType et) {
        int x = 0;
        for (Event ev: upcomingEvents){
            EventType etype = ev.getEventType();
            if (etype.equals(et));{
                x = x + 1;
            }
        }
        return x;
    }
    // EFFECTS: prints events of  type et to the console
    //          Hint: is there a method you have already written that you can use?
    public void printEventSchedule(EventType et) {
        for (Event ev: upcomingEvents){
            EventType etype = ev.getEventType();
            if (etype.equals((et)));{
                System.out.println(ev.getName());
            }
        }
    }


    // EFFECTS: prints out the list of friends that this MyProfile has
    public void printFriendNames() {
        for (MyProfile friend: friendsList){
            System.out.println(friend.getName());
        }
    }

    // EFFECTS: prints out the names of friends who live at the same location associated with this profile
    public void printFriendsNearMe() {
        for (MyProfile friend: friendsList){
            if (friend.getCurrentLocation().equalsIgnoreCase(currentLocation)){
                System.out.println(friend.getName());
        }
    }
    }

    // EFFECTS: produces true if this profile has a friend with the given name,
    //          OR if any of this profile's friends has a friend with the given name
    //          Hint: use recursion!
    public boolean canFindPerson(String name) {
        if (this.friendsList.isEmpty()) return false;

        for (MyProfile p : friendsList) {
            if (p.getName().equals(name)) {
                return true;
            }
        }

        for (MyProfile p : friendsList) {
            if (p.canFindPerson(name)) {
                return true;
            }
        }
        return false;





    }
        /*
        for (MyProfile friend: friendsList){
            if (friend.getName().equalsIgnoreCase(name)) {
                return true;
            }else {continue;}};
        for (MyProfile friend: friendsList)
            for (MyProfile FOF: friend.getFriendsList()) {
                    if (FOF.getName().equalsIgnoreCase(name)){
                        return true;
                    }
                continue;}


        return false;
    }*/


}
