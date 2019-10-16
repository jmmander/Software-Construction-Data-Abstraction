package test;

import model.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class dateTest {

    public Date testdate;

    @Before
    public void setup() {
        testdate = new Date(10,11,2019);
    }

    @Test
    public void testGetDay() {
        Assert.assertEquals(testdate.getDay(), 11);
    }
    @Test
    public void testGetMonth() {
        Assert.assertEquals(testdate.getMonth(), 10);
    }

    @Test
    public void testGetYear() {
        Assert.assertEquals(testdate.getYear(), 2019);
    }
    @Test
    public void testNumDate() {
        Assert.assertEquals(testdate.getNumDate(testdate), "10/11/2019");
    }

    @Test
    public void testStrDate() {
        Assert.assertEquals(testdate.getStrDate(testdate), "11 October 2019");
    }
}
