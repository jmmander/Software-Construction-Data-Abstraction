package test;

import model.Date;
import model.Reminder;
import model.Time;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReminderTest {

    public Reminder rem;

    @Before
    public void setup() {
        Date date = new Date(12, 10, 2019);
        Time time = new Time(11, 2);
        rem = new Reminder(date, time, "Set a new reminder");
    }

    @Test
    public void testSetNote() {
        rem.setNote("this is my note");
        Assert.assertEquals(rem.getNote(), "this is my note");
    }

    @Test
    public void testGetNote() {
        rem.setNote("this is my note");
        rem.setNote("this is my other note");
        Assert.assertEquals(rem.getNote(), "this is my other note");
    }

}
