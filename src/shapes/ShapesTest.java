package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5, 10);
        Measurable myShape2 = new Square(5, 5);

        System.out.println("Your area is " + myShape.getArea());
        System.out.println("Your perimeter is " + myShape.getPerimeter());

        System.out.println("Your area is " + myShape2.getArea());
        System.out.println("Your perimeter is " + myShape2.getPerimeter());




//    Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println("Perimeter: " + box1.getPerimeter() + " Area: " + box1.getArea());

    }
}
