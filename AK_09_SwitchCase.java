import java.util.Scanner;

public class AK_09_SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int first = input.nextInt();
        System.out.print("Enter your second number: ");
        int second = input.nextInt();
        System.out.println("Choose an operator: +, -, *, or /");
        char operator = input.next().charAt(0);
        int result;

        switch (operator) {

            case '+':
                result = first+second;
                System.out.println("The sum of first and second number is: "+result);
                break;
            case '-':
                result = first-second;
                System.out.println("The differenc of first and second number is: "+result);
                break;
            case '*':
                result = first*second;
                System.out.println("The multiplication of first and second number is: "+result);
                break;
            case '/':
                if(second==0) {
                    System.out.println("Zero divison is not allowed");
                }
                else {
                    result = first / second;
                    System.out.println("The divison of first and second number is: " + result);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }


    }
}
