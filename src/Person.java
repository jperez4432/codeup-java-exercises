import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Person {

    private String name;

     public static String getName(String name) {
        return name;
    }

    public static void setName(String name) {
         name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public Person(String name) {
         this.name = name;
    }

    public Person(){}

    public static void main(String[] args) {
         Person testPerson = new Person("Juan");
         Person testPerson2 = new Person("Juan");
         testPerson.name = setName();
        System.out.println(getName(testPerson.name));

      //  System.out.println(setName("Jason"));
        // System.out.println(testPerson.getName());
    }
}