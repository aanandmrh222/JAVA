import java.util.Scanner;

public class AK_18_PracticeSet {
    public static int sumOfOddNumbers(int num) {
        int i = 1;
        int sum = 0;
        while (i<=num) {
            sum = sum + i;
            i = i + 2;
        }
        return sum;
    }


    public static long factorial(int n) {
        if(n==0) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }


    public static int sumOfDigits(int n1) {
        int sum = 0;
        while(n1 > 0) {
            int digit = n1 % 10;
            sum = sum + digit;
            n1 = n1/10;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" -- Sum of odd numbers -- ");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Sum of "+ num + " natural odd number is " + sumOfOddNumbers(num));


        System.out.println(" -- Factorial Calculation -- ");
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("Factorial of "+ n +" is "+ factorial(n));


        System.out.println(" -- Sum of Digits -- ");
        System.out.print("Enter a number: ");
        int n1 = input.nextInt();
        System.out.println("Sum of the digit " + n1 + " is " + sumOfDigits(n1));
    }
}
