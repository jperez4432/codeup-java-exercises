package grades;
import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> students = new HashMap<>();
        ArrayList<Integer> juanGrades = new ArrayList<Integer>();
        ArrayList<Integer> coderGrades = new ArrayList<Integer>();

        juanGrades.add(100);
        juanGrades.add(90);
        juanGrades.add(95);
        students.put("jperez4432", juanGrades);
        coderGrades.add(80);
        coderGrades.add(85);
        coderGrades.add(89);
        students.put("Coder4Life", coderGrades);
//        students.put("HelloWorld", grades);
//        students.put("FastFingers", grades);

        System.out.println(students);

        //CLI


    }
}
