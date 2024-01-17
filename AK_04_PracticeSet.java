import java.util.Scanner;

public class AK_04_PracticeSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = input.nextInt();
        System.out.print("Enter your second number: ");
        int b = input.nextInt();

        System.out.println("The sum of first and second number is: "+ a+b);    // This is not correct way
        System.out.println("The sum of first and second number is: "+ (a+b));

        int c = a+b;
        System.out.println("The sum of "+a+" and "+b+" is: "+ c);





    }
}
