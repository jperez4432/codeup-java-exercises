import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[]  Person = {"Barry", "Deion", "Randy"};
      //  System.out.println(Arrays.toString(Person));
        for (String n : Person) {
            System.out.println(n);
        }

            Person[] people = new Person[3];
            System.out.println(Arrays.toString(people));

            people[0] = new Person("Evan");
            people[1] = new Person("Evan");
            people[2] = new Person("Evan");

            Person[] addPerson = Arrays.copyOf(people, 4);

            for (Person name : addPerson) {
                System.out.println(name);
            }

            Person[3] = "Juan";

    }
}
