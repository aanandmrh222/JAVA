import java.util.Scanner;
public class AK_21_Palindrome {

    public static int reverseNumDigit(int n) {
        int newNum = 0;
        while (n > 0) {
            int digit = n % 10;
            newNum = newNum * 10 + digit;
            n = n/10;
        }
        return newNum;
    }

    public static boolean Palindrome(int num) {
        int rev = reverseNumDigit(num);
        return rev == num;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" -- Reverse the number -- ");
        System.out.print("Enter your number: ");
        int number1 = input.nextInt();
        int number2 = reverseNumDigit(number1);
        System.out.println("Reverse number is " + number2);


        System.out.println(" -- Palindrome -- ");
        System.out.print("Enter a number: ");
        int num25 = input.nextInt();
        boolean isPalindrome = Palindrome(num25);
        if(isPalindrome) {
            System.out.println(num25 + " is Palindrome number");
        }
        else {
            System.out.println(num25 + " is not Palindrome number");
        }


    }
}
