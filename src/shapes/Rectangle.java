package shapes;

//public class Rectangle {
//    protected int Length;
//    protected int Width;
//
//
//         int perimeter = (Length * 2) + (Width * 2);
//         int area = Length * Width;
//        System.out.println(perimeter);
//        System.out.println(area);
//
//
//        public static void main(String[] args) {
//        System.out.println(perimeter);
//
//    }
//}

public class Rectangle {
    public static void main(String arg[]) {
        RectangleSize rect = new RectangleSize(10, 5);

        System.out.println("Length = " + rect.length);
        System.out.println("Width = " + rect.Width);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
    }
}

class RectangleSize {
    protected  double length;
    protected double Width;

    RectangleSize(double length, double Width) {
        this.length = length;
        this.Width = Width;
    }

    double getArea() {
        return length * Width;
    }

    double getPerimeter() {
        return 2 * (length + Width);
    }
}