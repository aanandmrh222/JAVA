import java.util.Scanner;

public class AK_65_PracticeSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        try {
            int result = first/second;
            System.out.printf("Result is %d",result);
        }
        catch (ArithmeticException e) {
            if(e.getMessage().equals("/ by zero")) {
                System.out.println("Divide by zero is occurred");
            }
            else {
                throw e;
            }
        }

    }
}
