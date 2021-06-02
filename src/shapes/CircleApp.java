package shapes;
import util.Input;
import java.util.Scanner;

public class CircleApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Input in = new Input();

        Circle c = new Circle(in.getDouble());

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());


//        double radius = sc.nextDouble();
//
//        double area = Math.PI * (radius * radius);
//        System.out.println("The area of this circle is " + area);
//
//        double circumference = Math.PI * 2 * radius;
//        System.out.println("The circumference of the circle is " + circumference);
    }
}
