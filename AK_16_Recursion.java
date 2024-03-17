import java.util.Scanner;
public class AK_16_Recursion {
    public static long factorialFor(int num) {
        long ans = 1;
        for(int i=1; i<=num; i++) {
            ans *= i;
        }
        return ans;
    }

    public static long factorial(int n) {
        System.out.println("Function called for: "+n);
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int fibonacci(int position) {
        if(position==1) return 0;
        if(position==2) return 1;
        return fibonacci(position-1) + fibonacci(position-2);
    }

    public static boolean isPalindrome(String str) {
        if(str.length() <= 1) return true;
        int lastPosition = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastPosition)) {
            return false;
        }
        String newStr = str.substring(1, lastPosition);
        return isPalindrome(newStr);
    }


    public static void main(String[] args) {
        System.out.println("Recursion");
        Scanner input = new Scanner(System.in);

        System.out.println(" -- Factorial of a number -- ");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        long fact = factorialFor(num);
        System.out.println("Factorial of "+ num+ " is: "+fact);
        long fact1 = factorial(num);
        System.out.println("Factorial of "+ num+ " is: "+fact1);

        System.out.println(" -- Fibonacci Series -- ");
        System.out.print("Enter the number of elements to be printed: ");
        int count = input.nextInt();
        for(int i=1; i<=count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println(" -- Palindrome Checker -- ");
        System.out.print("Enter the string to be checked: ");
        String str = input.next();
        System.out.println("Your string is "+ (isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
    }
}
