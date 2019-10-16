package main;

import model.*;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(
                new Date(11, 9, 2019),
                "test@test.com"
        );

        Event entry1 = new Event(
                new Date(17, 10, 2019),
                new Time(8, 0),
                "Dr apt"
        );

        Entry entry2 = new Event(
                new Date(15, 11, 2019),
                new Time(13, 0),
                "Restaurant booking"
        );
        Meeting entry3 = new Meeting(
                new Date(12, 12, 2019),
                new Time(18, 0),
                "Board meeting",
                new ArrayList<>(Arrays.asList("test@test.com", "att@test.com"))
        );
        Entry entry4 = new Event(
                new Date(18, 10, 2019),
                new Time(04, 30),
                "wake up"
        );

        Reminder entry1Reminder = new Reminder(
                new Date(2, 11, 2019),
                new Time(7, 30),
                "Get medical records"
        );
        entry1Reminder.setNote("pack bag");
        entry1.setReminder(entry1Reminder);

        System.out.println(entry1.getReminder().getLabel() + " " + entry1Reminder.getNote());

        entry2.setInterval(2);

        System.out.println("entry2 repetition: " + entry2.getIntervalOfRepetition());

        calendar.addEntry(entry1);
        calendar.addEntry(entry2);
        calendar.addEntry(entry3);
        calendar.addEntry(entry4);

        entry3.sendInvite();









    }
}
