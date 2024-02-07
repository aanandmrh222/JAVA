import java.util.Scanner;

public class AK_23_Armstrong {
    public static int power(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
//        System.out.println("Power of " + num1 + " is " + result);
        return result;
    }

    public static boolean armstrong(int number) {
        int noOfdigits = noOfDigits(number);
//        System.out.println("Number of digits: " + noOfdigits);
        int finalNumber = 0;
        int numberCopy = number;
        while (number>0) {
            int lastdigit = number%10;
            number /= 10;
            finalNumber += power(lastdigit,noOfdigits);
        }
//        System.out.println("Given number is " + number);
//        System.out.println("Final number is " + finalNumber);
        return finalNumber == numberCopy;
    }

    public static int noOfDigits(int number) {
        int digit = 0;
        while (number>0) {
            digit++;
            number /= 10;
        }
        return digit;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" -- Armstrong Number -- ");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean isArmstrong = armstrong(number);
        if(isArmstrong) {
            System.out.println("Your " + number + " is Armstrong Number");
        }
        else {
            System.out.println("Your " + number + " is not Armstrong Number");
        }

    }
}
