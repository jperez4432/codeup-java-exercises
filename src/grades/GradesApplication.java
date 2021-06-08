package grades;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication extends Student {
    // private static Object Student;

    public GradesApplication(String name) {
        super(name);
    }

    public static String commandLine( ArrayList<String > list, HashMap <String, Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!\nHere are the Github usernames of our students:");
        System.out.println(list);
        System.out.println("What student would you like to see more information on?");
        String entry = sc.next();
        if (list.contains(entry)) {
            System.out.println("We do have him available!");
            System.out.println("Name: " + students.get(entry).getName());
            System.out.println("Username: " + entry);
            System.out.println("Grade average: " + students.get(entry).getGradeAverage());
        } else if (!list.contains(entry)) {
            System.out.printf("I'm sorry, but we do not have a user by the name of %s ", entry);
            System.out.println("would you like to try again? Enter Yes/No");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("OK!");
            }
        }
        return entry;
    }

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Set<String> keySet = students.keySet();


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
      //student4.getGradeAverage();
        ArrayList<String> usernameList = new ArrayList<String>(keySet);
        commandLine(usernameList, students);

    }
}


//           System.out.println(students);
//
//         System.out.println(keySet);
//         System.out.println(students);
//        do {
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome!\nHere are the Github usernames of our students:");
//        System.out.println(keySet);
//        System.out.println("What student would you like to see more information on?");
//        String entry = sc.next();
//        if (keySet.contains(entry)) {
//            System.out.println("We do have him available!");
//            System.out.println("Name:");
//            System.out.println(students.get(entry).getName());
//            System.out.println("Username:");
//            System.out.println(entry);
//            System.out.println("Grade Average:");
//            System.out.println(students.get(entry).getGradeAverage());
//        } else if (!keySet.contains(entry)) {
//            System.out.printf("I'm sorry, but we do not have a user by the name of %s ", entry);
//            System.out.println("would you like to try again? Enter Yes/No");
//            String answer = sc.next();
//            if (answer.equalsIgnoreCase("yes")) {
//
//            }
//        } while ()
//        }
