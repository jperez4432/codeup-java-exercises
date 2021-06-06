package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }



    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    public int getArea() {
        return length * width;
    }

    public int setLength(int length) {
        return this.length = length;
    }


    public int setWidth(int width) {
        return this.width = width;
    }
}





//public class Rectangle {
//    protected double length;
//    protected double width;
//
//    Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle() {
//
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return ((length * 2) + (width * 2));
//    }
//}