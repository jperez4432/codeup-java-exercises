package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication extends Student{
    public GradesApplication(String name) {
        super(name);
    }
    //extended for the possible use of the get average method.

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        //try to use this for all so i can extend the method from Students
       // ArrayList<Integer> grades = new ArrayList<Integer>();
        Student student1 = new Student("Juan");
        students.put("jperez4432", student1);
        student1.addGrade(90);
        student1.addGrade(95);
        student1.addGrade(93);
        student1.getGradeAverage();
        Student student2 = new Student("Jeff");
        students.put("CoderGuy", student2);
        student2.addGrade(89);
        student2.addGrade(90);
        student2.addGrade(100);
        student2.getGradeAverage();


//        ArrayList<Integer> juanGrades = new ArrayList<Integer>();
//        ArrayList<Integer> coderGrades = new ArrayList<Integer>();
//        ArrayList<Integer> HWGrades = new ArrayList<Integer>();
//        ArrayList<Integer> FFGrades = new ArrayList<Integer>();

//        public void commandLine () {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Welcome!\nHere are the github usernames" + students);
//            System.out.println("What student would you like to see more information on?");
//            String entry = sc.nextLine();
//            // need to get students usernames as a string to match with user entry
//            if (entry != students.toString()) {
//                System.out.println("Sorry, no student found with the GitHub username of " + entry);
//                System.out.println("Would you like to try again? Y/N");
//                String answer = sc.next();
//                if (answer.equalsIgnoreCase("y")) {
//                    commandLine();
//                } else {
//                    System.out.println("Have a nice day!");
//                }
//            } else if (entry == students.toString()){
//                System.out.println(students.toString());
//            }
//        }

//
//        juanGrades.add(100);
//        juanGrades.add(90);
//        juanGrades.add(95);
//        students.put("jperez4432", juanGrades);
//        coderGrades.add(80);
//        coderGrades.add(85);
//        coderGrades.add(89);
//        students.put("Coder4Life", coderGrades);
//        HWGrades.add(70);
//        HWGrades.add(75);
//        HWGrades.add(79);
//        students.put("HelloWorld", HWGrades);
//        FFGrades.add(92);
//        FFGrades.add(94);
//        FFGrades.add(98);
//        students.put("FastFingers", FFGrades);


//        int total = 0;
//        for (int i = 0; i < students.size(); i++) {
//          //  total = total + students.get(i);
//        }
//        int average = total / students.size();
//        System.out.printf("The Average is: %d", average);


       // System.out.println(students);

        //CLI
    }
}
