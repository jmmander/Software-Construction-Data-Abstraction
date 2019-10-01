package model;

import java.util.ArrayList;

public class Transcript {
    /**
     * INVARIANT: course list and grade list are the same size
     * each course has a grade associated, and vice versa, at matching indices
     */

    private String name;
    private int studentNumber;

    ArrayList<Double> Grades = new ArrayList<Double>();
    ArrayList<String> Courses = new ArrayList<String>();

    public Transcript(String name, int studentNumber) {
        this.name = name;
    }
    public String getStudentName() {return name;}

    //REQUIRES: grade between 0-4 and course should not be null
    //MODIFIES:  this
    //EFFECTS: adds grade
    public void addGrade(String course, double grade) {
        if (course == null){
            System.out.println("Please enter a course ");
        }
        else if (grade < 0 || grade > 4){
            System.out.println("Please enter a valid grade between 0-4 ");
        }
        else{
            Courses.add(course);
            Grades.add(grade);}
        }


    //REQUIRES: a course the student has already taken.
    //EFFECTS: returns course name and grade in format CourseName: Grade
    // This method should return course name and grade in some consistent String format
    public String getCourseAndGrade(String course) {
        if (Courses.contains(course)) {
            int index = Courses.indexOf(course);
            double grade = Grades.get(index);
            String result = course + ": " + grade;
            return result;}
        else{return "Course not found";
    }}


    //EFFECTS: prints course names and grades earned
    public void printTranscript() {
        for (String courseName: Courses){
        String CourseAndGrade = getCourseAndGrade(courseName);
        System.out.print(CourseAndGrade + ", ");
        }
        System.out.print("\nGPA: ");
    }


    //EFFECTS: returns GPA
    public Double getGPA() {
        double GPA = calculateAverage((Grades));
        return GPA;
    }

    //TODO: specification
//
    // REQUIRES: list of grades
    //effects: returns the mean of the list
    public double calculateAverage(ArrayList<Double> selectedGrades) {
        double total = 0;
        double average = 0;
        for (double grade : selectedGrades) {
            total = grade + total;
            average = total / (selectedGrades.size());
        }
        return average;
    }




}}