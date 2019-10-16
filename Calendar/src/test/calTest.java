package test;

import model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class calTest {

    public Calendar testcal;
    public Event testevent;
    public Entry testentry;
    public Meeting testmeeting;
    public Reminder testreminder;

    @Before
    public void setup() {
        testcal = new Calendar(new Date(11, 9, 2019), "test@test.com");

        testevent = new Event(
                new Date(17, 10, 2019),
                new Time(8, 0),
                "Dr apt");

        Entry testentry = new Event(
                new Date(15, 11, 2019),
                new Time(13, 0),
                "Restaurant booking"
        );
        Meeting testmeeting = new Meeting(
                new Date(12, 12, 2019),
                new Time(18, 0),
                "Board meeting",
                new ArrayList<>(Arrays.asList("test@test.com", "att@test.com"))
        );

        Reminder testreminder = new Reminder(
                new Date(2, 11, 2019),
                new Time(7, 30),
                "Get medical records"
        );
    }



    @Test
    public void testAddEntry() {
        testcal.addEntry(testevent);
        Assert.assertEquals(testcal.getEntries().size(), 1);
    }

    @Test
    public void testGetEntries() {
        testcal.addEntry(testevent);
        testcal.addEntry(testentry);
        Assert.assertEquals(testcal.getEntries().size(), 2);
        testcal.addEntry(testmeeting);
        Assert.assertEquals(testcal.getEntries().size(), 3);
        testcal.addEntry(testreminder);
        Assert.assertEquals(testcal.getEntries().size(), 4);
    }

    @Test
    public void testRemoveEntry() {
        testcal.addEntry(testevent);
        testcal.addEntry(testentry);
        testcal.addEntry(testmeeting);
        testcal.addEntry(testreminder);
        Assert.assertEquals(testcal.getEntries().size(), 4);
        testcal.removeEntry(testentry);
        Assert.assertEquals(testcal.getEntries().size(), 3);
        testcal.removeEntry(testreminder);
        Assert.assertEquals(testcal.getEntries().size(), 2);
        testcal.removeEntry(testevent);
        Assert.assertEquals(testcal.getEntries().size(), 1);
        testcal.removeEntry(testmeeting);
        Assert.assertEquals(testcal.getEntries().size(), 0);


    }
    }
