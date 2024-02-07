import java.util.Scanner;

public class AK_19_PracticeSet {
    public static int lcm(int num1, int num2) {
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if(factor %num2 == 0) {
                return factor;
            }
            i++;
        }
    }


    public static int gcd(int first, int second) {
        int gcd = 1;
        int i = 2;
        int least = least(first, second);
        while (i <= least) {
            if(first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if(num1<num2) {
            return num1;
        }
        else {
            return num2;
        }
    }


    public static boolean prime(int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" -- LCM of two numbers -- ");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        int lcm = lcm(num1,num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);


        System.out.println(" -- GCD of two numbers -- ");
        System.out.print("Enter your first number: ");
        int first = input.nextInt();
        System.out.print("Enter your second number: ");
        int second = input.nextInt();
        int gcd = gcd(first,second);
        System.out.println("GCD of " + first + " and " + second + " is " + gcd);


        System.out.println(" -- Prime number checker -- ");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean isPrime = prime(number);
        if (isPrime) {
            System.out.println(number + " is prime");
        }
        else {
            System.out.println(number + " is not prime");
        }


    }
}
