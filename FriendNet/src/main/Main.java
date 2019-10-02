package main;

import model.Event;
import model.MyProfile;

import static model.EventType.*;
import static model.EventType.SCHOOL;

public class Main {

    public static void main(String[] args) {
        MyProfile mainProfile = new MyProfile("Johnny Appleseed", 20, "Coquitlam", "SPL");
        MyProfile friend1 = new MyProfile("Paul Carter", 30, "London", "Network Systems");
        MyProfile friend2 = new MyProfile("Alan Turing", 24, "Coquitlam", "A Thinking Ape");
        MyProfile friend3 = new MyProfile("Ada Lovelace", 40, "Coquitlam", "AppNeta");
        MyProfile friend4 = new MyProfile("Alfonzo Church", 50, "New York City", "NYU Research");
        MyProfile friend5 = new MyProfile("Bob Ross", 44, "Chicago", "CBS");

        mainProfile.addFriend(friend1);
        System.out.println(mainProfile.getFriendsList());
        mainProfile.addFriend(friend2);
        System.out.println(mainProfile.getFriendsList());
        mainProfile.addFriend(friend3);
        System.out.println(mainProfile.getFriendsList());
        mainProfile.addFriend(friend4);
        System.out.println(mainProfile.getFriendsList());
        mainProfile.addFriend(friend5);
        System.out.println(mainProfile.getFriendsList());

        //mainProfile.printFriendNames();
        //mainProfile.printFriendsNearMe();
        mainProfile.unFriend("Paul Carter");
        System.out.println(mainProfile.getFriendsList());

        Event ev1 = new Event("John's Wedding", "May 20", "Coquitlam", WEDDING);
        Event ev2 = new Event("Celina's Party", "May 11", "2298 West 4th Avenue", PARTY);
        Event ev3 = new Event("Anthony's Birthday", "August 29", "Coquitlam", BIRTHDAY);
        Event ev4 = new Event("Bill's Lecture", "May 4", "2366 Main Mall", SCHOOL);

        mainProfile.addEvent(ev1);
        mainProfile.addEvent(ev2);
        mainProfile.addEvent(ev3);
        mainProfile.addEvent(ev4);
        System.out.println(mainProfile.upcomingEventNum());


        System.out.println(mainProfile.eventNumNearMe());
        mainProfile.removeEvent("John's Wedding");
        System.out.println(mainProfile.eventNumNearMe());
        mainProfile.removeEvent("Anthony's Birthday");
        System.out.println(mainProfile.eventNumNearMe());
        mainProfile.printFriendsNearMe();
    }
    }



