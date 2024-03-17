import java.util.Scanner;

public class AK_17_MbPracticeSet {
    String name;
    int age;
    int rollNumber;

    public AK_17_MbPracticeSet(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student Details:{name: "+name+", age: "+age+", rollNumber: "+rollNumber+"}";
    }

    double radius;
    AK_17_MbPracticeSet(double radius) {
        this.radius = radius;
    }
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }


    public static void main(String[] args) {
        AK_17_MbPracticeSet stu = new AK_17_MbPracticeSet("Aanand",18,36);
        System.out.println(stu.toString());
        System.out.println(stu);

        String firstName = "Aanand";
        String lastName = "Kumar";
//        String fullName = firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double radius = input.nextDouble();
        AK_17_MbPracticeSet cir = new AK_17_MbPracticeSet(radius);
        System.out.println("The Circumference of the circle is: "+ cir.getCircumference());
        System.out.println("The Area of the circle is: "+ cir.getArea());

    }
}
