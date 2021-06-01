package OOP;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Car {
    public static Scanner sc = new Scanner(System.in);
    public  String model;
    public  int year;
    public  String color;
    public void run() {
        System.out.println("The car is running");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        car1.color = "Black";
        car1.year = 2020;
        car1.model = "Toyota Camry";
        System.out.println(car1.model);

    }
}
