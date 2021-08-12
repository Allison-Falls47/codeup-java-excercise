package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student ali = new Student("Allison");
        ali.addGrade(70);
        ali.addGrade(90);
        ali.addGrade(98);

        Student jame = new Student("James");
        jame.addGrade(74);
        jame.addGrade(93);
        jame.addGrade(88);

        Student smith = new Student("Smith");
        smith.addGrade(74);
        smith.addGrade(70);
        smith.addGrade(88);

        Student ken = new Student("Ken");
        ken.addGrade(89);
        ken.addGrade(93);
        ken.addGrade(94);

        students.put("Allison-Falls-47", ali);
        students.putIfAbsent("James-joe-2", jame);
        students.putIfAbsent("Smithy-Jim", smith);
        students.putIfAbsent("Ken-Fighter", ken);

        commandLineInterface(students);
    }


    public static void commandLineInterface(HashMap<String, Student> students){
        Input input = new Input();
        do {
            System.out.println("Welcome!\n" +
                    "\n" +
                    "Here are the GitHub usernames of our students:\n");
            for (String key : students.keySet()) {
                System.out.println("|" + key + "| ");
            }
            System.out.println("What student would you like to see more information on?\n");

            String userKey = input.getString();

            if (students.containsKey(userKey)) {

                Student currentStudent = students.get(userKey);

                System.out.println("Name: " + currentStudent.getName() + "GitHub Username: " + userKey);
                System.out.println("Current average: " + currentStudent.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userKey);
            }

            System.out.println("Would you like to see another student?");
        }while (input.yesNo());
        System.out.println("Good bye!");
    }

}
