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
        testPerson.sayHello();
//        testPerson.setName("ramon");
//        System.out.println(testPerson.getName());
//        testPerson.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

      //  System.out.println(setName("Jason"));
        // System.out.println(testPerson.getName());
    }
}