package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
        // returns the student's name
        public String getName() {
            return name;

        }
        // adds the given grade to the grades property
        public void addGrade(int grade) {
            this.grades.add(grade);
    }
        // returns the average of the students grades
        public double getGradeAverage() {
            double sum = 0;
            for (Integer grade : grades){
                sum += grade;
            }
            return sum / this.grades.size();
    }

//    public static void main(String[] args) {
//        Student joe = new Student("Joe");
//        joe.addGrade(57);
//        joe.addGrade(67);
//        joe.addGrade(85);
//
//        System.out.println(joe.getGradeAverage());
//    }

}

