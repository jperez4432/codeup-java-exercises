import java.util.Arrays;
public class ArraysExercises {
    public static Person[] addPerson(Person[] array, Person newPerson) {
     Person[] people = Arrays.copyOf(array, array.length + 1);
     people[array.length] = newPerson;
     return people;
    }

    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Barry");
        people[1] = new Person("Deion");
        people[2] = new Person("Randy");
        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println("______");
        Person Jerry = new Person("Jerry");
        people = addPerson(people, Jerry);
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
