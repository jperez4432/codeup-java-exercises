package grades;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication extends Student {
    public GradesApplication(String name) {
        super(name);
    }

    public void commandLine(Student students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!\nHere are the github usernames" + students);
        System.out.println("What student would you like to see more information on?");
        String entry = sc.nextLine();
        // need to get students usernames as a string to match with user entry
        if (entry != students.toString()) {
            System.out.println("Sorry, no student found with the GitHub username of " + entry);
            System.out.println("Would you like to try again? Y/N");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("y")) {
                // commandLine();
            } else {
                System.out.println("Have a nice day!");
            }
        } else if (entry == students.toString()) {
            System.out.println(students.toString());
        }
    }

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Set<String> keySet = students.keySet();
        ArrayList<String> listOfKeys = new ArrayList<String>(keySet);

        Student student1 = new Student("Juan");
        students.put("jperez4432", student1);
        student1.addGrade(90);
        student1.addGrade(95);
        student1.addGrade(93);
        //   System.out.println(student1.getName());
        // student1.getGradeAverage();

        // System.out.println(students);
        Student student2 = new Student("Jeff");
        students.put("CoderGuy", student2);
        student2.addGrade(89);
        student2.addGrade(90);
        student2.addGrade(100);
        //  student2.getGradeAverage();
        Student student3 = new Student("Jim");
        students.put("InfiniteLooper", student3);
        student3.addGrade(70);
        student3.addGrade(89);
        student3.addGrade(75);
        //  student3.getGradeAverage();
        Student student4 = new Student("Billy");
        students.put("HelloWorld", student4);
        student4.addGrade(80);
        student4.addGrade(87);
        student4.addGrade(82);


        //   System.out.println(students);
        //  student4.getGradeAverage();
        // System.out.println(keySet);
        // System.out.println(students);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!\nHere are the Github usernames of our students:");
        System.out.println(keySet);
        System.out.println("What student would you like to see more information on?");
        String entry = sc.next();
        if (keySet.contains(entry)) {
            System.out.println("We do have him available!");
            System.out.println(students);
        }

//            System.out.printf("Im sorry, but no student found with the Github username of %s", entry);
//            System.out.println("Would you like to continue? Enter Yes/no");
//            String answer = sc.next();
//            if (answer.equalsIgnoreCase("yes")) {
//                return
        //  }

    }
}
