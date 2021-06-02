import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Person {
   // public String jan;
    private String name;

     public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
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
        // Person testPerson2 = new Person("Juan");
       //  Person alex = new Person("Alex");
       //  testPerson.name = setName();
        System.out.println(testPerson.getName());
        testPerson.setName("ramon");
        System.out.println(testPerson.getName());


      //  System.out.println(setName("Jason"));
        // System.out.println(testPerson.getName());
    }
}