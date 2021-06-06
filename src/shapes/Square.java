package shapes;

public class Square extends Quadrilateral {
    public Square(int length, int width) {
        super(length, width);
    }

    public int getArea() {
        return length * length;
    }

    public int getPerimeter() {
        return 4 * length;
    }

    public int setLength(int side) {
        return this.length = side;
    }

    public int setWidth(int side) {
        return this.width = side;
    }
}


//public class Square extends Rectangle {
//    double side;
//    public Square(double side) {
//        super();
//        this.side = side;
//        length = side;
//        width = side;
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println(side);
//        return side * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return side * 4;
//    }
//}
