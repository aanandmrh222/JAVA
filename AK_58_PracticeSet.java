abstract class Shape1{
    public abstract double calculateArea();
}

class Circle1 extends Shape1 {
    private final double radius;
    public Circle1(double radius) {
        this.radius = radius;
    }
//    public double getRadius() {
//        return radius;
//    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Square1 extends Shape1 {
    private final double side;
    public Square1(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
}


public class AK_58_PracticeSet {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(5);
        System.out.printf("Area of the circle is: %5.2f",circle.calculateArea());

        Square1 square = new Square1(5);
        System.out.printf("\nArea of the square is: %5.2f",square.calculateArea());
    }
}
