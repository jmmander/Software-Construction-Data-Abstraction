package test;

import model.Intset;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class IntsetTest {
    Intset testSet;

    @Before
    public void setup(){ testSet = new Intset();
    }

    @Test
    public void TestInsertNotInSet() {
        CheckEmptyDoesntContain(4);
        testSet.insert(4);
        CheckSetContainsOnce(4);
    }

    @Test
    public void TestInsertAlreadyInSet(){
        CheckEmptyDoesntContain(4);
        testSet.insert(4);
        CheckSetContainsOnce(4);
        testSet.insert(4);
        CheckSetContainsOnce(4);
    }

    private void CheckSetContainsOnce(int num) {
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(num));
    }

    private void CheckEmptyDoesntContain(int num) {
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(num));
    }

    @Test
    public void TestRemoveFromSet(){
        testSet.insert(4);
        assertTrue(testSet.contains(4));
        testSet.remove(4);
        assertFalse(testSet.contains(4));

    }

    @Test
    public void TestRemoveNotInSet(){
        testSet.insert(4);
        assertTrue(testSet.size() == 1);
        testSet.remove(3);
        assertFalse(testSet.contains(3));
        assertTrue((testSet.contains(4)));
    }

}
