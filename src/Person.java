import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Person {
    private String name;

     public static String getName(String name) {
        return name;
    }

    public static void setName(String name) {

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
        System.out.println(getName(testPerson.name));
        // System.out.println(testPerson.getName());
    }
}