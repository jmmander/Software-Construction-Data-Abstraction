package test;

import model.Time;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testingTime {

    public Time testTime;

    @Before
    public void setup() {
        testTime = new Time(10, 11);
    }

    @Test
    public void testGetTime() {
        Assert.assertEquals(testTime.getTime(), "10:11");
    }

    @Test
    public void testGetHour() {
        Assert.assertEquals(testTime.getHour(), 10);
    }

    @Test
    public void testGetMin() {
        Assert.assertEquals(testTime.getMin(), 11);
    }


}
