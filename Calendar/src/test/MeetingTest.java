package test;

import model.Date;
import model.Event;
import model.Meeting;
import model.Time;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MeetingTest {

    public Meeting testMeet;

    @Before
    public void setup() {
        ArrayList<String> attendees = new ArrayList<>();
        testMeet = new Meeting(new Date(10,4,2019), new Time(12,15), "Board Meeting", attendees);
    }

    @Test
    public void testAddAttendee() {
        testMeet.addAttendee("person1@email.com");
        testMeet.addAttendee("person2@email.com");
        testMeet.addAttendee("person3@email.com");

        ArrayList<String>  expected = new ArrayList<>(Arrays.asList("person1@email.com","person2@email.com","person3@email.com"));
        Assert.assertEquals(testMeet.getAttendees(), expected);
    }

    @Test
    public void testRemAttendees() {
        testMeet.addAttendee("person1@email.com");
        testMeet.addAttendee("person2@email.com");
        testMeet.addAttendee("person3@email.com");
        testMeet.removeAttendee("person2@email.com");
        ArrayList<String>  newExpected = new ArrayList<>(Arrays.asList("person1@email.com","person3@email.com"));
        Assert.assertEquals(newExpected, testMeet.getAttendees());
        testMeet.removeAttendee("person1@email.com");
        Assert.assertTrue(testMeet.getAttendees().size() == 1);


    }

    @Test
    public void testInvite() {
        testMeet.addAttendee("person1@email.com");
        String expected = "inviting person1@email.com";
        Assert.assertEquals(testMeet.sendInvite(), expected);
        testMeet.addAttendee("person2@email.com");
        testMeet.addAttendee("person3@email.com");
        String expected2 = "inviting person1@email.com, person2@email.com, person3@email.com";
        Assert.assertEquals(testMeet.sendInvite(), expected2);
    }

}
