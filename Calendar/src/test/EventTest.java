package test;

import model.Date;
import model.Event;
import model.Reminder;
import model.Time;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EventTest {

    public Event testEvent;

    @Before
    public void setup() {
        testEvent = new Event(
                    new Date(15, 11, 2019),
                    new Time(13, 00),
                    "Restaurant booking");


            }

    @Test
    public void testLabel(){
        Assert.assertEquals(testEvent.getLabel(), "Restaurant booking");
    }

    @Test
    public void testTime(){
        Assert.assertEquals(testEvent.getTime(), new Time(13, 00));
    }

    @Test
    public void testDate(){
        Assert.assertEquals(testEvent.getDate(), new Date (15,11,2019));
    }

    @Test
    public void testGetRem() {
        Reminder rem = new Reminder(new Date(1,10,2019), new Time(17,21), "Go to the doctor");

        testEvent.setReminder(rem);
        Assert.assertEquals(rem, testEvent.getReminder());
    }

    @Test
    public void testSetRem() {
        Reminder rem1 = new Reminder(new Date(1,10,2019), new Time(17,21), "Go to the doctor");
        Reminder rem2 = new Reminder(new Date(30,11,2019), new Time(10,55), "Go to the airport");

        testEvent.setReminder(rem1);
        testEvent.setReminder(rem2);

        Assert.assertEquals(rem2, testEvent.getReminder());
    }
}



