package shapes;

import java.util.Scanner;

public class Circle {
    private Scanner sc = new Scanner(System.in);
    private int Radius;


    public Circle(double radius) {

    }

    public double getArea() {
        System.out.println("The area of the circle is ");
    return Math.PI * (Radius * Radius);
    }

    public double getCircumference() {
        System.out.println("The circumference of the circle is ");
        return Math.PI * 2*Radius;
    }
}