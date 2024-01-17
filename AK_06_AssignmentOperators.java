import java.util.Scanner;

public class AK_06_AssignmentOperators {
    public static void main(String[] args) {
        System.out.println("Assignment Operators");

        int myInt = 9;
        System.out.println(myInt);

        System.out.println("Swap Two number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        System.out.println("Before Swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
