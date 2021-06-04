package shapes;

public class Square extends Rectangle {
    double side;
    public Square(double side) {
        super();
        this.side = side;
        length = side;
        width = side;
    }

    @Override
    public double getArea() {
        System.out.println(side);
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
