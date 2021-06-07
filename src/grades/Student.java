package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private String username;
    private ArrayList<Integer> grades; // =  new ArrayList<>();

    public Student (String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getUsername() {
        return this.username = username;

    }

    public String getName() {
        return this.name = name;
    }
    public void getGrades() {
        System.out.println(grades);
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public int getGradeAverage() {
        int total = 0;
        for (int i = 0; i < grades.size(); i++) {
            total = total + grades.get(i);
        }
            int average = total / grades.size();
        //commented out to make sure the if statement works properly
            // System.out.printf("The Average is: %d\n", average);
            return average;
    }

    public static void main(String[] args) {
        Student e = new Student("Jeff");
        System.out.println(e.getName());
        e.addGrade(90);
        e.addGrade(100);
        e.addGrade(95);
        e.addGrade(80);
        e.getGrades();
        e.getGradeAverage();
    }

}
