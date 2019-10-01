package test;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TranscriptTest {

    private Transcript testTranscript;

    @Before
    public void setUp(){
        testTranscript = new Transcript("Ihate You", 8096);

    }

    @Test
    public void testGetGPAInRange(){
        testTranscript.addGrade("someCourse", 0);
        double GPA = testTranscript.getGPA();
        boolean inrange = checkInRange(GPA, 0, 4);
        assertTrue(inrange == true);

    }

    @Test
    public void testAddGrade(){
        testTranscript.addGrade("someCourse", 3.9);
        String CourseAndGrade = testTranscript.getCourseAndGrade("someCourse");
        assertTrue(CourseAndGrade.equals("someCourse: 3.9"));
    }

    @Test
    public void testGradeInRange(){
        testTranscript.addGrade("someCourse", 3.6);
        String CourseAndGrade = testTranscript.getCourseAndGrade("someCourse");
        String[] arrOfStr = CourseAndGrade.split(":", 2);
        String grade = arrOfStr[1];
        double numGrade = Double.parseDouble(grade);
        boolean inrange = checkInRange(numGrade, 0, 4);
        assertTrue(inrange == true);


    }

    @Test
    public void testGPAInRange(){
        testTranscript.addGrade("someCourse", 4);
        double GPA = testTranscript.getGPA();
        boolean inrange = checkInRange(GPA, 0, 4);
        assertTrue(inrange == true);
        testTranscript.addGrade("someOtherCourse", 0);
        double GPA1 = testTranscript.getGPA();
        boolean inrange1 = checkInRange(GPA1, 0, 4);
        assertTrue(inrange1 == true);
        testTranscript.addGrade("AndSomeOtherCourse", 2);
        double GPA2 = testTranscript.getGPA();
        boolean inrange2 = checkInRange(GPA1, 0, 4);
        assertTrue(inrange2 == true);


    }

    @Test
    public void testCalcAverage(){
        ArrayList<Double> listOfGrades = new ArrayList<Double>();
        listOfGrades.add(2.0);
        double alist = testTranscript.calculateAverage(listOfGrades);
        assertTrue(listOfGrades.size() == 1);
        assertTrue(alist == 2.0);
        listOfGrades.add(1.0);
        double blist = testTranscript.calculateAverage(listOfGrades);
        assertTrue(listOfGrades.size() == 2);
        assertTrue(blist == 1.5);
        listOfGrades.add(2.0);
        listOfGrades.add(2.0);
        listOfGrades.add(3.0);
        double clist = testTranscript.calculateAverage(listOfGrades);
        assertTrue(listOfGrades.size() == 5);
        assertTrue(clist == 2);
    }


    private boolean checkInRange(double GPA, int lowerBound, int upperBound) {
        if(lowerBound <= GPA && GPA <= upperBound){
            return true;
        }
        else {
            return false;
        }
    }




    }




