package shapes;
import util.Input;
import java.util.Scanner;

public class CircleApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       // System.out.println("Enter the radius of the circle: ");
        Input in = new Input();

        Circle c = new Circle(in.getDouble());

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());

    }
}
