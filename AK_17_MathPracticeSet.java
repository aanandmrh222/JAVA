import java.util.Scanner;

public class AK_17_MathPracticeSet {
    double radius;
    AK_17_MathPracticeSet(double radius) {
        this.radius = radius;
    }
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double radius = input.nextDouble();
        AK_17_MathPracticeSet cir = new AK_17_MathPracticeSet(radius);
        System.out.println("The Circumference of the circle is: "+ cir.getCircumference());
        System.out.println("The Area of the circle is: "+ cir.getArea());

    }
}
