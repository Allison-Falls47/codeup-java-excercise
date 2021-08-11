package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private final ArrayList<Integer> grades = new ArrayList<>();

//    public Student(String name, Integer grades) {
//        this.name = name;
//        this.grades.isEmpty();
//    }
    // returns the student's name
    public String getName();
    // adds the given grade to the grades property
    public void addGrade(int grade);
    // returns the average of the students grades
    public double getGradeAverage();
}

