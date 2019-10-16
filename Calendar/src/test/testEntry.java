package test;

import model.Date;
import model.Entry;
import model.Event;
import model.Time;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testEntry {

    public Entry testentry;

    @Before
    public void setup() {
    testentry = new Event(
                new Date(15, 11, 2019),
                new Time(13, 00),
                "Restaurant booking");
    }

    @Test
    public void testLabel(){
       Assert.assertEquals(testentry.getLabel(), "Restaurant booking");
    }

    @Test
    public void testTime(){
        Assert.assertEquals(testentry.getTime(), new Time(13, 00));
    }

    @Test
    public void testDate(){
        Assert.assertEquals(testentry.getDate(), new Date (15,11,2019));
    }


}
