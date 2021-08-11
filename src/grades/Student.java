package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Student {
    private String name;
    private final ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, Integer grades) {
        this.name = name;
        this.grades = grades.isEmpty();
    }
    public static void main(String[] args) {
        // returns the student's name
        public String getName();

        // adds the given grade to the grades property
        public void addGrade(int grade);
        // returns the average of the students grades
        public double getGradeAverage();
    }
}

