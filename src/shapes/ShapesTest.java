package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable rect = new Rectangle(5, 10);
        Measurable sq = new Square(5, 5);

        System.out.println("Your area is " + rect.getArea());
        System.out.println("Your perimeter is " + rect.getPerimeter());

        System.out.println("Your area is " + sq.getArea());
        System.out.println("Your perimeter is " + sq.getPerimeter());


        //previous entry before new exercise wanted deleted
//    Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println("Perimeter: " + box1.getPerimeter() + " Area: " + box1.getArea());

    }
}
